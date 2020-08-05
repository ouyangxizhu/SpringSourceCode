package com.ouyangxizhu.config;

import com.ouyangxizhu.bean.PersonValue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:/personValue.properties"})
@Configuration
public class MainConfigValuePropertySource {
    @Bean
    public PersonValue personValue() {
        return new PersonValue();
    }
}
