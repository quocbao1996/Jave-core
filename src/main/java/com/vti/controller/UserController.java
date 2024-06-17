package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    /**
     * @return Danh sách user trong database
     *
     * */
    public List<User> findEmployeeByAndManagerProjectId(int projectID) {
        return service.findEmployeeAndManagerByProjectId(projectID);
    }

    /**
     * @param email email Manager
     * @param password password Manager
     * @return thông tin user tương ứng với email và password, hoặc null nếu thông tin không tồn tại
     */
    public User findAdminByEmailAndPassword(String email, String password) {
        return service.findAdminByEmailAndPassword(email, password);
    }
    public int createEmployee (String fullname, String email){
        return service.createEmployee(fullname,email);
    }

}
