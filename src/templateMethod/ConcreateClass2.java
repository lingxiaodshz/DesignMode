package templateMethod;

public class ConcreateClass2 extends AbstractClass {

	@Override
	protected void doSomething() {
		System.out.println("ConcreateClass2 doSomething");
	}

	@Override
	protected void doAnything() {
		System.out.println("ConcreateClass2 doAnything");
	}

	@Override
	protected boolean isDoAnything() {
		return false;
	}

}
