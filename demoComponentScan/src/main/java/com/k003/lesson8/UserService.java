package com.k003.lesson8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class UserService {

    @Autowired
    private UserDao userDao;

    public void findUser(String name){
        System.out.println("userService find: ");
        userDao.findUser(name);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
