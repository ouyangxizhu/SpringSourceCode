package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigFactoryBean;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestFactoryBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigFactoryBean.class);
        PrintBeanDefinitionNamesUtils.printBeanNames(applicationContext);
        System.out.println("====================================");

        //工厂Bean获取的是调用getObject创建的对象
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        Object bean3 = applicationContext.getBean("colorFactoryBean");
        System.out.println("---> bean的类型：" + bean2.getClass());//bean的类型：class com.ouyangxizhu.bean.Color
        System.out.println("------->" + (bean2 == bean3));

        System.out.println("========================");
        //id前加&，可以打印工厂类本身
        Object bean4 = applicationContext.getBean("&colorFactoryBean");//class com.ouyangxizhu.factorybean.ColorFactoryBean
        System.out.println(bean4.getClass());
    }

}
