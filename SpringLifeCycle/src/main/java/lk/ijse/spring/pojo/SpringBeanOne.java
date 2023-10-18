package lk.ijse.spring.pojo;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component

public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne(){
        System.out.println("Spring bean:Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Spring BeanOne : Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring BeanOne: Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring BeanOne: Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring BeanOne: Initializing Bean (Ready)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring BeanOne: End Of the Bean (Destroyed)");
    }
}
