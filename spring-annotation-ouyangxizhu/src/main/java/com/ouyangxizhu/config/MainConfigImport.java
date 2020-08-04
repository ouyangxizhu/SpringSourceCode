package com.ouyangxizhu.config;

import com.ouyangxizhu.bean.Color;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Color.class})//可写多个，因为是一个数组
public class MainConfigImport {
}
