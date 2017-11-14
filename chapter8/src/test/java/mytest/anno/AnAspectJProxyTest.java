package mytest.anno;

import com.smart.NaiveWaiter;
import com.smart.Waiter;
import com.smart.aspectj.example.PreGreetingAspect;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Created by h on 2017/10/31.
 */
public class AnAspectJProxyTest {

    @Test
    public void proxy(){
        Waiter waiter = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        //设置目标对象
        factory.setTarget(waiter);
        //设置增强类
        factory.addAspect(PreGreetingAspect.class);
        //生产织入切面的代理对象
        Waiter proxy = factory.getProxy();
        proxy.greetTo("aa");
        proxy.serveTo("bb");

    }
}
