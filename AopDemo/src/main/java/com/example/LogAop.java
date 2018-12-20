package com.example;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {  //Proxy
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		String signatureStr = joinpoint.getSignature().toLongString();
		System.out.println(signatureStr + " is start.");
		long start = System.currentTimeMillis();
		try{
			Object obj = joinpoint.proceed(); //대상객체의 실제 메소드 호출
			return obj;
		}finally{
			long end = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (end - start));
		}
	}
}
