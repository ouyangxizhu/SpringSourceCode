package com.ouyangxizhu;

import com.ouyangxizhu.ext.ExtConfig;
import com.ouyangxizhu.ext.beandefinitionregistrypostprocessor.MainConfigBeanDefinitionRegistryPostProcessor;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestBeanDefinitionRegistryPostProcessor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigBeanDefinitionRegistryPostProcessor.class);
        PrintBeanDefinitionNamesUtils.printBeanNames(context);
    }
}
