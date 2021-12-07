package edu.soft2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAop {
//    private static final Logger log = Logger.getLogger(UserAop.class);
    @Pointcut("execution(* edu.soft2.service..*.*(..))")
    public void pointA(){}
    @Before(value = "pointA()")
    public void beforeA(){System.out.println("userAop前置");}
    @After(value = "pointA()")
    public void afterA(){System.out.println("userAop后置");}
    @Around(value = "pointA()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object res = null;
//        System.out.println("前环绕增强");//环绕增强的前环绕
        System.out.println("执行目标对象"+pjp.getTarget()+"的"+pjp.getSignature().getName()+"()方法");




        res = pjp.proceed();//执行方法
        System.out.println("已经执行目标对象"+pjp.getTarget()+"的"+pjp.getSignature().getName()+"()方法");
        return res;
//        System.out.println("后环绕增强");
    }
    @AfterReturning(value = "pointA()",returning = "result")
    public void afterRe(JoinPoint jp,Object result){
        System.out.println("执行完毕"+jp.getTarget()+"的"+jp.getSignature().getName()+"()方法，返回值为"+result);
    }
}
