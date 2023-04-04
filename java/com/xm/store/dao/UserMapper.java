package com.xm.store.dao;

import com.xm.store.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface UserMapper {
    int insert(User user);
    User findByUsername(String username);

    User findByUid(Integer uid);
    Integer updatePasswordByUid(
            @Param("uid") Integer uid,
            @Param("password") String password,
            @Param("modified_user") String modified_user,
            @Param("modified_time") Date modified_time
    );

    Integer updateInfoByUid(User user);

    Integer updateAvatarByUid(
            @Param("uid") Integer uid,
            @Param("avatar") String avatar,
            @Param("modified_user") String modified_user,
            @Param("modified_time") Date modified_time);


}
