package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        // We are using CricketCoach instead of Coach Interface because the methods getEmailAddress and getTeam are not part of the Interface and they are defined only in CricketCoach class

        // call methods on the bean
        System.out.println(theCoach.getDailyWrokout());
        System.out.println(theCoach.getDailyFortune());

        // call methods to get literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }
}
