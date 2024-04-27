package org.example.beanmanagement.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class RequestBean {
    private int counter = 0;

    public int getCounterAndIncrement() {
        return counter++;
    }
}

/*
        A new bean instance is created for each HTTP request and is accessible only within that request.
 */