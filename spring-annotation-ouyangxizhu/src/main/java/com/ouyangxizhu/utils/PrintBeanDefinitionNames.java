package com.ouyangxizhu.utils;

import com.ouyangxizhu.config.MainConfigImport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrintBeanDefinitionNames {
    public static void printBeanNames(Class<?> clazz) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(clazz);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
