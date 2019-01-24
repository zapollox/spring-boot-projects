package com.apollo.thread;

import com.apollo.request.Request;
import com.apollo.request.RequestQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 请求处理线程池-自定义
 * Created by apollo on 2019/1/13.
 */
public class RequestProcessorThreadPool {
    //创建线程池,一个线程对应一个队列
    private ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public RequestProcessorThreadPool(){
        for(int i=0;i<10;i++){
            RequestQueue requestQueue = new RequestQueue();
            ArrayBlockingQueue<Request> queue = new ArrayBlockingQueue<Request>(100);
            requestQueue.addQueue(queue);
            threadPool.submit(new RequestProcessorThread(queue));
        }
    }

    /**
     * 静态内部类的方式实现单例,保证线程安全
     */
    private static class Singleton{
        private static RequestProcessorThreadPool instance;
        static{
            instance = new RequestProcessorThreadPool();
        }
        public static RequestProcessorThreadPool getInstance(){
            return instance;

        }
    }

    public static RequestProcessorThreadPool getInstance(){
        return Singleton.getInstance();
    }

    /**
     * 初始化方法
     */
    public static void init(){
        getInstance();
    }

}

