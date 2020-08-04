package com.ouyangxizhu.config;

import com.ouyangxizhu.bean.Dog;
import org.springframework.context.annotation.Bean;

public class MainConfigPostConstructPreDestroy {
    @Bean
    public Dog dog() {
        return new Dog();
    }
}
