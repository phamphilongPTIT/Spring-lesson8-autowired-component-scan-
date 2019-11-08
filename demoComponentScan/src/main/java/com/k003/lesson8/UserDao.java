package com.k003.lesson8;

import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
    public void findUser(String name){
        System.out.println("find user by name: "+name);

    }
}
