package com.ouyangxizhu;

import com.ouyangxizhu.ext.ExtConfig;
import com.ouyangxizhu.tx.TxConfig;
import com.ouyangxizhu.tx.UserService;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestExt {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);
        PrintBeanDefinitionNamesUtils.printBeanNames(context);
    }
}
