package com.test;
/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 15:44
 * Description:
 * Others:
 */

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybait {
    @Test
    public void run1() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession session = factory.openSession();
        UserDao dao = session.getMapper(UserDao.class);
        List<User> users = dao.showUserInfo();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
        resourceAsStream.close();

    }
}
