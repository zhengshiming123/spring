package myTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by h on 2017/11/6.
 */
public class ThreadLocalTest01 {


    private Map valueMap = Collections.synchronizedMap(new HashMap());

    public void set(Object newValue){
        valueMap.put(Thread.currentThread(), newValue);
    }

    public Object get(){
        Thread thread = Thread.currentThread();
        Object o = valueMap.get(thread);
        if (o==null && !valueMap.containsKey(thread)){
            o = initialValue();
            valueMap.put(thread, o);
        }
        return o;
    }

    public void remove(){
        valueMap.remove(Thread.currentThread());
    }

    protected Object initialValue(){
        return null;
    }
}
