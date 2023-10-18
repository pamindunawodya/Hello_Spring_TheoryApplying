package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanThree(){
        System.out.println("=========================");
        System.out.println("Inisiate SpringBeanThree ");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware :B3");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware :B3");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware :B3");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Ready To Use Bean :B3");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Diaposable Bean :B3");
    }
}
