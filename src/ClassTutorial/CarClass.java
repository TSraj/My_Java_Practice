package ClassTutorial;

public class CarClass {
	public String manufacturerName;
	private String modelName;
	
	private String carKeyValue;
	
	int engineCC; // default
	private float fuelAmount;
	final private float amountOfFuelConsumedPerSeconds = 0.02f;
	
	public CarClass() {
		// TODO Auto-generated constructor stub
		manufacturerName = new String();
		modelName = new String();
		engineCC = 1000;
		fuelAmount = 0;
	}
	
	public CarClass(String carName) {
		manufacturerName = new String(carName);
		modelName = new String();
		engineCC = 0 ;
		fuelAmount = 0;
	}
	
	//constructor
	public CarClass(String manu, String model, String key, int engineCC, float fuel) {
		manufacturerName = manu;
		modelName = model;
		carKeyValue = key;
		this.engineCC = engineCC;
		fuelAmount = fuel;
	}
	
	public float presentAmountOffuel() {
		return fuelAmount; 
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public String getModelName() {
		return modelName;
	}
	
	public void addFuel(float fuelAmount) {
		this.fuelAmount+= fuelAmount;
	}
	
	public void runForSeconds(int timeInSecond) {
		float usedFuel = timeInSecond*amountOfFuelConsumedPerSeconds;
		fuelAmount-=usedFuel;
	}
	
	public boolean matchPassword(String userInput) {
		return userInput.equals(carKeyValue);
	}
}
