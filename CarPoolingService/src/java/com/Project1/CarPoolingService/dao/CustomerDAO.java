/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.dao;

import com.Project1.CarPoolingService.entities.Customer;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public interface CustomerDAO { 
    int addCustomer(Customer customer);
     int deleteCustomer(int customerID);
     List<Customer> getAllCustomers();
     Customer getCustomerByID (int customerID);
     boolean validate(String Email,String Password);
     int updateCustomer(int customerID,Customer customer);

   
}
