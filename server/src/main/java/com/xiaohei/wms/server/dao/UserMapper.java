package com.xiaohei.wms.server.dao;

import com.xiaohei.wms.server.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectByUsername(String username);
    User selectByUid(String uid);
    int insertUser(User user);
    int updateUser(User user);
}
