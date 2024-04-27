package org.example.beanmanagement.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy called");
    }
}
