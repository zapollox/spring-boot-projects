package com.apollo.thread;

import com.apollo.request.Request;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

/**
 * 自定义线程
 * Created by apollo on 2019/1/13.
 */
public class RequestProcessorThread implements Callable<Boolean>{
    //监控的内存队列
    private ArrayBlockingQueue<Request> queue;

    public RequestProcessorThread(ArrayBlockingQueue<Request> queue){
        this.queue = queue;
    }


    @Override
    public Boolean call() throws Exception {
        while (true){
            break;
        }
        return true;
    }
}
