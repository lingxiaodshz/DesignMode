package factoryMethod;

public class Test {

	public static void main(String[] args) {
		ProductCreator creator = new ProductCreator();
		
		Product1 product1 = creator.create(Product1.class);
		product1.commonMethod();
		product1.product();
		
		Product2 product2 = creator.create(Product2.class);
		product2.commonMethod();
		product2.product();
		
	}

}
