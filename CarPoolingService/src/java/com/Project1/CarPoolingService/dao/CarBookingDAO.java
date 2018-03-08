/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.dao;

import com.Project1.CarPoolingService.entities.CarBooking;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public interface CarBookingDAO { 
    int addCarBooking(CarBooking carbooking);
     int deleteCarBooking(int carbookingID);
     List<CarBooking> getAllCarBooking();
     CarBooking getCarBookingByID (int carbookingID);
     int updateCarBooking(int carbookingID,CarBooking carbooking);
}

    

