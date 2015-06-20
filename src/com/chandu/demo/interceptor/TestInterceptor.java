package com.chandra.demo.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.chandra.demo.interceptor.binding.Validated;

@Interceptor
@Validated
public class TestInterceptor {

	@AroundInvoke
	public Object test(InvocationContext ctx) throws Exception {
		System.out.println("From AOP ==> '" + ctx.getMethod().getName() + "()' is called!!!");
		Object[] params = ctx.getParameters();
		if (params.length > 0) {
			String param = (String) params[0];
			System.out.println("Parameter = " + param);
			ctx.setParameters(new Object[] { param.toLowerCase() });
		}
		return ctx.proceed();
	}
}
