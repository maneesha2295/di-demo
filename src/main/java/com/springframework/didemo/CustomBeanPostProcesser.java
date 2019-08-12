package com.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcesser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBeanDemo){
            ((LifeCycleBeanDemo)bean).setBeanName("maneesha");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBeanDemo){
            ((LifeCycleBeanDemo) bean).LifeCycleDemoBean();
        }
        return bean;
    }
}
