package org.example;

import org.example.Coach.Coach;
import org.example.Coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach baseballC = context.getBean("myBasketBallCoach", Coach.class);
        System.out.println(baseballC.getDailyWorkout());
        System.out.println(baseballC.getDailyFortune());
        Coach cricketC = context.getBean("myCricketCoach", Coach.class);
        System.out.println(cricketC.getDailyWorkout());
        System.out.println(cricketC.getDailyFortune());
        //To Demonstrate Literal Injection
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());





    }
}