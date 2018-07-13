package factoryMethod;

public class ProductCreator extends Creator {

	@Override
	public <T extends Product> T create(Class<T> clazz) {
		Product product = null;
		try {
			product = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
		}
		return (T) product;
	}
}
