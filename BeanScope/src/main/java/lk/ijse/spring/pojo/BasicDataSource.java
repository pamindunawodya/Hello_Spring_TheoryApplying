package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//Pojo (Bean Class)
public class BasicDataSource implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public BasicDataSource(){
        System.out.println("Basic data source instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Ready To Use Bean");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Diaposable Bean");
    }



}
