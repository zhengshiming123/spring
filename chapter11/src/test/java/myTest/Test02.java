package myTest;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Method;

/**
 * Created by h on 2017/11/8.
 */
public class Test02 {

    public void test01(){
//        propagation_required;

    }

    /** 循环向上转型, 获取对象的 DeclaredMethod
     *
     * @param object
     *        : 子类对象
     * @param methodName
     *        : 父类中的方法名
     * @param parameterTypes
     *        : 父类中的方法参数类型
     * @return 父类中的方法对象 */
    public static Method getDeclaredMethod(Object object, String methodName) {
        Method method = null;

        for (Class<?> clazz = object.getClass(); clazz != Object.class; clazz = clazz.getSuperclass()) {
            for (Method m : clazz.getDeclaredMethods()) {
//                System.out.println(m);
                if (methodName.equals(m.getName())) {
                    method = m;
                    break;
                }

            }

            if (method == null) {
                continue;
            }
            else {
                break;
            }
        }

        return method;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.getClass());
        System.out.println(stringBuilder.getClass().getDeclaredMethods());
        System.out.println(stringBuilder.getClass().getSuperclass());
//        Test02.getDeclaredMethod(stringBuilder, "lenth");
        Method declaredMethod = getDeclaredMethod(stringBuilder, "length");
        System.out.println(declaredMethod);
    }
}
