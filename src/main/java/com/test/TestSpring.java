package com.test;
/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 14:34
 * Description:
 * Others:
 */

import com.ssm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.showUserInfo();
    }
}
