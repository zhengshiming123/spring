package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by h on 2017/10/13.
 */
public class ReflectTest {

    public static Car initByDefaultConst() throws Exception {

        //通过类转载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("com.smart.reflect.Car");

        //获取默认类构造器对象并用它实例化Car
        Constructor<?> constructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) constructor.newInstance();

        //通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "kiv");

        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "blue");

        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        return car;

    }

    public static void main(String[] args) {
        try {
            Car car = initByDefaultConst();
            car.introduce();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
