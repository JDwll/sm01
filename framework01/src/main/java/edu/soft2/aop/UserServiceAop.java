package edu.soft2.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class UserServiceAop {
    @Pointcut("execution(* edu.soft2..*.*(..))")
    public void pointB(){}
    @Before("pointB()")
    public void beforeB(){System.out.println("userServiceAop前置");}
    @After("pointB()")
    public void afterB(){System.out.println("userServiceAop后置");}
}
