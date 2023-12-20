package com.pluralsight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NorthwindTradersApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ProductDao productDao = context.getBean(SimpleProductDao.class);

        System.out.println("List of Products: " + productDao.getAll());
    }
}
