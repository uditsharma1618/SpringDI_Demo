package org.example.Coach;

import org.example.Fortune.Fortune;

public class CricketCoach implements Coach{
    private Fortune fortune;
    private String email;
    private String team;

    //Literal Injection
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public CricketCoach(){}

    //Setter Injection
    public void setFortune(Fortune fortune){
        this.fortune = fortune;
    }
    @Override
    public String getDailyWorkout(){
        return "Practice Batting daily";
    }
    @Override
    public String getDailyFortune(){
        return fortune.getDailyFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
