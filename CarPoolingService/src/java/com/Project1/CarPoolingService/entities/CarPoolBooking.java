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
public class CarPoolBooking {
 int invoiceID;
    String invoiceDate;
    int carID;
    int carpoolbookingID;
    String carpoolbookingDate;
    String carpoolbookingTime;
    int customrID;
    int routeID;
    int numberofPassenger;

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setCarpoolbookingID(int carpoolbookingID) {
        this.carpoolbookingID = carpoolbookingID;
    }

    public void setCarpoolbookingDate(String carpoolbookingDate) {
        this.carpoolbookingDate = carpoolbookingDate;
    }

    public void setCarpoolbookingTime(String carpoolbookingTime) {
        this.carpoolbookingTime = carpoolbookingTime;
    }

    public void setCustomrID(int customrID) {
        this.customrID = customrID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public void setNumberofPassenger(int numberofPassenger) {
        this.numberofPassenger = numberofPassenger;
    }
    
    
    
    public int getInvoiceID() {
        return invoiceID;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public int getCarID() {
        return carID;
    }

    public int getCarpoolbookingID() {
        return carpoolbookingID;
    }

    public String getCarpoolbookingDate() {
        return carpoolbookingDate;
    }

    public String getCarpoolbookingTime() {
        return carpoolbookingTime;
    }

    public int getCustomrID() {
        return customrID;
    }

    public int getRouteID() {
        return routeID;
    }

    public int getNumberofPassenger() {
        return numberofPassenger;
    }
    

    public CarPoolBooking(int invoiceID, String invoiceDate, int carID, int carpoolbookingID, String carpoolbookingDate, String carpoolbookingTime, int customrID, int routeID, int numberofPassenger) {
        this.invoiceID = invoiceID;
        this.invoiceDate = invoiceDate;
        this.carID = carID;
        this.carpoolbookingID = carpoolbookingID;
        this.carpoolbookingDate = carpoolbookingDate;
        this.carpoolbookingTime = carpoolbookingTime;
        this.customrID = customrID;
        this.routeID = routeID;
        this.numberofPassenger = numberofPassenger;
    }

   

}
