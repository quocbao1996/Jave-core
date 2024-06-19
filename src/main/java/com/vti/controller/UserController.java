package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    public List<User> findEmployeeByAndManagerProjectId(int projectID) {
        return service.findEmployeeAndManagerByProjectId(projectID);
    }

    public User findAdminByEmailAndPassword(String email, String password) {
        return service.findAdminByEmailAndPassword(email, password);
    }
    public int createEmployee (String fullname, String email){
        return service.createEmployee(fullname,email);
    }

}
