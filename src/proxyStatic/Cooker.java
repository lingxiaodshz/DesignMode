package proxyStatic;

public class Cooker implements ICook {

	private String name;

	public Cooker(String name) {
		super();
		this.name = name;
	}

	@Override
	public void cook() {
		System.out.println(name + "ื๖ทน");
	}

}
