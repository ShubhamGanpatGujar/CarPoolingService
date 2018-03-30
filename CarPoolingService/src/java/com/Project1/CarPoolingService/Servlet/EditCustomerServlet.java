
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.Servlet;

import com.Project1.CarPoolingService.dao.CustomerDAO;
import com.Project1.CarPoolingService.daoimpl.CustomerDAOImpl;
import com.Project1.CarPoolingService.entities.Customer;
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
public class EditCustomerServlet extends HttpServlet {

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
            int customerID;
           
            String action = request.getParameter("action");
            
            customerID = Integer.parseInt(request.getParameter("customerID").trim());
            System.out.println("List Of Customers");
            CustomerDAO customerDAO = new CustomerDAOImpl();
            int count = 0;
            if(action.equals("Save Changes")){
            String customerName;
            String customerContact;
            String customerGender;
            String customerEmail;
            String customerAddress;
            String customerDateOfBirth;  
            
               customerName = request.getParameter("customerName");
               customerContact = request.getParameter("customerContact");
               customerGender = request.getParameter("customerGender");
               customerEmail = request.getParameter("customerEmail");
               customerAddress = request.getParameter("customerAddress");
               customerDateOfBirth = request.getParameter("customerDateOfBirth");
              
                System.out.println("Date Of Birth "+ customerDateOfBirth);
                count = customerDAO.updateCustomer(customerID,new Customer(customerName,customerContact,customerGender,customerEmail,customerAddress,customerDateOfBirth));
                System.out.println("count : " + count);    
            }
            else if(action.equals("Delete")){
                count = customerDAO.deleteCustomer(customerID);
            }
             RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("CustomerList.view");
            }
            else{
                rd = request.getRequestDispatcher("CustomerList.jsp?custID="+customerID);
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
