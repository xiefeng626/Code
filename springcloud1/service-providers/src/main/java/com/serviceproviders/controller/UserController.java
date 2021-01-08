package com.serviceproviders.controller;

import com.netflix.discovery.DiscoveryClient;
import com.serviceproviders.pojo.User;
import com.serviceproviders.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    

    @RequestMapping("{id}")
    public User queryById(@PathVariable("id") Long id){
        System.out.println("根据id:"+id);
        return userService.getUserById(id);
    }

    @RequestMapping("/range")
    public List<User> queryByIdrange(Long id){
        System.out.println("根据id<:"+id);
        return userService.getUserByIdrange(id);
    }
}
