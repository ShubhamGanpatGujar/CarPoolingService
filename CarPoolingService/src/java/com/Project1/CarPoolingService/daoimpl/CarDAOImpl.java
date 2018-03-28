/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.daoimpl;


import com.Project1.CarPoolingService.dao.CarDAO;
import com.Project1.CarPoolingService.entities.Car;
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
public class CarDAOImpl implements CarDAO {

    @Override
    public int addCar(Car car) {
    int count=0;
        try {
            //return addEmployee(employee);
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("insert into Car(carNo,carModel,CarAC,carSeating) values(?,?,?,?)");
            preparedStatement.setString(1,car.getCarNo());
            preparedStatement.setString(2,car.getCarModel());
            preparedStatement.setString(3,car.getCarAC());
            preparedStatement.setInt(4,car.getCarSeating());
            count = preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
           
    }

    @Override
    public int deleteCar(int carID) {
         int count=0;
        try {
            
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("delete from Car where carID=?");
            preparedStatement.setInt(1,carID);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    
    }

    @Override
    public List<Car> getAllCar() {
     List<Car> carList = null;
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Car");
            ResultSet resultSet = preparedStatement.executeQuery();
              carList = new ArrayList<Car>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int carID=resultSet.getInt(1);
                   String carNo=resultSet.getString(2);
                    String carModel= resultSet.getString(3);
                    String carAC= resultSet.getString(4);
                    int carSeating = resultSet.getInt(5);
                   Car car = new Car(carID,carNo,carModel,carAC,carSeating);
                    carList.add(car);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return carList;
         
    }

    @Override
    public Car getCarByID(int carID) {
         List<Car> carList = null;
           
        try {
            Connection connection = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Car where carID=?");
            preparedStatement.setInt(1, carID);
            ResultSet resultSet = preparedStatement.executeQuery();
              carList = new ArrayList<Car>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int carId=resultSet.getInt(1);
                    String carNo=resultSet.getString(2);
                    String carModel= resultSet.getString(3);
                    String carAC= resultSet.getString(4);
                    int carSeating = resultSet.getInt(5);
                   Car car = new Car(carID,carNo,carModel,carAC,carSeating);
                    carList.add(car);

                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(carList.size()>0) return carList.get(0);
     else return null;
    }


    @Override
    public int updateCar(int carID, Car car) {
      int count=0;
        try {
            Connection con  = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("update Car set carNo=?,carModel=?,carAC=?, carSeating=? where carID=?");
        
            preparedStatement.setString(1,car.getCarNo());
            preparedStatement.setString(2,car.getCarModel());
            preparedStatement.setString(3,car.getCarAC());
            preparedStatement.setInt(4,car.getCarSeating());
            preparedStatement.setInt(5,carID);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
      
    }

} 