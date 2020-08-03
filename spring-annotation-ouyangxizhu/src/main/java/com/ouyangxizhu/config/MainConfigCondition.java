package com.ouyangxizhu.config;

import com.ouyangxizhu.bean.Person;
import com.ouyangxizhu.condition.MacCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效；
@Conditional({MacCondition.class})
@Configuration
public class MainConfigCondition {
    @Bean
    @Conditional({MacCondition.class})
    public Person mac(){
        return new Person("mac", 48);
    }
    @Bean
    public Person bill(){
        return new Person("bill", 68);
    }
}
