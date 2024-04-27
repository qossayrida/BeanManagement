package org.example.beanmanagement.config;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    private int counter = 0;

    public int getCounterAndIncrement() {
        return counter++;
    }
}

/*
        Only one instance of the bean is created for the entire application context.
 */