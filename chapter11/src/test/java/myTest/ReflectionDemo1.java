/**
 * 
 */
package myTest;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author Administrator
 * 
 */
public class ReflectionDemo1 extends Test02 {

    @SuppressWarnings("unused")
    private void read() {
        System.out.println("reading...");
    }

    public void write() {
        System.out.println("writing...");
    }

    /**
     * @param args
     */
    @Test
    public void testGetMethods() {
        Method[] methods = this.getClass().getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

    @Test
    public void testGetDeclaredMethods() {
        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

    @Test
    public void testGetDeclaredMethodsT() {
        StringBuilder stringBuilder = new StringBuilder();
        Test02.getDeclaredMethod(stringBuilder, "AA");
    }

}