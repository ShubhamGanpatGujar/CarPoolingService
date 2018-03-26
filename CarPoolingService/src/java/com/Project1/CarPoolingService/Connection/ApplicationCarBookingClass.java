/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.CarBookingDAO;
import com.Project1.CarPoolingService.daoimpl.CarBookingDAOImpl;
import com.Project1.CarPoolingService.entities.CarBooking;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public class ApplicationCarBookingClass {
    public static void main(String[] args){
        CarBookingDAO carbookingDAO = new CarBookingDAOImpl();
       int count;
       count = carbookingDAO.addCarBooking(new CarBooking(1,1000,1,"10/10/2015","02:01:00"));
      if(count>0)System.out.println("Record Added Successfully");
       else System.out.println("Record Failed to get added");
      
    //  count=carbookingDAO.deleteCarBooking(100000);
    //  if(count>0)System.out.println("Record Deleted Successfully");
    //  else System.out.println("Record Failed to get added");
      
//       CarBooking carbooking = new CarBooking(100001,1006,10,"10/10/2015","01:02:00");
//       count=carbookingDAO.updateCarBooking(1, carbooking);
//       if(count>0)System.out.println("Record Updated Successfully");
////      else System.out.println("Record Failed to get updated");
//       List<CarBooking> carbookinglist = carbookingDAO.getAllCarBooking();
//        for(CarBooking cb: carbookinglist){
//          System.out.println(cb.getCarbookingID()+ "|" + cb.getCarID()+ "|" + cb.getCustomerID()+ "|" + cb.getCarbookingDate()+ "|" + cb.getCarbookingTime());
//       }
//       CarBooking cb = carbookingDAO.getCarBookingByID(5000);
//             System.out.println(cb.getCarbookingID()+ "|" + cb.getCarID()+ "|" + cb.getCustomerID()+ "|" + cb.getCarbookingDate()+ "|" + cb.getCarbookingTime());
    }
      
}

