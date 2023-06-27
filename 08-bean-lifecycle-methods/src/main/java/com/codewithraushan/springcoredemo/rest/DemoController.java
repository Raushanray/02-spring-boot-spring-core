package com.codewithraushan.springcoredemo.rest;

import com.codewithraushan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private fields for the dependency

    private Coach myCoach;

    private Coach anotherCoach;

    @Autowired
    public  DemoController(
            @Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In Constructor :" + getClass().getSimpleName());
        myCoach  = theCoach;

    }
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }



}
