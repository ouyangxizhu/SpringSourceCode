package com.ouyangxizhu;

import com.ouyangxizhu.bean.PersonValue;
import com.ouyangxizhu.config.MainConfigValuePropertySource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

public class MainTestValuePropertySource {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigValuePropertySource.class);
        PersonValue personValue = (PersonValue) context.getBean("personValue");
        System.out.println(personValue);
        System.out.println("============");
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("personValue.nickName");
        System.out.println(property);

    }
}
