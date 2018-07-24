package build;

public class Car {
	
	private String color;
	private String brand;
	private int wheel;
	
	private Car(Builder builder) {
		this.color = builder.color;
		this.brand = builder.brand;
		this.wheel = builder.wheel;
	}
	
	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public int getWheel() {
		return wheel;
	}

	static class Builder{
		private String color;
		private String brand;
		private int wheel;
		
		public Builder setColor(String color){
			this.color = color;
			return this;
		}
		public Builder setBrand(String brand){
			this.brand = brand;
			return this;
		}
		public Builder setWheel(int wheel){
			this.wheel = wheel;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", wheel=" + wheel + "]";
	}
	
}
