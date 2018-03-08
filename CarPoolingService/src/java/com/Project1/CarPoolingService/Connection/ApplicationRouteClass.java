/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.RouteDAO;
import com.Project1.CarPoolingService.daoimpl.RouteDAOImpl;
import com.Project1.CarPoolingService.entities.Route;
import java.util.List;




/**
 *
 * @author SHUBHAM
 */
public class ApplicationRouteClass {
    
   public static void main(String[] args){
    RouteDAO routeDAO = new RouteDAOImpl();
    int count;
   // count = routeDAO.addRoute(new Route(1,"Borivali","Malad",30));
     // if(count>0)System.out.println("Record Added Successfully");
      //else System.out.println("Record Failed to get added");
      // count=routeDAO.deleteRoute(1008);
      //  if(count>0)System.out.println("Record Deleted Successfully");
      //    else System.out.println("Record Failed to get deleted");
        Route route = new Route(1001,"Borivali","Malad",20);
         count=routeDAO.updateRoute(1001, route);
       if(count>0)System.out.println("Record Updated Successfully");
       else System.out.println("Record Failed to get updated");
//        List<Route> routelist = routeDAO.getAllRoute();
//        for(Route rou: routelist){
//            System.out.println(rou.getRouteID()+ "|" + rou.getStartLocation() + "|" + rou.getDestination() + "|" + rou.getDistance());
//        }
//       Route rou =routeDAO.getRouteByID(1000);
//           System.out.println(rou.getRouteID()+ "|" + rou.getStartLocation() + "|" + rou.getDestination() + "|" + rou.getDistance());
}
}