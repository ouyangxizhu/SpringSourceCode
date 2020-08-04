package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigImport;
import com.ouyangxizhu.config.MainConfigImportSelector;
import com.ouyangxizhu.utils.PrintBeanDefinitionNames;

public class MainTestImportSelector {
    public static void main(String[] args) {
        PrintBeanDefinitionNames.printBeanNames(MainConfigImportSelector.class);
    }
}
