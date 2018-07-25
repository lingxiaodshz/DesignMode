package proxyDynamic;

import java.lang.reflect.Proxy;

public class ProxyDynamicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject subject = new RealSubject();
		ProxyHandler proxyHandler = new ProxyHandler(subject);
		Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
				RealSubject.class.getInterfaces(), proxyHandler);
		proxySubject.doSomething();

	}

}
