package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintAdvice {
      @Before("execution(* com.tka.HomeController.getMessage())")
	public void beforeMsg() {
		System.err.println("Hello");
	}
      @After("execution(* com.tka.HomeController.getMessage())")
      public void afterMsg() {
    	  System.err.print("bye");
      }
      
      
      @Around("execution(* com.tka.HomeController.getmsg1())")
      public Object aroundMsg(ProceedingJoinPoint p) throws Throwable  {
    	  System.err.println("Before Message,Hello Students");
    	  Object result=p.proceed();
    	  System.err.println("After Message,Bye Students");
    	 return  result;
      }
}
