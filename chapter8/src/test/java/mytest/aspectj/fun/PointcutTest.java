package mytest.aspectj.fun;

import com.smart.*;
import com.smart.aspectj.advanced.TestNamePointcut;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by h on 2017/10/31.
 */
public class PointcutTest {

    @Test
    public void pointcut(){

        String configPath = "classpath:com/smart/aspectj/fun/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        NaiveWaiter naiveWaiter = (NaiveWaiter) ctx.getBean("naiveWaiter");
        NaughtyWaiter naughtyWaiter = (NaughtyWaiter)ctx.getBean("naughtyWaiter");
        naiveWaiter.serveTo("AA");
        naughtyWaiter.greetTo("bb");
    }

    @Test
    public void pointcut02(){
        String configPath = "com/smart/aspectj/fun/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        WaiterManager wm = new WaiterManager();
        NaiveWaiter naiveWaiter = (NaiveWaiter) ctx.getBean("naiveWaiter");
        wm.addWaiter(naiveWaiter);
        wm.addNaiveWaiter(naiveWaiter);
        naiveWaiter.greetTo("AA");
        naiveWaiter.serveTo("bb");
    }

    @Test
    public void pointcut03(){
        String configPath = "com/smart/aspectj/fun/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        NaiveWaiter naiveWaiter = (NaiveWaiter) ctx.getBean("naiveWaiter");
        naiveWaiter.greetTo("AA");
        naiveWaiter.serveTo("bb");
//        naiveWaiter.sell("b", "c");
        ((Seller) naiveWaiter).sell("a", "b");
    }

    @Test
    public void pointcut04(){
        String configPath = "com/smart/aspectj/advanced/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("naiveWaiter");

        waiter.greetTo("a");
    }

    @Test
    public void pointcut05(){
        String configPath = "com/smart/aspectj/advanced/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        NaiveWaiter waiter = (NaiveWaiter) ctx.getBean("naiveWaiter");

//        waiter.greetTo("a");
        waiter.smile("aa",11);
    }

    @Test
    public void pointcut06(){
        String configPath = "com/smart/aspectj/advanced/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        SmartSeller smartSeller = (SmartSeller) ctx.getBean("seller");

//        smartSeller.sell("aa","bb");
        smartSeller.checkBill(1);
    }

    @Test
    public void pointcut07(){
        String configPath = "com/smart/schema/beans2.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        NaiveWaiter waiter = (NaiveWaiter) ctx.getBean("naiveWaiter");
//        waiter.greetTo("a");
        ((Seller) waiter).sell("aa", "bb");
    }
}
