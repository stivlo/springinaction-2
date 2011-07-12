package com.springinaction.chapter04;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.springinaction.chapter02.springidol.PerformanceException;

public class AudienceAroundAdvice implements MethodInterceptor {

    private Audience audience;

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            audience.takeSeats();
            audience.turnOffCellPhones();
            Object returnValue = invocation.proceed();
            return returnValue;
        } catch (PerformanceException ex) {
            audience.demandRefund();
            throw ex;
        }
    }

}
