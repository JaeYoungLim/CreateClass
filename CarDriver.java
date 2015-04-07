
public class CarDriver {
	public static void main(String [] args) {
		//instantiation
		Car localVariableCar = new Car("Sky-Blue", 450, 1.8);
		System.out.println(localVariableCar);
		
		localVariableCar.setColor("Red");		
		System.out.println(localVariableCar.getColor());		
		System.out.println(localVariableCar.getHorsePower());		
		System.out.println(localVariableCar.getEngineSize());		
		System.out.println(localVariableCar.toString());

		localVariableCar.setHorsePower(750);
		System.out.println(localVariableCar.getColor());		
		System.out.println(localVariableCar.getHorsePower());		
		System.out.println(localVariableCar.getEngineSize());		
		System.out.println(localVariableCar.toString());

		localVariableCar.setEngineSize(3.5);
		System.out.println(localVariableCar.getColor());		
		System.out.println(localVariableCar.getHorsePower());		
		System.out.println(localVariableCar.getEngineSize());		
		System.out.println(localVariableCar.toString());

	}

}
