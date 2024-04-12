package com.mphasis.day04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component 
public class MyAspect  // This is an aspect class and telling IoC container to create object
{
	/*
	@Pointcut("execution(public void dataAccessOperations())")
	public void getPointcut1()
	{
		
	}
	*/
	@Pointcut("execution(* SystemArchitecture.*(..))")
	public void getPointcut2()
	{
		
	}
	
	/*
	@Before(value = "getPointcut1()")
	public void doAccessCheck()  //This is a JoinPoint Method(Method inside Bean class) -> This method we are applying Advice
	{
		System.out.println("Do Access Check..");
	}
	

	@After(value = "getPointcut2()")
	public void afterAccessData()
	{
		System.out.println("Application Ends..");
	}
	
	
	
	@AfterReturning(pointcut = "execution(* SystemArchitecture.*(..))",returning = "res")
	public void afterOperation(JoinPoint joinPoint,Object res)//joint point for getting method signature
	// and res to store the result returned from the function
	{
		System.out.println("When Method Returns some Value");
		System.out.println("Method Signature "+joinPoint.getSignature());
		System.out.println("Result is "+res);
		System.out.println("End of the Advice");
	}
	
	
	@AfterThrowing(pointcut = "execution(* SystemArchitecture.*(..))",throwing = "error")
	public void afterValidate(JoinPoint joinPoint,Throwable error)
	{
		System.out.println("If Exception is Thrown");
		System.out.println("Method Signature "+joinPoint.getSignature());
		System.out.println("Error is "+error);
		System.out.println("End of After Throwing");
	}
    */
	
	@Around("getPointcut2()")
	public Object aroundAdvice(ProceedingJoinPoint pJoinPoint)
	{
		Object obj = null;
		
		try 
		{
		    //Before
			System.out.println("Hello Welcome to AOP class Before");
			obj = pJoinPoint.proceed();
			//After
			System.out.println("Thank You !! After");
		} 
		catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}


