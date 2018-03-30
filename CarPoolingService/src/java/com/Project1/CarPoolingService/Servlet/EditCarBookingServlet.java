/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Servlet;

import com.Project1.CarPoolingService.dao.CarBookingDAO;
import com.Project1.CarPoolingService.daoimpl.CarBookingDAOImpl;
import com.Project1.CarPoolingService.entities.CarBooking;
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
public class EditCarBookingServlet extends HttpServlet {

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
            int carbookingID;
           
            String action = request.getParameter("action");
            
            carbookingID = Integer.parseInt(request.getParameter("carbookingID").trim());
            System.out.println("List Of CarBooking");
            CarBookingDAO carbookingDAO = new CarBookingDAOImpl();
            int count = 0;
            if(action.equals("Save Changes")){
            
            String carbookingDate;
            String carbookingTime;
             
              
              
               carbookingDate = request.getParameter("carbookingDate");
               carbookingTime = request.getParameter("carbookingTime");
                count = carbookingDAO.updateCarBooking(carbookingID,new CarBooking(carbookingDate,carbookingTime));
                }
            else if(action.equals("Delete")){
                count = carbookingDAO.deleteCarBooking(carbookingID);
            }
             RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("carbookinglist.view");
            }
            else{
                rd = request.getRequestDispatcher("carbookinglist.jsp?carbookingID="+carbookingID);
            }
            rd.include(request,response);
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
