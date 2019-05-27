package com.stackroute.awareinterface;

import org.springframework.beans.factory.BeanNameAware;

public class beanNameAwareDemo implements BeanNameAware {
    @Override
    public void setBeanName(String movie) {
        System.out.println(movie);
    }
}
