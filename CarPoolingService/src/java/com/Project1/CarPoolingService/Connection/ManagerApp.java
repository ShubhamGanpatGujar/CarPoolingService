/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Connection;

import com.Project1.CarPoolingService.dao.ManagerDAO;
import com.Project1.CarPoolingService.daoimpl.ManagerDAOImpl;
import com.Project1.CarPoolingService.entities.Manager;

/**
 *
 * @author SHUBHAM
 */
public class ManagerApp {
      public static void main(String[] args){
        
        ManagerDAO managerDAO = new ManagerDAOImpl();
//      int count;
//       count = managerDAO.addManager(new Manager(1,"Shubham1998@gmail.com","Shu1998"));
//       if(count>0)System.out.println("Record Added Successfully");
//      else System.out.println("Record Failed to get added");
//       
        boolean resultSet=managerDAO.isUserValid("Shubham1998@gmail.com","Shu1998");
          if(resultSet=true)System.out.println("Login Successfully ");
             else System.out.println("Not Login");
}
}