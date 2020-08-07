package com.ouyangxizhu.utils;

import com.ouyangxizhu.config.MainConfigImport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrintBeanDefinitionNamesUtils {
    public static void printBeanNames(Class<?> clazz) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(clazz);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("===========");
        System.out.println("共有" + beanDefinitionNames.length + "个bean");
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
    public static void printBeanNames(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("===========");
        System.out.println("共有" + beanDefinitionNames.length + "个bean");
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
