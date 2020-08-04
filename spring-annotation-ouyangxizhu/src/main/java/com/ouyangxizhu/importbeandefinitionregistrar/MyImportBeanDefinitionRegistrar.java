package com.ouyangxizhu.importbeandefinitionregistrar;

import com.ouyangxizhu.bean.Shape;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param importingClassMetadata 当前类注解信息
     * @param registry BeanDefinition注册类，可以调用org.springframework.beans.factory.support.BeanDefinitionRegistry#registerBeanDefinition(java.lang.String, org.springframework.beans.factory.config.BeanDefinition)方法手动将类注册到容器中
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean containsBeanDefinition = registry.containsBeanDefinition("org.springframework.context.annotation.internalRequiredAnnotationProcessor");
        if (containsBeanDefinition) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Shape.class);
            //可以指定类名
            registry.registerBeanDefinition("shape", beanDefinition);
        }
    }
}
