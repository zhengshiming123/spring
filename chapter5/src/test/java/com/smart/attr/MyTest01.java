package com.smart.attr;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by h on 2017/10/16.
 */
public class MyTest01 {

    @Test
    public void test01() {


        ApplicationContext context1 = new ClassPathXmlApplicationContext("com/smart/attr/beans1.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext(new String[]{"com/smart/attr/beans2.xml"}, context1);
        Boss boss = (Boss) context2.getBean("boss");
        System.out.println(boss.getCar());
    }

    @Test
    public void test02() {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/smart/attr/beans2.xml");
        Boss bean = (Boss) context.getBean("boss3");
        System.out.println(bean.getCar());
    }

    @Test
    public void test03() {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"com/smart/attr/beans3.xml"});
        BossTest01 boss3 = (BossTest01) context.getBean("boss4");
        System.out.println(boss3);
    }

    @Test
    public void test04() throws IOException {
        Properties pps = new Properties();
        //FileInputStream fileInputStream = new FileInputStream("com/smart/attr/a.properties");
        pps.load(new FileInputStream("conf/app-conf.properties"));
        Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
        while (enum1.hasMoreElements()) {
            String strKey = (String) enum1.nextElement();
            String strValue = pps.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }
    }

    @Test
    public void test05() throws IOException {
        Properties pps = new Properties();

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"com/smart/attr/beans3.xml"});

        BossTest01 boss5 = (BossTest01) context.getBean("boss5");
        System.out.println(boss5);
    }

    @Test
    public void test06() throws IOException {
        Properties pps = new Properties();

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"com/smart/attr/beans3.xml"});

        BossTest01 boss5 = (BossTest01) context.getBean("boss6");
        System.out.println(boss5);
    }
}
