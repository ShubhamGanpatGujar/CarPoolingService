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
//       count = customerDAO.addCustomer(new Customer(1,"Smita",231454159,"female","Smita43@gmail.com","borivali","07/11/2015","S123456"));
//       if(count>0)System.out.println("Record Added Successfully");
//      else System.out.println("Record Failed to get added");
        // count=customerDAO.deleteCustomer(1);
        //if(count>0)System.out.println("Record Deleted Successfully");
        //  else System.out.println("Record Failed to get deleted");
        Customer customer = new Customer(1,"Smita","9875894512","female","Smita143@gmail.com","borivali","07/12/2015","S123456");
         count=customerDAO.updateCustomer(1, customer);
        if(count>0)System.out.println("Record Updated Successfully");
       else System.out.println("Record Failed to get updated");
        List<Customer> customerlist = customerDAO.getAllCustomers();
        for(Customer cust: customerlist){
            System.out.println(cust.getCustomerID()+ "|" + cust.getCustomName()+ "|" + cust.getCustomerContact() + "|" + cust.getCustomerGender()+ "|" + cust.getCustomerEmail()+ "|" + cust.getCustomerAddress() + "|" + cust.getCustomerDateOfBirth());
        }
        Customer cust = customerDAO.getCustomerByID(1);
           System.out.println(cust.getCustomerID()+ "|" + cust.getCustomName()+ "|" + cust.getCustomerContact() + "|" + cust.getCustomerGender()+ "|" + cust.getCustomerEmail()+ "|" + cust.getCustomerAddress() + "|" + cust.getCustomerDateOfBirth());
    
    }
}

