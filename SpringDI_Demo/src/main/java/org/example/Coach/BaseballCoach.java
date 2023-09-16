package org.example.Coach;

import org.example.Fortune.Fortune;

public class BaseballCoach implements Coach{

    private Fortune fortune;
    public BaseballCoach(){}

    //Constructor Injection
    public BaseballCoach(Fortune fortune) {
        this.fortune = fortune;
    }
    @Override
    public String getDailyWorkout(){
        return "Practice throwing in the morning.";
    }
    @Override
    public String getDailyFortune(){
        return fortune.getDailyFortune();
    }
}
