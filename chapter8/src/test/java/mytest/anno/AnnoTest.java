package mytest.anno;


import com.smart.anno.*;
import com.smart.anno.NeedTest;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by h on 2017/10/31.
 */
public class AnnoTest {

    @Test
    public void test01() {
        //①得到ForumService对应的class对象
        Class<ForumService> clazz = ForumService.class;

        //②得到ForumService所以得Method对象数组
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println(methods.length);
        for (Method method : methods) {

            //③获得方法上所以标注注解的对象
            NeedTest annotation = method.getAnnotation(NeedTest.class);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            NeedTest declaredAnnotation = method.getDeclaredAnnotation(NeedTest.class);
            System.out.println("declaredAnnotations===="+declaredAnnotation);
            if (annotation != null){
                if (annotation.value()){
                    System.out.println(method.getName()+"需要测试");
                }else {
                    System.out.println(method.getName() + "不需要测试");
                }
            }
            System.out.println(method);

        }


    }
}
