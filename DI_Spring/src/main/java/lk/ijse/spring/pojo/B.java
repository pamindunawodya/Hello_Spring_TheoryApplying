package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class B implements BSuper,BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public B(){
        System.out.println("instatiate Class B");
    }
    public void callMe(){
        System.out.println("B call me Method invoke ");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware :B");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware :B ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Bean :B ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean :B ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware :B");
    }
}
