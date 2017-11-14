package com.smart.injectfun;

import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by h on 2017/10/17.
 */
public class MyTest01 implements FactoryBean<MyTest01>{

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/smart/injectfun/beans.xml");
        Boss1 boss1 = (Boss1) context.getBean("boss1");
        System.out.println(boss1.getCar());


    }

    @Override
    public MyTest01 getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
