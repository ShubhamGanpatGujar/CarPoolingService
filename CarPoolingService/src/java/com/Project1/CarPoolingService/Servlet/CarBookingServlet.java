/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Servlet;


import com.Project1.CarPoolingService.dao.CarPoolBookingDAO;
import com.Project1.CarPoolingService.dao.RouteDAO;
import com.Project1.CarPoolingService.daoimpl.CarPoolBookingDAOImpl;
import com.Project1.CarPoolingService.daoimpl.RouteDAOImpl;
import com.Project1.CarPoolingService.entities.CarPoolBooking;
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
public class CarBookingServlet extends HttpServlet {

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
            
            
            
             String startLocation;
            String Destination;
            int Distance;
            String carpoolbookingDate;
            String carpoolbookingTime;
            int numberofPassenger;
            
            startLocation = request.getParameter("startLocation");
            Destination=request.getParameter("Destination");
             Distance=Integer.parseInt(request.getParameter("Distance"));
           carpoolbookingDate= request.getParameter("carpoolbookingDate");
            carpoolbookingTime=request.getParameter("carpoolbookingTime"); 
            numberofPassenger=Integer.parseInt(request.getParameter("numberofPassenger"));    
            RouteDAO routeDAO = new RouteDAOImpl();
       CarPoolBookingDAO carpoolbookingDAO = new CarPoolBookingDAOImpl();
        int count = routeDAO.addRoute(new Route(startLocation,Destination,Distance));
                   carpoolbookingDAO.addCarPoolBooking(new CarPoolBooking(carpoolbookingDate,carpoolbookingTime,numberofPassenger));
                  System.out.println(count);
                  RequestDispatcher rd =null;
                  if (count>0) 
                  {
                      rd=request.getRequestDispatcher("Home.jsp");
                  }
                  else
                  {
                      
                      rd=request.getRequestDispatcher("CarBooking.jsp");
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
