package com.practice.springdemo;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService thefortuneService){
        this.fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWrokout(){
        return "Spend 30 mins of batting practice";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
