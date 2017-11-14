package com.smart.injectfun;
import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boss2 implements MethodReplacer {
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		Car car = new Car();
		car.setBrand("美人豹");
		return car;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/smart/injectfun/beans.xml");
        Boss1 boss1 = (Boss1) context.getBean("boss1");
        System.out.println(boss1.getCar());
    }
}