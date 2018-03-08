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
public class PickUp {
    int pickupID;
    String pickupPoint;
    int routeID;

    public PickUp(int pickupID, String pickupPoint, int routeID) {
        this.pickupID = pickupID;
        this.pickupPoint = pickupPoint;
        this.routeID = routeID;
    }

  

    public void setPickupID(int pickupID) {
        this.pickupID = pickupID;
    }

    public void setPickupPoint(String pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public int getPickupID() {
        return pickupID;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public int getRouteID() {
        return routeID;
    }
    
    
    
}
