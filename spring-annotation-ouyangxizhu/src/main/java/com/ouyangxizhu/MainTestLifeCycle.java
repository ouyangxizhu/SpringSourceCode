package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigLifeCycle;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestLifeCycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        System.out.println("IOC创建完成");
        context.getBean("car");
        System.out.println("IOC容器准备销毁");
        context.close();
        System.out.println("IOC容器销毁完成");

    }
}
