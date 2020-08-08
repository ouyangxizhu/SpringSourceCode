package com.ouyangxizhu.ext.beandefinitionregistrypostprocessor;

import com.ouyangxizhu.bean.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    //BeanDefinitionRegistry Bean定义信息的保存中心，以后BeanFactory就是按照BeanDefinitionRegistry里面保存的每一个bean定义信息创建bean实例；
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("==================MyBeanDefinitionRegistryPostProcessor中的BeanDefinitionRegistryPostProcessor接口的postProcessBeanDefinitionRegistry方法=============");
        System.out.println("bean的数量" + registry.getBeanDefinitionCount());
        System.out.println("加入bean");
//        RootBeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);//第一种方式
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Blue.class).getBeanDefinition();//第二种方式
        registry.registerBeanDefinition("blue", beanDefinition);
        System.out.println("加入bean完成");
        System.out.println("bean的数量" + registry.getBeanDefinitionCount());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("==================MyBeanDefinitionRegistryPostProcessor中的BeanFactoryPostProcessor接口的postProcessBeanFactory方法=============");
        System.out.println("bean数量" + beanFactory.getBeanDefinitionCount());
        System.out.println("===============================");
    }
}
