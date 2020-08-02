package com.ouyangxizhu;

import com.ouyangxizhu.bean.Person;
import com.ouyangxizhu.config.MainConfigComponentScan;
import com.ouyangxizhu.config.MainConfigConfigurationBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestConfigurationBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigComponentScan.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
        System.out.println("===========");
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (int i = 0; i < beanNamesForType.length; i++) {
            System.out.println(beanNamesForType[i]);
        }
    }
}
