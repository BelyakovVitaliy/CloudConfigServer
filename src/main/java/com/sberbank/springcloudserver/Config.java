package com.sberbank.springcloudserver;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class Config {


    @Bean
    @ConditionalOnProperty(name = "mainbean", havingValue = "enable")
    newArr iAmMainBean(){
        return new newArr();
    }

    @Bean
    @ConditionalOnBean(name = "iAmMainBean")
    public CondClass condClass() {
        return new CondClass();
    }


    class newArr extends ArrayList{

    }

    class CondClass{}
}
