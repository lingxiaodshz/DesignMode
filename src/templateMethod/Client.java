package templateMethod;

public class Client {

	public static void main(String[] args) {
		AbstractClass class1 = new ConcreateClass1();
		AbstractClass class2 = new ConcreateClass2();

		class1.setDoAnything(false);
		class1.templateMethod();

		class2.templateMethod();
	}

}
