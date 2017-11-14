package com.smart.editor;

import org.springframework.beans.factory.config.PropertyResourceConfigurer;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by h on 2017/10/19.
 */
public class Test01 {

    public static void main(String[] args) {
//        PropertyResourceConfigurer
        Locale locale = new Locale("zh","CN");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        double amt = 123456.78;
        System.out.println(currencyInstance.format(amt));
        Test01 test01 = new Test01();
        test01.test001();
        test01.test002();
    }

    public void test001(){
        Locale locale = new Locale("en", "US");
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        System.out.println(df.format(date));
    }

    public void test002(){

        String pattern1 = "aa";
        String pattern2 = "bb";

        Object[] params = {"John", new GregorianCalendar().getTime(), 1.0E3};

        String msg1 = MessageFormat.format(pattern1, params);

        MessageFormat mf = new MessageFormat(pattern2, Locale.US);
        String msg2 = mf.format(params);
        System.out.println(msg1);
        System.out.println(msg2);
    }
}
