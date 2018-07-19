package templateMethod;

public class ConcreateClass1 extends AbstractClass {

	@Override
	protected void doSomething() {
		System.out.println("ConcreateClass1 doSomething");
	}

	@Override
	protected void doAnything() {
		System.out.println("ConcreateClass1 doAnything");
	}

}
