package com.jk.controller;

import com.jk.pojo.DrugUser;
import com.jk.service.UserServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserControllerWeb {
    @Autowired
    private UserServiceWeb userServiceWeb;
    @PutMapping("updatePassword")
    @ResponseBody
    public void updatePassword(@RequestBody DrugUser user){

        userServiceWeb.updatePassword(user);
    }

}
