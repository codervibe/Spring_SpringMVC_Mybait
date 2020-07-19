package com.ssm.service;

/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 14:14
 * Description:
 * Others:
 */

import com.ssm.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import java.util.List;


/**
 * @author Administrator
 */
@Component
@Service("userService")
public interface UserService {
    /**
     *
     * @return User
     */
    public List<User> showUserInfo();
}
