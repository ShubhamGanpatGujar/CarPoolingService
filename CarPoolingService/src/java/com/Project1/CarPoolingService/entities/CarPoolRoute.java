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

    public CarPoolRoute(int passengerCapacity, int price) {
       this.passengerCapacity = passengerCapacity;
        this.price = price;
    }
    public int getCarpoolrouteID() {
        return carpoolrouteID;
    }

    public void setCarpoolrouteID(int carpoolrouteID) {
        this.carpoolrouteID = carpoolrouteID;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
