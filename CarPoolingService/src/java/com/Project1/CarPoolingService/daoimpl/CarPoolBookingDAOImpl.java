/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.daoimpl;

import com.Project1.CarPoolingService.dao.CarPoolBookingDAO;
import com.Project1.CarPoolingService.entities.CarPoolBooking;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHUBHAM
 */
public class CarPoolBookingDAOImpl implements CarPoolBookingDAO {


    @Override
    public int addCarPoolBooking(CarPoolBooking carpoolbooking) {
    int count=0;
        try {  
            Connection con=DerbyConnection.getConnection();
            PreparedStatement preparedStatement=con.prepareStatement("insert into CarPoolBooking(invoiceID,invoiceDate,carID,carpoolbookingDate,carpoolbookingTime,customerID,routeID,numberofPassenger) values(?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,carpoolbooking.getInvoiceID());
            java.util.Date Invoicedate =new java.util.Date(carpoolbooking.getInvoiceDate());
            preparedStatement.setDate(2, new Date(Invoicedate.getYear(),Invoicedate.getMonth(),Invoicedate.getDate()));
            preparedStatement.setInt(3,carpoolbooking.getCarID());
           java.util.Date carpoolbookingdate =new java.util.Date(carpoolbooking.getCarpoolbookingDate());
            preparedStatement.setDate(4, new Date(carpoolbookingdate.getYear(),carpoolbookingdate.getMonth(),carpoolbookingdate.getDate()));
            preparedStatement.setString(5,carpoolbooking.getCarpoolbookingTime());
            preparedStatement.setInt(6,carpoolbooking.getCustomerID());
            preparedStatement.setInt(7,carpoolbooking.getRouteID());
            preparedStatement.setInt(8,carpoolbooking.getNumberofPassenger());
            
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return count;
       
    }

    @Override
    public int deleteCarPoolBooking(int carpoolbookingID) {
         int count=0;
            
        try {
            Connection con=DerbyConnection.getConnection();
           PreparedStatement preparedStatement = con.prepareStatement("delete from CarPoolBooking where carpoolbookingID=?");
           preparedStatement.setInt(1,carpoolbookingID);
           count=preparedStatement.executeUpdate();
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
            
    }

    @Override
    public List<CarPoolBooking> getAllCarPoolBooking() {
         List<CarPoolBooking> carpoolbookingList = null;
        try {
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = con.prepareStatement("select * from CarPoolBooking");
            ResultSet resultSet = preparedStatement.executeQuery();
             carpoolbookingList = new ArrayList<CarPoolBooking>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   int invoiceID =resultSet.getInt(1) ;
                   String invoiceDate=resultSet.getString(2);
                   int carID=resultSet.getInt(3) ;
                   int carpoolbookingID=resultSet.getInt(4);
                   String carpoolbookingDate=resultSet.getString(5).toString();
                   String carpoolbookingTime=resultSet.getString(6);
                   int customerID =resultSet.getInt(1) ;
                   int routeID =resultSet.getInt(1) ;
                   int numberofPassenger =resultSet.getInt(1) ;
                   
                    
                    CarPoolBooking carpoolbooking= new CarPoolBooking(invoiceID,invoiceDate,carID,carpoolbookingID,carpoolbookingDate,carpoolbookingTime,customerID,routeID,numberofPassenger);
                    carpoolbookingList.add(carpoolbooking);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return carpoolbookingList;
       
}
    @Override
    public CarPoolBooking getCarPoolBookingByID(int carpoolbookingID) {
         List<CarPoolBooking> carpoolbookingList = null;
        try {
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = con.prepareStatement("select * from CarPoolBooking where carpoolbookingID=?");
            preparedStatement.setInt(1, carpoolbookingID);
            ResultSet resultSet = preparedStatement.executeQuery();
              carpoolbookingList = new ArrayList<CarPoolBooking>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                     int invoiceID =resultSet.getInt(1) ;
                   String invoiceDate=resultSet.getString(2);
                   int carID=resultSet.getInt(3) ;
                   int carpoolbookingId=resultSet.getInt(4);
                   String carpoolbookingDate=resultSet.getString(5).toString();
                   String carpoolbookingTime=resultSet.getString(6);
                   int customerID =resultSet.getInt(1) ;
                   int routeID =resultSet.getInt(1) ;
                   int numberofPassenger =resultSet.getInt(1) ;
                   
                    
                    CarPoolBooking carpoolbooking= new CarPoolBooking(invoiceID,invoiceDate,carID,carpoolbookingID,carpoolbookingDate,carpoolbookingTime,customerID,routeID,numberofPassenger);
                    carpoolbookingList.add(carpoolbooking);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(carpoolbookingList.size()>0) return carpoolbookingList.get(0);
        else return null;
       
    }

    @Override
    public int updateCarPoolBooking(int carpoolbookingID, CarPoolBooking carpoolbooking) {
         int count=0;
        try {
            Connection con  = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("update CarPoolBooking set invoiceID=?,invoiceDate=?,carID=?,carpoolbookingDate=?,carpoolbookingTime=?,customerID=?,routeID=?,numberofPassenger=? where carpoolbookingID=?");
            preparedStatement.setInt(1,carpoolbooking.getInvoiceID());
            java.util.Date Invoicedate =new java.util.Date(carpoolbooking.getInvoiceDate());
            preparedStatement.setDate(2, new Date(Invoicedate.getYear(),Invoicedate.getMonth(),Invoicedate.getDate()));
            preparedStatement.setInt(3,carpoolbooking.getCarID());
            java.util.Date carpoolbookingdate =new java.util.Date(carpoolbooking.getCarpoolbookingDate());
            preparedStatement.setDate(4, new Date(carpoolbookingdate.getYear(),carpoolbookingdate.getMonth(),carpoolbookingdate.getDate()));
            preparedStatement.setString(5, carpoolbooking.getCarpoolbookingTime());
            preparedStatement.setInt(6,carpoolbooking.getCustomerID());
            preparedStatement.setInt(7,carpoolbooking.getRouteID());
            preparedStatement.setInt(8,carpoolbooking.getNumberofPassenger());
            preparedStatement.setInt(9,carpoolbooking.getCarpoolbookingID());
            
            count=preparedStatement.executeUpdate();
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CarPoolBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    }
    
}
