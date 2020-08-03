package com.ouyangxizhu;

import com.ouyangxizhu.bean.Person;
import com.ouyangxizhu.config.MainConfigCondition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class MainTestCondition {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigCondition.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=========context.getBeanDefinitionNames()=========");
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        Map<String, Person> beans = context.getBeansOfType(Person.class);
        System.out.println("=========context.getBeansOfType(Person.class)========");
        for (Map.Entry entry : beans.entrySet()) {
            System.out.println("key:" + entry.getKey() + ", value:" + entry.getValue());
        }
    }
}
