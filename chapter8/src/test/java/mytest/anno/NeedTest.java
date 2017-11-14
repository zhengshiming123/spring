package mytest.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by h on 2017/10/31.
 */
@Retention(RetentionPolicy.RUNTIME) //①声明注解的保留期限
@Target(ElementType.METHOD) //②声明可以使用该注解的目标类型
public @interface NeedTest {    //③定义注解
    boolean value() default true;   //④声明注解成员
}

