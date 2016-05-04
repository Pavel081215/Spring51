package com.Spring.app;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Pavel on 04.05.2016.
 */
public class LogAspect {
    private static final Logger logger = Logger.getLogger(LogAspect.class);

    public String onExecute(ProceedingJoinPoint pjp) throws Throwable {
        logger.error("onExecute start");
        String result = (String) pjp.proceed();
        logger.error("onExecute finish");
        return result;
    }
}
