package single;

public class Single {
	private Single() {
	}

	private static class SingleHolder {
		private static final Single mInstance = new Single();
	}

	public static Single getInstance() {
		return SingleHolder.mInstance;
	}

}
