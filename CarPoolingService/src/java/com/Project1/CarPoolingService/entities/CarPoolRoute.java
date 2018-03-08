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
public class CarPoolRoute {
    int carpoolrouteID;
    int routeID;
    int passengerCapacity;
    int price;

    public CarPoolRoute(int carpoolrouteID, int routeID, int passengerCapacity, int price) {
        this.carpoolrouteID = carpoolrouteID;
        this.routeID = routeID;
        this.passengerCapacity = passengerCapacity;
        this.price = price;
    }

    public void setCarPoolID(int carPoolID) {
        this.carpoolrouteID = carpoolrouteID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCarPoolrouteID() {
        return carpoolrouteID;
    }

    public int getRouteID() {
        return routeID;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getPrice() {
        return price;
    }
}
