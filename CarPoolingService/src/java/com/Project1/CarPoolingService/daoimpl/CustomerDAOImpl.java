/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.daoimpl;
import com.Project1.CarPoolingService.dao.CustomerDAO;
import com.Project1.CarPoolingService.entities.Customer;
import java.sql.Connection;
import java.sql.Date;
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
public  class CustomerDAOImpl implements CustomerDAO {

    @Override
    public int addCustomer(Customer customer) {
       int count=0;
        try {
            //return addEmployee(employee);
            Connection con = DerbyConnection.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement("insert into Customer(customerName,customerContact,customerGender,customerEmail,customerAddress,customerDateOfBirth,customerPassword) values(?,?,?,?,?,?,?)");
       preparedStatement.setString(1,customer.getCustomerName());
        preparedStatement.setString(2,customer.getCustomerContact());
        preparedStatement.setString(3,customer.getCustomerGender());
        preparedStatement.setString(4,customer.getCustomerEmail());
        preparedStatement.setString(5,customer.getCustomerAddress());
        java.util.Date customerDateOfBirth =new java.util.Date(customer.getCustomerDateOfBirth());
        preparedStatement.setDate(6, new Date(customerDateOfBirth.getYear(),customerDateOfBirth.getMonth(),customerDateOfBirth.getDate()));
        preparedStatement.setString(7,customer.getCustomerPassword());
        count = preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteCustomer(int customerID) {
        int count=0;
        try {
            Connection con=DerbyConnection.getConnection();
            PreparedStatement preparedstatement=con.prepareStatement("Delete from Customer where customerID=?");
            
            preparedstatement.setInt(1,customerID);
            count=preparedstatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;  
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = null;
        try {
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedstatement = con.prepareStatement("select * from Customer");
            ResultSet resultSet = preparedstatement.executeQuery();
              customerList = new ArrayList<Customer>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   int customerID =resultSet.getInt(1) ;
                   String customerName=resultSet.getString(2);
                 String customerContact=resultSet.getString(3) ;
                   String customerGender=resultSet.getString(4);
                   String customerEmail=resultSet.getString(5);
                   String customerAddress=resultSet.getString(6);
                   String customerDateOfBirth = resultSet.getDate(7).toString();
                    String customerPassword=resultSet.getString(8);
                   

                       
                    Customer customer = new Customer(customerID,customerName,customerContact,customerGender,customerEmail,customerAddress,customerDateOfBirth,customerPassword);
                    customerList.add(customer);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return customerList;
       
    }
    
    
    
    @Override
    public Customer getCustomerByID(int customerID) {
        List<Customer> customerList = null;
        try {
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedstatement = con.prepareStatement("select * from Customer where customerID=?");
            preparedstatement.setInt(1, customerID);
            ResultSet resultSet = preparedstatement.executeQuery();
              customerList = new ArrayList<Customer>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   int customerId = resultSet.getInt(1);
                   String customerName=resultSet.getString(2);
                   String customerContact=resultSet.getString(3) ;
                   String customerGender=resultSet.getString(4);
                   String customerEmail=resultSet.getString(5);
                   String customerAddress=resultSet.getString(6);
                   String customerDateOfBirth=resultSet.getDate(7).toString();
                      String customerPassword=resultSet.getString(8);

                    
                Customer customer = new Customer(customerId,customerName,customerContact,customerGender,customerEmail,customerAddress,customerDateOfBirth,customerPassword);
                customerList.add(customer);
                }
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(customerList.size()>0) return customerList.get(0);
        else return null;
       
     }

    @Override
    public int updateCustomer(int customerID, Customer customer) {
       int count=0;
        try {
            Connection con  = DerbyConnection.getConnection();
            PreparedStatement preparedstatement = con.prepareStatement("update Customer set customerName=?,customerContact=?,customerGender=?,customerEmail=?,customerAddress=?,customerDateOfBirth=? customerPassword=? where customerID=?");
            preparedstatement.setString(1,customer.getCustomerName());
             preparedstatement.setString(2,customer.getCustomerContact());
             preparedstatement.setString(3,customer.getCustomerGender());
             preparedstatement.setString(4,customer.getCustomerEmail());
             preparedstatement.setString(5,customer.getCustomerAddress());
             java.util.Date customerDateOfBirth=new java.util.Date(customer.getCustomerDateOfBirth());
            preparedstatement.setDate(6,new Date(customerDateOfBirth.getYear(),customerDateOfBirth.getMonth(),customerDateOfBirth.getDate()));
             preparedstatement.setString(7,customer.getCustomerPassword());
            preparedstatement.setInt(8,customer.getCustomerID());
            count= preparedstatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

   
    @Override
    public boolean isUserValid(String customerEmail, String customerPassword) {
    try{
            Connection con = DerbyConnection.getConnection(); 
            PreparedStatement preparedStatement = con.prepareStatement("select * from Customer where customerEmail=? and customerPassword=?");
            preparedStatement.setString(1, customerEmail);
            preparedStatement.setString(2, customerPassword);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet !=null){
             return resultSet.next();
            }
               
        }
        catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Not Logging In");
        return false;
    }
    
}
    

    

    