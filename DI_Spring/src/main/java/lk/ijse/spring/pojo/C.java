package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
//@Primary

public class C implements BSuper, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {



    public C(){
        System.out.println("instatiate Class :C");
    }

    public void callMe(){
        System.out.println("C call me method invoke");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware :C");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware :C ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Bean :C ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean :C ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware :C");
    }


}
