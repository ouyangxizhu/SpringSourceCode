package com.ouyangxizhu.config;

import com.ouyangxizhu.importbeandefinitionregistrar.MyImportBeanDefinitionRegistrar;
import com.ouyangxizhu.importselector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyImportBeanDefinitionRegistrar.class})
public class MainConfigImportBeanDefinitionRegistrar {
}
