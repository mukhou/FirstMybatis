/* 
User: Urmi
Date: 10/10/2020 
Time: 2:25 PM
*/

package com.first.mybatis.springbootmybatis.controller;

import com.first.mybatis.springbootmybatis.mapper.UserMapper;
import com.first.mybatis.springbootmybatis.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("all")
    public List<User> getAll(){
        System.out.println("##############test");
        return userMapper.findAll();
    }

    @GetMapping("{id}")
    public User getById(@PathVariable("id") int id){
        System.out.println("get by id");
        return userMapper.findById(id);
    }
}
