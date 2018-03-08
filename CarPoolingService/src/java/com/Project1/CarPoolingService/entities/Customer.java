/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.entities;
/**
 *
 * @author SHUBHAM
 */
import java.util.Date;


public class Customer {
            int customerID  ;
            String customerName;
            long customerContact;
            String customerGender;
            String customerEmail;
            String customerAddress;
            String customerDateOfBirth;  

    public Customer(String customerName, long customerContact, String customerGender, String customerEmail, String customerAddress, String customerDateOfBirth) {
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerDateOfBirth = customerDateOfBirth;
    }
   
            

    public Customer(int customerID, String customerName, long customerContact, String customerGender, String customerEmail, String customerAddress, String customerDateOfBirth) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerGender = customerGender;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerDateOfBirth = customerDateOfBirth;
    }

   

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomName(String customName) {
        this.customerName = customerName;
    }

    public void setCustomerContact(long customerContact) {
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
    
  
    
    
    public int getCustomerID() {
        return customerID;
    }
    
    public String getCustomName() {
        return customerName;
    }

  public long getCustomerContact() {
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

   
}