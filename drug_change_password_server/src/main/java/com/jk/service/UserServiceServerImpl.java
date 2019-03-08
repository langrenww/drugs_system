package com.jk.service;

import com.jk.mapper.UserMapperServer;
import com.jk.pojo.DrugUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceServerImpl implements UserServiceServer {
    @Autowired
    private UserMapperServer userMapperServer;
    @Override
    public void updatePassword(DrugUser user) {
        userMapperServer.updatePassword(user);
    }
}
