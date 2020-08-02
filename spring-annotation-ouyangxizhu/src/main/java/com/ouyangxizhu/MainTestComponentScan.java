package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

public class MainTestComponentScan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigComponentScan.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
