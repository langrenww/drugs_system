package com.jk.controller;

import com.jk.pojo.DrugUser;
import com.jk.service.UserServiceApi;
import com.jk.service.UserServiceServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserControllerServer implements UserServiceApi {
   @Autowired
   private UserServiceServer userServiceServer;

    @Override
    @PutMapping("updatePassword")
    @ResponseBody
    public void updatePassword(@RequestBody DrugUser user) {
        userServiceServer.updatePassword(user);
    }
}
