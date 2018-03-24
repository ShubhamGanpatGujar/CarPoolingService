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
public class Car {
    int carID;
    String carNo;
    String carModel;
    String carAC;
    int carSeating;

    public Car(int carID, String carNo, String carModel, String carAC, int carSeating) {
        this.carID = carID;
        this.carNo = carNo;
        this.carModel = carModel;
        this.carAC = carAC;
        this.carSeating = carSeating;
    }

    public Car(String carNo, String carModel, String carAC, int carSeating) {
     this.carNo = carNo;
        this.carModel = carModel;
        this.carAC = carAC;
        this.carSeating = carSeating;
    }

    public Car(int carNo, String carModel, String carAC, int carSeating) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCarid(int carid) {
        this.carID = carID;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarAC(String carAC) {
        this.carAC = carAC;
    }

    public void setCarSeting(int carSeating) {
        this.carSeating = carSeating;
    }

    public int getCarID() {
        return carID;
    }

    public String getCarNo() {
        return carNo;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarAC() {
        return carAC;
    }

    public int getCarSeating() {
        return carSeating;
    }

    
    
    
}
