package com.ouyangxizhu;

import com.ouyangxizhu.bean.Person;
import com.ouyangxizhu.config.MainConfigScope;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestScope {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigScope.class);
        System.out.println("IOC容器创建完成");
        Person per = (Person) context.getBean("person");
        Person per1 = (Person) context.getBean("person");
        System.out.println(per);
        System.out.println(per1);
        System.out.println(per == per1);
    }
}
