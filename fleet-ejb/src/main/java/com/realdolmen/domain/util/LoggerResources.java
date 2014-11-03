package com.realdolmen.domain.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.inject.Named;


public class LoggerResources {

    @Named
    @Produces
    public Logger createLogger() {
        return LoggerFactory.getLogger(getClass().getName());
    }

}
