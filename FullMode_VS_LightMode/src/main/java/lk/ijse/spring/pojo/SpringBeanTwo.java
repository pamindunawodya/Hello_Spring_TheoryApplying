package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanTwo(){
        System.out.println("=========================");
        System.out.println("Initiate SpringBeanTwo  ");

    }


    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware :B2");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware :B2");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware :B2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Ready To Use Bean :B2");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Diaposable Bean :B2");
    }
}
