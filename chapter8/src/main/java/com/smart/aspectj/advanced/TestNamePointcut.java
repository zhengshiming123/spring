package com.smart.aspectj.advanced;

import org.aspectj.lang.annotation.Pointcut;

public class TestNamePointcut {
	@Pointcut("within(com.smart.*)")
    public void inPackage(){}
//	
//	@Pointcut("execution(* greetTo(..)))")
//    protected void greetTo(){}
//
    @Pointcut("inPackage() and greetTo()")
    public void inPkgGreetTo(){}

    public void greetTo(){}
}
