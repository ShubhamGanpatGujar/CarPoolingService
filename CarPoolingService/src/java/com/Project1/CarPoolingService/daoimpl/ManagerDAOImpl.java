/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.daoimpl;

import com.Project1.CarPoolingService.dao.ManagerDAO;
import com.Project1.CarPoolingService.entities.Manager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHUBHAM
 */
public class ManagerDAOImpl implements ManagerDAO {

    


    @Override
    public boolean isUserValid(String managerEmail, String managerPassword) {
       try{
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = con.prepareStatement("select * from Manager where managerEmail=? and managerPassword=?");
            preparedStatement.setString(1, managerEmail);
            preparedStatement.setString(2, managerPassword);
            System.out.println("hello manger....");
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet !=null){
             return resultSet.next();
            }
                System.out.println("hello manger....");
        }
        catch (SQLException ex) {
            Logger.getLogger(ManagerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Not Logging In");
        return false;
    }

    @Override
    public int addCustomer(Manager manager) {
        int count=0;
        try {
           
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("insert into Manager(managerEmail,managerPassword) values(?,?)");
       preparedStatement.setString(1,manager.getManagerEmail());
        preparedStatement.setString(2,manager.getManagerPassword());
        count = preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int addManager(Manager manager) {
        int count=0;
        try {
           
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("insert into Manager(managerEmail,managerPassword) values(?,?)");
       preparedStatement.setString(1,manager.getManagerEmail());
        preparedStatement.setString(2,manager.getManagerPassword());
        count = preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(ManagerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
   
    
}
    
