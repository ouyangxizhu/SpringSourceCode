package com.ouyangxizhu.config;

import com.ouyangxizhu.bean.Color;
import com.ouyangxizhu.factorybean.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class MainConfigFactoryBean {
    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
