package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component

public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne(){
        System.out.println("Initiate SpringBeanOne");

    }


    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware :B1");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware :B1");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware :B1");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Ready To Use Bean :B1");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Diaposable Bean :B1");
    }

    //InterBean Dependancy innovacation
//    @Bean
//    public SpringBeanTwo springBeanTwo(){
//        SpringBeanThree b1=springBeanThree();
//        SpringBeanThree b2=springBeanThree();
//        System.out.println(b1);
//        System.out.println(b2);
//        return new SpringBeanTwo();
//    }
//
//
//    @Scope("prototype")
//
//    public SpringBeanThree springBeanThree(){
//        return new SpringBeanThree();
//    }

}


