package com.jiayaxing.htmlvue.service;

import com.jiayaxing.htmlvue.dao.UserDao;
import com.jiayaxing.htmlvue.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private UserDao userDao;

    public UserEntity findById(Integer id){
        UserEntity one = userDao.getmycount(id);
        return one;
    }
}
