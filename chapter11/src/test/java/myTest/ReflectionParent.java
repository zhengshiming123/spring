/**
 * 
 */
package myTest;

/**
 * @author Administrator
 * 
 */
public class ReflectionParent {
    public void start() {
        System.out.println("starting...");
    }

    protected void eat() {
        System.out.println("eating...");
    }

    void end() {
        System.out.println("ending...");
    }

    @SuppressWarnings("unused")
    private void sing() {
        System.out.println("sing...");
    }
}