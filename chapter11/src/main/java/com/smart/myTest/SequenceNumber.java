package com.smart.myTest;

/**
 * Created by h on 2017/11/1.
 */
public class SequenceNumber {
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };
}
