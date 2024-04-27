package org.example.beanmanagement.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    private int counter = 0;

    public int getCounterAndIncrement() {
        return counter++;
    }
}

/*
        A new instance of the bean is created each time it is requested.
 */