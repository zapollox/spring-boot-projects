package com.apollo.business.listener;

/**
 * Created by apollo on 2018/9/3.
 */

import com.apollo.thread.RequestProcessorThreadPool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 注册监听器
 */
@Component
@Slf4j
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //初始化自定的线程池以及队列
        RequestProcessorThreadPool.init();
    }
}
