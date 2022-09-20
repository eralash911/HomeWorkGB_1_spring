package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        //Human human = ctx.getBean("doBean", Human.class);
        Hospital hosp = ctx.getBean("hosp", Hospital.class);

        hosp.doSmth();

        ctx.close();
    }
}
