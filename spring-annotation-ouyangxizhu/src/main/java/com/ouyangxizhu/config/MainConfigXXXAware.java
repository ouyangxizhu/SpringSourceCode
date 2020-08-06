package com.ouyangxizhu.config;

import com.ouyangxizhu.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigXXXAware {
    @Bean
    public Red red(){
        return new Red();
    }
}
