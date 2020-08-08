package com.ouyangxizhu;

import com.ouyangxizhu.ext.application.listener.MainConfigApplicationListener;
import com.ouyangxizhu.ext.event.listener.MainConfigEventListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestEventListener {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigEventListener.class);
        //发布事件，打开publishEvent方法，可以看到需要传入一个ApplicationEvent参数，因此就new一个，由于是抽象类，就写成匿名内部类形式形式，并且构造器有一个Objeect类型参数，就写成publishEvent
        context.publishEvent(new ApplicationEvent(new String("自定义ApplicationEvent事件")) {
        });
        context.close();
    }
}
