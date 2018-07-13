package factoryMethod;

public abstract class Product {
	public void commonMethod() {
		System.out.println("通用方法");
	}
	
	public abstract void product();
}
