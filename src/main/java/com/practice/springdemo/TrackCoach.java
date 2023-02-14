package com.practice.springdemo;

import javax.sound.midi.Track;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){}


    public TrackCoach(FortuneService myfortuneService){
        this.fortuneService=myfortuneService;
    }

    @Override
    public String getDailyWrokout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }


    // bean lifecycle
    // add an init method
    public void doMyStartupStuff(){
        System.out.println("Trackcoach: inside method doMyStartupStuff");
    }
    // add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("Trackcoach: inside method doMyCleanupStuff");
    }
}
