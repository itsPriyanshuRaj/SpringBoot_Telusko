package org.priyanshuRaj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // dev obj = (dev) context.getBean("dev");
        // search by type, no need of typecasting in this
        dev obj = context.getBean(dev.class);
        obj.build();
        // obj.setAge(18);
        // System.out.println(obj.getAge());
    }
}
