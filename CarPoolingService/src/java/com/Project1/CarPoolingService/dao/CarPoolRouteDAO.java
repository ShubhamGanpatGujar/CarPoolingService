/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.dao;

import com.Project1.CarPoolingService.entities.CarPoolRoute;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public interface CarPoolRouteDAO {
    int addCarPoolRoute(CarPoolRoute carpoolroute);
     int deleteCarPoolRoute(int carpoolrouteID);
     List<CarPoolRoute> getAllCarPoolRoute();
     CarPoolRoute getCarPoolRouteByID (int carpoolrouteID);
     int updateCarPoolRoute(int carpoolrouteID,CarPoolRoute carpoolroute);
}