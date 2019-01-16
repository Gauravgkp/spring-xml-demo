package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String [] args){

        ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie) context1.getBean("movie1");

        Movie movie2=(Movie) context1.getBean("movie4");

        Movie movie3=(Movie) context1.getBean("movie3");

        Movie movie4=(Movie) context1.getBean("movie3");

        System.out.println(movie1==movie2);
        System.out.println(movie3==movie4);

    }
}