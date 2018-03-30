/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.dao;

import com.Project1.CarPoolingService.entities.Manager;

/**
 *
 * @author SHUBHAM
 */
public interface ManagerDAO {
     int addCustomer(Manager manager);
     boolean isUserValid(String managerEmail ,String managerPassword);

    public int addManager(Manager manager);
}
