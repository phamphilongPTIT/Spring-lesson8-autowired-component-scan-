package com.k003.lesson8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService obj = (UserService) context.getBean("service");
        obj.findUser("Pham Phi Long");
    }
}
