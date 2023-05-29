package com.src.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.src.entity.User;
import com.src.mapper.UserMapper;
import com.src.service.UserIService;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service(value = "UserIService")
public class UserServiceImpl implements UserIService{

    @Resource
    private UserMapper userMapper;
    
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public User find(int id) {
        return userMapper.find(id);
    }
    
    public void delete(int id){
        userMapper.delete(id);
    }
	
}