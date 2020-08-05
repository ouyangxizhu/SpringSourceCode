package com.ouyangxizhu;

import com.ouyangxizhu.bean.PersonValue;
import com.ouyangxizhu.config.MainConfigValuePropertySource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestValuePropertySource {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigValuePropertySource.class);
        PersonValue personValue = (PersonValue) context.getBean("personValue");
        System.out.println(personValue);
    }
}
