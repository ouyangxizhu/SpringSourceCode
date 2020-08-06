package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigProfile;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestProfile {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        //1、创建一个applicationContext
        //2、设置需要激活的环境，可以设置多个
//        applicationContext.getEnvironment().setActiveProfiles("test","dev");
        applicationContext.getEnvironment().setActiveProfiles("test");
        //3、注册主配置类
        applicationContext.register(MainConfigProfile.class);
        //4、启动刷新容器
        applicationContext.refresh();
        PrintBeanDefinitionNamesUtils.printBeanNames(applicationContext);
    }
}
