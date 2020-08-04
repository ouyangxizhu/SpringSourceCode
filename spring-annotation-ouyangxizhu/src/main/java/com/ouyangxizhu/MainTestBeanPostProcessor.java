package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigBeanPostProcessor;
import com.ouyangxizhu.config.MainConfigInitializingBeanDisposableBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestBeanPostProcessor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigBeanPostProcessor.class);
        context.close();
    }
}
