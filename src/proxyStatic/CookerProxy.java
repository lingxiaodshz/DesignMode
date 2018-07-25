package proxyStatic;

public class CookerProxy implements ICook {

	private Cooker cooker;

	public CookerProxy(String name) {
		super();
		cooker = new Cooker(name);
	}

	@Override
	public void cook() {
		System.out.println("���");
		cooker.cook();
		System.out.println("�Է�");
	}

}
