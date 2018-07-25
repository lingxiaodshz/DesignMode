package proxyDynamic;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("subject do something ~~~~~~~~~~~~~~");
	}

}
