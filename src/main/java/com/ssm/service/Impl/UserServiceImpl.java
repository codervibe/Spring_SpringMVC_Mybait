package com.ssm.service.Impl;
/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 14:15
 * Description:
 * Others:
 */

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> showUserInfo() {
        System.out.println("业务层：显示用户账户信息");
        return userDao.showUserInfo();
    }
}
