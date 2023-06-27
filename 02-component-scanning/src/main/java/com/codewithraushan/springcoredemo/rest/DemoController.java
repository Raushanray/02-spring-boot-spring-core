package com.codewithraushan.springcoredemo.rest;

import com.codewithraushan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private fields for the dependency

    private Coach myCoach;

    //define a constructor for dependency injection
    @Autowired
    public DemoController(Coach thCoach){
        myCoach = thCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
