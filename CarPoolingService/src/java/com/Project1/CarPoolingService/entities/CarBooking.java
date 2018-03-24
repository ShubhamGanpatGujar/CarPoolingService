/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.entities;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author SHUBHAM
 */
public class CarBooking {
    int carbookingID;
    int carID;
    int customerID;
    String carbookingDate;
    String carbookingTime; 

    public CarBooking(int carbookingID, int carID, int customerID ,String  carbookingDate, String  carbookingTime) {
        this.carbookingID = carbookingID;
        this.carID = carID;
        this.customerID = customerID;
        this.carbookingDate = carbookingDate;
        this.carbookingTime = carbookingTime;
    }

    public CarBooking(int carID,int customerID ,String  carbookingDate, String  carbookingTime) {
     this.carID = carID;
        this.customerID = customerID;
        this.carbookingDate = carbookingDate;
        this.carbookingTime = carbookingTime;
    }

    public void setCarbookingID(int carbookingID) {
        this.carbookingID = carbookingID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCarbookingDate(String  carbookingDate) {
        this.carbookingDate = carbookingDate;
    }

    public void setCarbookingTime(String  carbookingTime) {
        this.carbookingTime = carbookingTime;
    }
    
    public int getCarbookingID() {
        return carbookingID;
    }

    public int getCarID() {
        return carID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String  getCarbookingDate() {
        return carbookingDate;
    }

    public String  getCarbookingTime() {
        return carbookingTime;
    }
   

   

    
}

  