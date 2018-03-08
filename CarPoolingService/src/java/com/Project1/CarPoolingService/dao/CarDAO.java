/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.dao;

import com.Project1.CarPoolingService.entities.Car;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public interface CarDAO {
    int addCar(Car car);
     int deleteCar(int carID);
     List<Car> getAllCar();
     Car getCarByID (int carID);
     int updateCar(int carID,Car car);
}


