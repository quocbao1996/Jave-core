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
    public List<User> findEmployeeByProjectId(int projectID) {
        return service.findEmployeeByProjectId(projectID);
    }

    public List<User> findManager  (){
        return service.findManager();
    }



    /**
     * @param email email Manager
     * @param password password Manager
     * @return thông tin user tương ứng với email và password, hoặc null nếu thông tin không tồn tại
     */
    public User findManagerByEmailAndPassword(String email, String password) {
        return service.findManagerByEmailAndPassword(email, password);
    }

}
