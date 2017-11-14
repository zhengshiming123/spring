package com.smart.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by h on 2017/10/13.
 */
public class PrivateCarReflect {

    public static void main(String[] args) throws Exception {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = classLoader.loadClass("com.smart.reflect.PrivateCar");
        PrivateCar privateCar = (PrivateCar) clazz.newInstance();
        Field colorField = clazz.getDeclaredField("color");

        //取消java语言访问检查已访问private变量
        colorField.setAccessible(true);
        colorField.set(privateCar,"red");

        Method driveMtd = clazz.getDeclaredMethod("drive", (Class[]) null);
        //clazz.getDeclaredMethod("drive"); //JDK1.5以后

        //取消Java语句访问检查已访问protected方法
        driveMtd.setAccessible(true);
        Object invoke = driveMtd.invoke(privateCar);
        System.out.println(invoke);


    }
}
