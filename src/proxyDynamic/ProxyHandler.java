package proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler<T> implements InvocationHandler {

	private T subject;

	public ProxyHandler(T subject) {
		super();
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("动态代理执行前");
		Object object = method.invoke(subject, args);
		System.out.println("动态代理执行后");
		return object;
	}

}
