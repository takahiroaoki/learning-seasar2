package org.seasar.example.s2container.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

public class MyLogging extends AbstractInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Class<?> clss = getTargetClass(invocation);
        Method method = invocation.getMethod();

        System.out.println("[START] " + clss.getSimpleName() + "#" + method.getName() + "()");
        Object result = invocation.proceed();
        System.out.println("[END] " + clss.getSimpleName() + "#" + method.getName() + "()");
        return result;
    }

}
