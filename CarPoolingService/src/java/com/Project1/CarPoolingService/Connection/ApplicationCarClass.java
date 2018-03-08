/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.CarDAO;
import com.Project1.CarPoolingService.daoimpl.CarDAOImpl;
import com.Project1.CarPoolingService.entities.Car;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public class ApplicationCarClass {
       public static void main(String[] args){
        CarDAO carDAO = new CarDAOImpl();
       int count;
      // count = carDAO.addCar(new Car(6,5001,"SUZIKI","y",5));
     // if(count>0)System.out.println("Record Added Successfully");
      // else System.out.println("Record Failed to get added");
        // count=carDAO.deleteCar(1001);
        //if(count>0)System.out.println("Record Deleted Successfully");
        // else System.out.println("Record Failed to get deleted");
        Car car = new Car(1006,45,"maruti","n",4);
       count=carDAO.updateCar(1006, car);
       if(count>0)System.out.println("Record Updated Successfully");
      else System.out.println("Record Failed to get updated");
      // List<Car> carlist = carDAO.getAllCar();
        //for(Car cr: carlist){
      //     System.out.println(cr.getCarID()+ "|" + cr.getCarNo()+ "|" + cr.getCarModel() + "|" + cr.getCarAC()+ "|" + cr.getCarSeating());
      // }
      // Car cr = carDAO.getCarByID(1000);
      //     System.out.println(cr.getCarID()+ "|" + cr.getCarNo()+ "|" + cr.getCarModel() + "|" + cr.getCarAC()+ "|" + cr.getCarSeating());
       }
    }

      


