/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.PickUpDAO;
import com.Project1.CarPoolingService.daoimpl.PickUpDAOImpl;
import com.Project1.CarPoolingService.entities.PickUp;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public class ApplicationPickUpClass {
    public static void main(String[] args){
        PickUpDAO pickupDAO = new PickUpDAOImpl();
       int count;
       count = pickupDAO.addPickUp(new PickUp(51,"Malad",10000));
     if(count>0)System.out.println("Record Added Successfully");
       else System.out.println("Record Failed to get added");
     
     
//     count=pickupDAO.deletePickUp(100000);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");
//      
      
      PickUp pickup = new PickUp(100000,"Virar",10000);
       count=pickupDAO.updatePickUp(50,pickup);
       if(count>0)System.out.println("Record Updated Successfully");
      else System.out.println("Record Failed to get updated");
       
       
        List<PickUp> pickuplist = pickupDAO.getAllPickUp();
        for(PickUp pic: pickuplist){
         System.out.println(pic.getPickupID()+ "|" + pic.getPickupPoint()+ "|" +pic.getRouteID());
       }
       PickUp pic = pickupDAO.getPickUpByID(100000);
 System.out.println(pic.getPickupID()+ "|" + pic.getPickupPoint()+ "|" +pic.getRouteID());       

     
}
}
