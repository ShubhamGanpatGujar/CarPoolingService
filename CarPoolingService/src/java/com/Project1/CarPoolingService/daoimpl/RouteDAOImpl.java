/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.daoimpl;

import com.Project1.CarPoolingService.dao.RouteDAO;
import com.Project1.CarPoolingService.entities.Route;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHUBHAM
 */
public class RouteDAOImpl implements RouteDAO {

    @Override
    public int addRoute(Route route) {
     int count=0;
        try {
            //return addEmployee(employee);
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("insert into Route(startLocation,destination,distance) values(?,?,?)");
            preparedStatement.setString(1,route.getStartLocation());
            preparedStatement.setString(2,route.getDestination());
            preparedStatement.setInt(3,route.getDistance());
            count = preparedStatement.executeUpdate();
           
                     
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
       
    }

    @Override
    public int deleteRoute(int routeID) {
        int count=0;
        try {
            
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("delete from Route where routeID=?");
            preparedStatement.setInt(1,routeID);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    }

    @Override
    public List<Route> getAllRoute() {
        List<Route> routeList = null;
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Route");
            ResultSet resultSet = preparedStatement.executeQuery();
              routeList = new ArrayList<Route>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int routeID=resultSet.getInt(1);
                    String startLocation= resultSet.getString(2);
                     String destination= resultSet.getString(3);
                    int distance = resultSet.getInt(4);
                    Route route = new Route(routeID,startLocation,destination,distance);
                    routeList.add(route);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(RouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return routeList;
       
    }

    @Override
    public Route getRouteByID(int routeID) {
           List<Route> routeList = null;
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Route where routeID=?");
            preparedStatement.setInt(1, routeID);
            ResultSet resultSet = preparedStatement.executeQuery();
              routeList = new ArrayList<Route>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                 int routeId=resultSet.getInt(1);
                    String startLocation= resultSet.getString(2);
                     String destination= resultSet.getString(3);
                    int distance = resultSet.getInt(4);
                   
                    Route route = new Route(routeID,startLocation,destination,distance);
                    routeList.add(route);

                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(routeList.size()>0) return routeList.get(0);
     else return null;
    }


    

    @Override
    public int updateRoute(int routeID, Route route) {
        int count=0;
        try {
            Connection con  = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("update Route set startLocation=?, Destination=? ,Distance=? where routeID=?");
           
            preparedStatement.setString(1,route.getStartLocation());
            preparedStatement.setString(2,route.getDestination());
            preparedStatement.setInt(3,route.getDistance());
                  preparedStatement.setInt(4,routeID);
            count = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(RouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}

    
    
}
