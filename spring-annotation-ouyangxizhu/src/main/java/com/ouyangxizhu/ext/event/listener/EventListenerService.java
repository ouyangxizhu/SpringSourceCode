package com.ouyangxizhu.ext.event.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EventListenerService {
    @EventListener({ApplicationEvent.class})
    public void listen(ApplicationEvent event){
        System.out.println("ListenerService监听到事件" + event);
    }
}
