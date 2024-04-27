package org.example.beanmanagement.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.example.beanmanagement.config.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeController {

    @Autowired
    private SingletonBean singletonBean;


    @Autowired
    private ApplicationContext context;

    @GetMapping("/singleton")
    public int getSingletonCounter() {
        return singletonBean.getCounterAndIncrement();
    }

    @GetMapping("/prototype")
    public int getPrototypeCounter() {
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        return prototypeBean.getCounterAndIncrement();
    }

    @GetMapping("/request")
    public int getRequestCounter(HttpServletRequest request) {
        RequestBean requestBean = (RequestBean) request.getAttribute("requestBean");
        if (requestBean == null) {
            requestBean = context.getBean(RequestBean.class);
            request.setAttribute("requestBean", requestBean);
        }
        return requestBean.getCounterAndIncrement();
    }

    @GetMapping("/session")
    public int getSessionCounter(HttpSession session) {
        SessionBean sessionBean = (SessionBean) session.getAttribute("sessionBean");
        if (sessionBean == null) {
            sessionBean = context.getBean(SessionBean.class);
            session.setAttribute("sessionBean", sessionBean);
        }
        return sessionBean.getCounterAndIncrement();
    }
}
