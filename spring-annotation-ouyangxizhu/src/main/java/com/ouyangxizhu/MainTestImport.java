package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigImport;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;

public class MainTestImport {
    public static void main(String[] args) {
        PrintBeanDefinitionNamesUtils.printBeanNames(MainConfigImport.class);
    }
}
