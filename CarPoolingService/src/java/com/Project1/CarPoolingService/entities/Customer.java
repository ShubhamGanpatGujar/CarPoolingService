/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.entities;

import java.util.Date;

/**
 *
 * @author SHUBHAM
 */
public class Customer {
            int customerID  ;
            String customerName;
            String customerContact;
            String customerGender;
            String customerEmail;
            String customerAddress;
            String customerDateOfBirth; 
            String customerPassword;

    

    

    
            

    public Customer(int customerID, String customerName, String customerContact, String customerGender, String customerEmail, String customerAddress, String customerDateOfBirth,String customerPassword) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerDateOfBirth = customerDateOfBirth;
         System.out.println("Date Of Birth---- "+ customerDateOfBirth);
        this.customerPassword = customerPassword;
       
    }

    public Customer(String customerName, String customerContact, String customerGender, String customerEmail, String customerAddress, String customerDateOfBirth, String customerPassword) {
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerDateOfBirth = customerDateOfBirth;
        System.out.println("Date Of Birth---- "+ customerDateOfBirth);
        this.customerPassword = customerPassword;
    }

    

   

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }
    
    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerDateOfBirth(String customerDateOfBirth) {
        this.customerDateOfBirth = customerDateOfBirth;
    }
    
     public void setCustomerPassword(String customerPassword) {
        this.customerPassword =customerPassword;
    }
    
  
    
    
    public int getCustomerID() {
        return customerID;
    }
    
    public String getCustomerName() {
        return customerName;
    }

  public String getCustomerContact() {
        return customerContact;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerDateOfBirth() {
        return customerDateOfBirth;
    }

   public String getCustomerPassword() {
        return customerPassword;
    }

   
}