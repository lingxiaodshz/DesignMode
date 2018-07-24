package build;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car.Builder().setColor("red").setBrand("±¦Âí").setWheel(4).build();
		System.out.println(car1);
		Car car2 = new Car.Builder().setColor("green").setBrand("±¼³Û").setWheel(5).build();
		System.out.println(car2);
	}
}
