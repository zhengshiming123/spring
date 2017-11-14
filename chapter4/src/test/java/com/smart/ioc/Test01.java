package com.smart.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;

/**
 * Created by h on 2017/10/13.
 */
public class Test01 {

    public static void main(String[] args) {
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory("moAttack.xml");

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
