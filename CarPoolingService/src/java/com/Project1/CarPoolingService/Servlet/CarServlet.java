/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Servlet;

import com.Project1.CarPoolingService.dao.CarBookingDAO;
import com.Project1.CarPoolingService.dao.CarDAO;
import com.Project1.CarPoolingService.dao.PickUpDAO;
import com.Project1.CarPoolingService.dao.RouteDAO;
import com.Project1.CarPoolingService.daoimpl.CarBookingDAOImpl;
import com.Project1.CarPoolingService.daoimpl.CarDAOImpl;
import com.Project1.CarPoolingService.daoimpl.PickUpDAOImpl;
import com.Project1.CarPoolingService.daoimpl.RouteDAOImpl;
import com.Project1.CarPoolingService.entities.Car;
import com.Project1.CarPoolingService.entities.CarBooking;
import com.Project1.CarPoolingService.entities.PickUp;
import com.Project1.CarPoolingService.entities.Route;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SHUBHAM
 */
public class CarServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String carNo;
           String carModel;
           String carAC;
           int carSeating;
           
     
            
            String carbookingDate;
            String carbookingTime;
            
            String pickupPoint;
            
            carNo = request.getParameter("carNo");
            carModel = request.getParameter("carModel");
            carAC=request.getParameter("carAC");
             carSeating=Integer.parseInt(request.getParameter("carSeating"));
             
             
             
             carbookingDate= request.getParameter("carbookingDate");
            carbookingTime=request.getParameter("carbookingTime"); 
            
              pickupPoint=request.getParameter("pickupPoint");
              
       CarDAO carDAO = new CarDAOImpl();
         
         PickUpDAO pickupDAO = new PickUpDAOImpl();
          CarBookingDAO carbookingDAO = new CarBookingDAOImpl();
          
                  int count = carDAO.addCar(new Car(carNo,carModel,carAC,carSeating));
                             
                             carbookingDAO.addCarBooking(new CarBooking(carbookingDate,carbookingTime));
                             pickupDAO.addPickUp(new PickUp(pickupPoint));
                  System.out.println(count);
                  RequestDispatcher rd =null;
                  if (count>0) 
                  {
                      rd=request.getRequestDispatcher("Home.jsp");
                  }
                  else
                  {
                      
                      rd=request.getRequestDispatcher("Car.jsp");
                  } 
               rd.forward(request, response);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
