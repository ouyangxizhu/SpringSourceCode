package com.ouyangxizhu.ext.application.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ApplicationEvent要监听的事件
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    //当容器发布事件以后会触发这个方法
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("监听到事件" + event);
    }
}
