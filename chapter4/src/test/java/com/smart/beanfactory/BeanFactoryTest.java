package com.smart.beanfactory;

import com.smart.reflect.Car;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;

/**
 * Created by h on 2017/10/13.
 */
public class BeanFactoryTest {

    public static void main(String[] args) throws IOException {


        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:conf/sys.properties");
        System.out.println(res.getURL());

        //被废弃
//        XmlBeanFactory factory = new XmlBeanFactory(res);
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        reader.loadBeanDefinitions(res);
        factory.getBean("car",Car.class);

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"AA.xml","BB.xml"});
//        WebApplicationContext
    }
}
