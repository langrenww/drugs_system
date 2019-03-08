package com.jk.mapper;

import com.jk.pojo.DrugUser;
import org.apache.ibatis.annotations.Update;

public interface UserMapperServer {
    @Update("update  drug_user set user_password=#{userPassword} where user_id=#{userId}")

    void updatePassword(DrugUser user);
}
