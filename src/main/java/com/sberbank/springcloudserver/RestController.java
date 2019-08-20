package com.sberbank.springcloudserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final ApplicationContext applicationContext;

    @Autowired
    public RestController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    @GetMapping("/showAllBeans")
    public List<String> getAllBeans() {
        return Arrays.stream(applicationContext.getBeanDefinitionNames()).collect(Collectors.toList());
    }
}
