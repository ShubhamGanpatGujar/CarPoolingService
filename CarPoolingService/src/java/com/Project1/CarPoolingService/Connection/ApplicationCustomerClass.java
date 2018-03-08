/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.CustomerDAO;
import com.Project1.CarPoolingService.daoimpl.CustomerDAOImpl;
import com.Project1.CarPoolingService.entities.Customer;
import java.util.List;







/**
 *
 * @author SHUBHAM
 */
public class ApplicationCustomerClass {
    public static void main(String[] args){
        
        CustomerDAO customerDAO = new CustomerDAOImpl();
       int count;
       count = customerDAO.addCustomer(new Customer(1,"Amay",231456789,"male","Amay43@","borivali","07/11/2015"));
       if(count>0)System.out.println("Record Added Successfully");
      else System.out.println("Record Failed to get added");
        // count=customerDAO.deleteCustomer(1);
        //if(count>0)System.out.println("Record Deleted Successfully");
        //  else System.out.println("Record Failed to get deleted");
       // Customer customer = new Customer(12,"Amit",44578987,"male","Amit43@","borivali","07/11/2015");
       //  count=customerDAO.updateCustomer(12, customer);
       // if(count>0)System.out.println("Record Updated Successfully");
      // else System.out.println("Record Failed to get updated");
       // List<Customer> customerlist = customerDAO.getAllCustomers();
       // for(Customer cust: customerlist){
         //   System.out.println(cust.getCustomerID()+ "|" + cust.getCustomName()+ "|" + cust.getCustomerContact() + "|" + cust.getCustomerGender()+ "|" + cust.getCustomerEmail()+ "|" + cust.getCustomerAddress() + "|" + cust.getCustomerDateOfBirth());
       // }
       // Customer cust = customerDAO.getCustomerByID(6);
      //     System.out.println(cust.getCustomerID()+ "|" + cust.getCustomName()+ "|" + cust.getCustomerContact() + "|" + cust.getCustomerGender()+ "|" + cust.getCustomerEmail()+ "|" + cust.getCustomerAddress() + "|" + cust.getCustomerDateOfBirth());
    
    }
}

