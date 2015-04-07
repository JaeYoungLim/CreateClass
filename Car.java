
public class Car {
	//instance variable
	private String color;
	private int horsePower;
	private double engineSize;
	
	public Car() {
		this.color = "";
		this.horsePower = 0;
		this.engineSize = 0;
	}
	
	public Car(String color, int horsePower, double engineSize) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getHorsePower() {
		return this.horsePower;
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public double getEngineSize() {
		return this.engineSize;
	}
	
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public String toString() {
		return "[color: " + color + ", horse power: " + horsePower + ", engine size: " + engineSize + "]";
	}

}
