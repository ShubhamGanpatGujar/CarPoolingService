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
    int carNo;
    String carModel;
    String carAC;
    int carSeating;

    public Car(int carID, int carNo, String carModel, String carAC, int carSeating) {
        this.carID = carID;
        this.carNo = carNo;
        this.carModel = carModel;
        this.carAC = carAC;
        this.carSeating = carSeating;
    }

    public void setCarid(int carid) {
        this.carID = carID;
    }

    public void setCarNo(int carNo) {
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

    public int getCarNo() {
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
