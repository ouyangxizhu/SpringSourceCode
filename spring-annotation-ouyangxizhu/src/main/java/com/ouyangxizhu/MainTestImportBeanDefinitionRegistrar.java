package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigImportBeanDefinitionRegistrar;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;

public class MainTestImportBeanDefinitionRegistrar {
    public static void main(String[] args) {
        PrintBeanDefinitionNamesUtils.printBeanNames(MainConfigImportBeanDefinitionRegistrar.class);
    }
}
