package com.Spring.app;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;


public class LogAspectMy {
    private static final Logger logger = Logger.getLogger(LogAspectMy.class);

    public Object onExecute(ProceedingJoinPoint pjp) throws Throwable {
        logger.error("onExecute start  " + pjp.getSignature() );
        Object result =  pjp.proceed();
        return result;


    }
}