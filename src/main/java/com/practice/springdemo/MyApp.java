package com.practice.springdemo;

public class MyApp {
    public static void main(String[] args){
        // Create the object
        Coach theCoach = new TrackCoach();
        // use the object
        System.out.println(theCoach.getDailyWrokout());
    }
}
