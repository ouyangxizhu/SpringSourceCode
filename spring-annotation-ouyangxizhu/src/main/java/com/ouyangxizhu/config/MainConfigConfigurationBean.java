package com.ouyangxizhu.config;

import com.ouyangxizhu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类=配置文件
 * 告诉spring这是一个配置类
 * 使用：new AnnotationConfigApplicationContext(MainConfigConfigurationBean.class);
 * 既然已经指定加载类的全限定类名，因此@Configuration其实是没必要的，试一下去掉这个注解也是可以的
 */
@Configuration
public class MainConfigConfigurationBean {
    /**
     * 给容器注册一个bean，类型为返回值类型，id为方法名
     *
     * @return
     */
//    @Bean(name = "person01")
    @Bean(value = "person02")
    public Person person01() {
        return new Person("ouyangxizhu", 20);
    }
}
