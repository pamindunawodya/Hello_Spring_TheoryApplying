package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


public class A implements DI,  BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

@Autowired

//Bean ID eken thama identify karaganne,@Primary duplicate unoth :(Dependany ek use karana kentm theeranaya krnn puluwn kwd select karaganne kyl)
//@Qualifier("c")
    private  BSuper m;

//Constructor injection
//@Autowired
//    public A(BSuper bb){
//        this.m=bb;
//        System.out.println("instatiate Class A");
//    }

    //Setter method Injection
//    @Autowired
//    public void setInjection(BSuper bb){
//        this.m=bb;
//    }

    public void sendReqToB(){
       m.callMe();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware :A ");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware :A ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Bean :A ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean :A  ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware :A");
    }

    @Autowired
//    @Qualifier :me annotation ek use karann puluwn property ekkt witarayi
    @Override
    public void setInjection(BSuper bb) {
        //Interface throught Injection method in DI
        //Applying DI through Loose Coupling (Setter method use kloth Tigth Coupling Wenwa)
        this.m=bb;
    }
}
