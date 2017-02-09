package com.ghtl.online.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GHTL on 09/02/2017.
 */
public class Process {
    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("shop.xml");
        DemoClass myBean = (DemoClass) beanFactory.getBean("demo");
        myBean.printHello();
    }
}
