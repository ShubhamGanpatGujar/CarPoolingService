/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.daoimpl;

import com.Project1.CarPoolingService.dao.PickUpDAO;
import com.Project1.CarPoolingService.entities.PickUp;
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
public class PickUpDAOImpl implements PickUpDAO {

    @Override
    public int addPickUp(PickUp pickup) {
     int count=0;
        try {
            //return addEmployee(employee);
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("insert into PickUp(pickupPoint,routeID) values(?,?)");
            preparedStatement.setString(1,pickup.getPickupPoint());
            preparedStatement.setInt(2,pickup.getRouteID());
            count = preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PickUpDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deletePickUp(int pickupID) {
        int count=0;
        try {
            
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("delete from PickUp where pickupID=?");
            preparedStatement.setInt(1,pickupID);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PickUpDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<PickUp> getAllPickUp() {
      List<PickUp> pickupList = null;
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from PickUp");
            ResultSet resultSet = preparedStatement.executeQuery();
              pickupList = new ArrayList<PickUp>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int pickupID=resultSet.getInt(1);
                    String pickupPoint = resultSet.getString(2);
                    int routeID = resultSet.getInt(3);
                    PickUp pickup = new PickUp(pickupID,pickupPoint,routeID);
                    pickupList.add(pickup);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(PickUpDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return pickupList;
       
    }  
       
                    

    @Override
    public PickUp getPickUpByID(int pickupID) {
          List<PickUp> pickupList = null;
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from PickUp where pickupID=?");
            preparedStatement.setInt(1, pickupID);
            ResultSet resultSet = preparedStatement.executeQuery();
            pickupList = new ArrayList<PickUp>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int pickupId=resultSet.getInt(1);
                    String pickupPoint = resultSet.getString(2);
                    int routeID = resultSet.getInt(3);
                   
                    PickUp pickup = new PickUp(pickupID,pickupPoint ,routeID);
                    pickupList.add(pickup);

                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PickUpDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(pickupList.size()>0) return pickupList.get(0);
     else return null;
    }


    @Override
    public int updatePickUp(int pickupID, PickUp pickup) {
        int count=0;
        try {
            Connection con  = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("update PickUp set pickupPoint=?, routeID=? where pickupID=?");
            preparedStatement.setString(1,pickup.getPickupPoint());
            preparedStatement.setInt(2,pickup.getRouteID());
            preparedStatement.setInt(3,pickup.getPickupID());
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PickUpDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
}
    

    

