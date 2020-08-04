package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigImport;
import com.ouyangxizhu.utils.PrintBeanDefinitionNames;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestImport {
    public static void main(String[] args) {
        PrintBeanDefinitionNames.printBeanNames(MainConfigImport.class);
    }
}
