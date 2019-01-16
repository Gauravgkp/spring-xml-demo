package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanFactoryAware, BeanNameAware, ApplicationContextAware {
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie(){}

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In BeanFactory");
    }

    public void setBeanName(String s) {
        System.out.println("In BeanName");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("In application");
    }
}
