/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.CarPoolBookingDAO;
import com.Project1.CarPoolingService.daoimpl.CarPoolBookingDAOImpl;
import com.Project1.CarPoolingService.entities.CarPoolBooking;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public class ApplicationCarPoolBooking {
    public static void main(String[] args){
  CarPoolBookingDAO carpoolbookingDAO = new CarPoolBookingDAOImpl();
      int count;
       count = carpoolbookingDAO.addCarPoolBooking(new CarPoolBooking(101,"10/10/2015",1006,00001,"10/10/2015","10:00:00",10,1001,5));
      if(count>0)System.out.println("Record Added Successfully");
       else System.out.println("Record Failed to get added");
      
      
      
//       count=carpoolbookingDAO.deleteCarPoolBooking(1001);
//     if(count>0)System.out.println("Record Added Successfully");
//       else System.out.println("Record Failed to get added");
//      
//      CarPoolBooking carpoolbooking = new CarPoolBooking(101,"10/10/2015",1006,00001,"10/10/2015","10:00",10,1001,5);
//       count=carpoolbookingDAO.updateCarPoolBooking(1, carpoolbooking);
//       if(count>0)System.out.println("Record Updated Successfully");
//      else System.out.println("Record Failed to get updated");
//       
//       
//       List<CarPoolBooking> carpoolbookinglist = carpoolbookingDAO.getAllCarPoolBooking();
//        for(CarPoolBooking cpb: carpoolbookinglist){
//      System.out.println(cpb.getInvoiceID()+ "|" + cpb.getInvoiceDate()+ "|" + cpb.getCarID()+ "|" + cpb.getCarpoolbookingID()+ "|" + cpb.getCarpoolbookingDate()+ "|" +cpb.getCarpoolbookingTime()+ "|" + cpb.getCustomrID()+ "|" + cpb.getRouteID()+ "|" + cpb.getNumberofPassenger());
//       }
//       CarPoolBooking cpb = carpoolbookingDAO.getCarPoolBookingByID(1000);
//         System.out.println(cpb.getInvoiceID()+ "|" + cpb.getInvoiceDate()+ "|" + cpb.getCarID()+ "|" + cpb.getCarpoolbookingID()+ "|" + cpb.getCarpoolbookingDate()+ "|" +cpb.getCarpoolbookingTime()+ "|" + cpb.getCustomrID()+ "|" + cpb.getRouteID()+ "|" + cpb.getNumberofPassenger());
       }
      
}


