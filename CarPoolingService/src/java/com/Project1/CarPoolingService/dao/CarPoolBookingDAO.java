/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.dao;

import com.Project1.CarPoolingService.entities.CarPoolBooking;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public interface CarPoolBookingDAO { 
    int addCarPoolBooking(CarPoolBooking carpoolbooking);
     int deleteCarPoolBooking(int carpoolbookingID);
     List<CarPoolBooking> getAllCarPoolBooking();
     CarPoolBooking getCarPoolBookingByID (int carpoolbookingID);
     int updateCarPoolBooking(int carpoolbookingID,CarPoolBooking carpoolbooking);
}
