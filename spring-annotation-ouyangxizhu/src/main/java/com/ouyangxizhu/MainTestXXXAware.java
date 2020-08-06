package com.ouyangxizhu;

import com.ouyangxizhu.bean.Person;
import com.ouyangxizhu.bean.Red;
import com.ouyangxizhu.config.MainConfigXXXAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestXXXAware {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigXXXAware.class);
        Red bean = context.getBean(Red.class);
        System.out.println(bean.getApplicationContext() == context);
    }
}
