/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.CarPoolingService.entities;

/**
 *
 * @author SHUBHAM
 */
public class Manager {

    public Manager(int managerID, String managerEmail, String managerPassword) {
        this.managerID = managerID;
        this.managerEmail = managerEmail;
        this.managerPassword = managerPassword;
    }
    int managerID;
    String managerEmail;
    String managerPassword;

  

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }
}
