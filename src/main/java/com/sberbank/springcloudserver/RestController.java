package com.sberbank.springcloudserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ApplicationContext applicationContext;


    @GetMapping("/showAllBeans")
    public List<Class<? extends String>> getAllBeans() {
        return Arrays.stream(applicationContext.getBeanDefinitionNames()).map(String::getClass).collect(Collectors.toList());






    }
}
