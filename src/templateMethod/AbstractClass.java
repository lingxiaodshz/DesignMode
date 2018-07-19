package templateMethod;

public abstract class AbstractClass {
	private boolean isDoAnything = true;

	protected abstract void doSomething();

	protected abstract void doAnything();

	public void templateMethod() {
		doSomething();
		if (isDoAnything()) {
			doAnything();
		}
	}

	protected boolean isDoAnything() {
		return isDoAnything;
	}

	public void setDoAnything(boolean isDoAnything) {
		this.isDoAnything = isDoAnything;
	}
}
