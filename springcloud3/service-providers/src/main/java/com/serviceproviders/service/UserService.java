package com.serviceproviders.service;

import com.serviceproviders.mapper.UserMapper;
import com.serviceproviders.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> getUserByIdrange(Long id){
        return this.userMapper.selectTwoPeople(id);
    }
}
