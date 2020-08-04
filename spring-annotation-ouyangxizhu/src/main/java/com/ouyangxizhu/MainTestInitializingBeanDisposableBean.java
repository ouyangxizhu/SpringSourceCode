package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigImport;
import com.ouyangxizhu.config.MainConfigInitializingBeanDisposableBean;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestInitializingBeanDisposableBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigInitializingBeanDisposableBean.class);
        context.close();
    }
}
