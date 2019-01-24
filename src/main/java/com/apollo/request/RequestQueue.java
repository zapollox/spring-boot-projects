package com.apollo.request;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 请求内存队列
 * Created by apollo on 2019/1/13.
 */
public class RequestQueue {
    //所有内存队列
    private List<ArrayBlockingQueue<Request>> queues = new ArrayList<ArrayBlockingQueue<Request>>();

    /**
     * 静态内部类的方式实现单例,保证线程安全
     */
    private static class Singleton{
        private static RequestQueue instance;
        static{
            instance = new RequestQueue();
        }
        public static RequestQueue getInstance(){
            return instance;

        }
    }

    public static RequestQueue getInstance(){
        return RequestQueue.Singleton.getInstance();
    }

    //添加内存队列
    public void addQueue(ArrayBlockingQueue<Request> queue){
        this.queues.add(queue);
    }
}
