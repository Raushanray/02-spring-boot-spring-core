package com.codewithraushan.springcoredemo.config;

import com.codewithraushan.springcoredemo.common.Coach;
import com.codewithraushan.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
