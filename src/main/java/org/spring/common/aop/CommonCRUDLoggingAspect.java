package org.spring.common.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * Created by bangae1 on 2015-12-11.
 */
public class CommonCRUDLoggingAspect {

    protected Logger log = null;

    public void logger(JoinPoint joinPoint) {
        log = LogManager.getLogger(joinPoint.getTarget().getClass().getName());
        log.debug("before :::::::  " + joinPoint.getSignature().getName());
    }

    public void transfer(JoinPoint joinPoint, Exception exception) {
        log = LogManager.getLogger(joinPoint.getTarget().getClass().getName());
        StringBuffer sb = new StringBuffer();
        StackTraceElement[] sts = exception.getStackTrace();
        for(StackTraceElement st : sts) {
            sb.append(st.toString() + "\t\n");
        }
        log.error(sb.toString());
    }

}
