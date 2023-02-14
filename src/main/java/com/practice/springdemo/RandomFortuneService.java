package com.practice.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private String[] fortuneArray = {"Happy1", "Happy2", "Happy3"};
    private Random rand = new Random();

    @Override
    public String getFortune() {
        int randomNum = rand.nextInt(fortuneArray.length);
        return fortuneArray[randomNum];
    }
}
