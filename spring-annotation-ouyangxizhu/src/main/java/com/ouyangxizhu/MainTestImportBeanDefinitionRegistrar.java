package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigImportBeanDefinitionRegistrar;
import com.ouyangxizhu.config.MainConfigImportSelector;
import com.ouyangxizhu.utils.PrintBeanDefinitionNames;

public class MainTestImportBeanDefinitionRegistrar {
    public static void main(String[] args) {
        PrintBeanDefinitionNames.printBeanNames(MainConfigImportBeanDefinitionRegistrar.class);
    }
}
