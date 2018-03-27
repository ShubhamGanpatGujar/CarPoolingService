/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.daoimpl;

import com.Project1.CarPoolingService.dao.CarPoolRouteDAO;
import com.Project1.CarPoolingService.entities.CarPoolRoute;
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
public class CarPoolRouteDAOImpl implements CarPoolRouteDAO{

   @Override
    public int addCarPoolRoute(CarPoolRoute carpoolroute) {
          int count=0;
        try {
            //return addEmployee(employee);
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("insert into CarPoolRoute(routeID,passengerCapacity,price) values(?,?,?)");
            preparedStatement.setInt(1,carpoolroute.getRouteID());
            preparedStatement.setInt(2,carpoolroute.getPassengerCapacity());
            preparedStatement.setInt(3,carpoolroute.getPrice());
            count = preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolRouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
       
    }

    

    @Override
    public int deleteCarPoolRoute(int carpoolrouteID) {
      int count=0;
        try {
            
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("delete from CarPoolRoute where carpoolrouteID=?");
            preparedStatement.setInt(1,carpoolrouteID);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolRouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    
    }

    @Override
    public List<CarPoolRoute> getAllCarPoolRoute() {
         List<CarPoolRoute> carpoolrouteList = null;
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from CarPoolRoute");
            ResultSet resultSet = preparedStatement.executeQuery();
              carpoolrouteList = new ArrayList<CarPoolRoute>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int carpoolrouteID=resultSet.getInt(1);
                    int routeID= resultSet.getInt(2);
                    int passengerCapacity= resultSet.getInt(3);
                    int price = resultSet.getInt(4);
                    CarPoolRoute carpoolroute = new CarPoolRoute(carpoolrouteID,routeID,passengerCapacity,price);
                    carpoolrouteList.add(carpoolroute);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolRouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return carpoolrouteList;
       
    }


    @Override
    public CarPoolRoute getCarPoolRouteByID(int carpoolrouteID) {
           List<CarPoolRoute> carpoolrouteList = null;
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from CarPoolRoute where carpoolrouteID=?");
            preparedStatement.setInt(1, carpoolrouteID);
            ResultSet resultSet = preparedStatement.executeQuery();
            carpoolrouteList = new ArrayList<CarPoolRoute>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                  int carpoolrouteId=resultSet.getInt(1);
                    int routeID= resultSet.getInt(2);
                    int passengerCapacity= resultSet.getInt(3);
                    int price = resultSet.getInt(4);
                    CarPoolRoute carpoolroute = new CarPoolRoute(carpoolrouteID,routeID,passengerCapacity,price);
                    carpoolrouteList.add(carpoolroute);

                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolRouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(carpoolrouteList.size()>0) return carpoolrouteList.get(0);
     else return null;
    

    }
    

    @Override
    public int updateCarPoolRoute(int carpoolrouteID, CarPoolRoute carpoolroute) {
      int count=0;
        try {
            Connection con  = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("update CarPoolRoute set routeID=?, passengerCapacity=? ,price=? where carpoolrouteID=?");
           
            preparedStatement.setInt(1,carpoolroute.getRouteID());
            preparedStatement.setInt(2,carpoolroute.getPassengerCapacity());
            preparedStatement.setInt(3,carpoolroute.getPrice());
             preparedStatement.setInt(4,carpoolroute.getCarpoolrouteID());
            count = preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolRouteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
}
    }
   


   

