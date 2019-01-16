package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("In bean initialization.");
    }
    public void customDestroy() throws Exception{
        System.out.println("In custom Destroy");
    }
    public void destroy() throws Exception {
        System.out.println("In bean destroy.");
    }

    public void customInit() throws Exception{
        System.out.println("In custom INIT");
    }


}
