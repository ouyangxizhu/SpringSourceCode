package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigImportSelector;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;

public class MainTestImportSelector {
    public static void main(String[] args) {
        PrintBeanDefinitionNamesUtils.printBeanNames(MainConfigImportSelector.class);
    }
}
