package edu.soft2.ioc.coffee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
        CoffeeBean coffeeBean = (CoffeeBean) context.getBean("espressoBean");
        coffeeBean.drink();
    }
}
