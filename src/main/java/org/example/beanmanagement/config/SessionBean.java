package org.example.beanmanagement.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class SessionBean {
    private int counter = 0;

    public int getCounterAndIncrement() {
        return counter++;
    }
}


/*
        A new bean instance is created for each HTTP session and is accessible throughout that session.
 */