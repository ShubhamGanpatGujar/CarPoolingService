/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.CarPoolRouteDAO;
import com.Project1.CarPoolingService.daoimpl.CarPoolRouteDAOImpl;
import com.Project1.CarPoolingService.entities.CarPoolRoute;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public class ApplicationCarPoolRouteClass {
 public static void main(String[] args){
        CarPoolRouteDAO carpoolrouteDAO = new CarPoolRouteDAOImpl();
       int count;
//      count = carpoolrouteDAO.addCarPoolRoute(new CarPoolRoute(2,1001,5,100));
//      if(count>0)System.out.println("Record Added Successfully");
//       else System.out.println("Record Failed to get added");
//      
//      count=carpoolrouteDAO.deleteCarPoolRoute(20000);
//      if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get Deleted");
//      
       CarPoolRoute carpoolroute = new CarPoolRoute(2,1001,4,500);
          count=carpoolrouteDAO.updateCarPoolRoute(20001, carpoolroute);
      if(count>0)System.out.println("Record Updated Successfully");
     else System.out.println("Record Failed to get updated");
       
       
       List<CarPoolRoute> carpoolroutelist = carpoolrouteDAO.getAllCarPoolRoute();
        for(CarPoolRoute cpr: carpoolroutelist){
        System.out.println(cpr.getCarPoolrouteID()+ "|" + cpr.getRouteID()+ "|" + cpr.getPassengerCapacity()+ "|" + cpr.getPrice());
       }
       CarPoolRoute cpr = carpoolrouteDAO.getCarPoolRouteByID(20001);
     System.out.println(cpr.getCarPoolrouteID()+ "|" + cpr.getRouteID()+ "|" + cpr.getPassengerCapacity()+ "|" + cpr.getPrice());
      }
      
}
