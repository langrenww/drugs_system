package com.jk.service;

import com.jk.pojo.DrugUser;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserServiceApi {
    @PutMapping("updatePassword")

    void updatePassword(@RequestBody DrugUser user);
}
