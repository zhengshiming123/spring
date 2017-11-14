package com.smart.aspectj.example;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.smart.NaiveWaiter;
import com.smart.Waiter;
import org.testng.annotations.Test;

public class AspectJProxyTest {


	@Test
	public void proxy(){
		Waiter target = new NaiveWaiter();
		AspectJProxyFactory factory = new AspectJProxyFactory();
		//设置目标对象
		factory.setTarget(target);
		//添加切面类
		factory.addAspect(PreGreetingAspect.class);
		//生产织入切面的代理对象
		Waiter proxy = factory.getProxy();
		proxy.greetTo("John");
		proxy.serveTo("John");
	}
}
