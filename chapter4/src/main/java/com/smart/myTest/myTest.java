package com.smart.myTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by h on 2017/10/16.
 */
public class myTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/smart/myTest/beans.xml");
        Car car = (Car)context.getBean("car");
        car.introduce();

    }
}
