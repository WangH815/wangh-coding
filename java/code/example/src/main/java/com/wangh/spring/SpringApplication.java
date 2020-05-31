package com.wangh.spring;

import com.wangh.spring.common.HelloWorld;
import com.wangh.spring.common.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("================================");
        System.out.println("简单Bean示例:");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.printHello();

        System.out.println("================================");
        Customer customerDefaultAutowire = (Customer) context.getBean("customerDefaultAutowire");
        System.out.println("默认自动装配:");
        System.out.println(customerDefaultAutowire.getPerson().getName() + ":"
                + customerDefaultAutowire.getPerson().getAge());

        System.out.println("================================");
        Customer customerByNameAutowire = (Customer) context.getBean("customerByNameAutowire");
        System.out.println("ByName自动装配:");
        System.out.println(customerByNameAutowire.getPerson().getName() + ":"
                + customerByNameAutowire.getPerson().getAge());

        System.out.println("================================");
        System.out.println("ByType自动装配:");
        Customer customerByTypeAutowire = (Customer) context.getBean("customerByTypeAutowire");
        System.out.println(customerByTypeAutowire.getAddress().getMyAddress());

        System.out.println("================================");
        System.out.println("构造器自动装配:");
        Customer customerConstructorAutowire = (Customer) context.getBean("customerConstructorAutowire");
        System.out.println(customerConstructorAutowire.getLanguage().getName());

    }

}
