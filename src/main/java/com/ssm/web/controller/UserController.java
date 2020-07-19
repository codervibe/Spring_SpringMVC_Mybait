package com.ssm.web.controller;
/*
 * Created by Administrator on 2020/7/17  0017
 * DateTime:2020/07/17 22:10
 * Description:
 * Others:
 */


import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class UserController {


//    @Qualifier("userService")
    @Autowired
    private UserService userService;

    @RequestMapping("/showUserInfo")
    public String showUserInfo(Model model) {
        System.out.println("showUserInfo 运行了！！！");
        System.out.println("controller调用Service");
        List<User> users = userService.showUserInfo();
        System.out.println("dao 数据返回 .....");
        for (User user : users) {

            System.out.println(user);
        }
        model.addAttribute("list",users);
        return "Success";
    }

    @RequestMapping("/findAll")
    public void findAll() {
        System.out.println("findAll 运行了");
    }
}
