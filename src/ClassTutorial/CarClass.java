package ClassTutorial;

public class CarClass {
	public String manufacturerName;
	public String modelName;
	public int engineCC;
	public float carWeight;
	public float fuelAmount;
	
	public CarClass() {
		// TODO Auto-generated constructor stub
		manufacturerName = new String();
		modelName = new String();
		engineCC = 0;
		carWeight = 0;
		fuelAmount = 0;
	}
	
	public CarClass(String carName) {
		manufacturerName = new String(carName);
		modelName = new String();
		engineCC = 0;
		carWeight = 0;
		fuelAmount = 0;
	}
	
	public float presentAmountOffuel() {
		return fuelAmount; 
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
}
