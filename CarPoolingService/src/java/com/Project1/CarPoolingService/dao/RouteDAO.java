/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.dao;

import com.Project1.CarPoolingService.entities.Route;
import java.util.List;

/**
 *
 * @author SHUBHAM
 */
public interface RouteDAO {
    int addRoute (Route route);
    int deleteRoute(int routeID);
    List<Route> getAllRoute();
    Route getRouteByID (int routeID);
    int updateRoute(int routeID,Route route);
}
