package ClassTutorial;import First.UserInput1;

public class learningClass {
	
	private int aNumber =12;
	private int anotherNumber;
	static private CarClass ourCar=new CarClass();
	static private CarClass ourAnotherCar; 
	public static void main(String[] args) {
		ourAnotherCar = new CarClass("Toyota", "Alion", "qwert", 1500, 30);
		System.out.println("Manufacturer: "+ourAnotherCar.manufacturerName);
		System.out.println("Model Name: "+ourAnotherCar.getModelName());
		System.out.println("Password Match: "+ourAnotherCar.matchPassword("qwertyuiop"));
		System.out.println("2nd car engine CC:"+ourAnotherCar.engineCC);
		
		System.out.println("amount of fuel: "+ourAnotherCar.presentAmountOffuel()+"L ");
		ourAnotherCar.addFuel(5);
//		System.out.println("We have added: "+ourAnotherCar.addFuel(5)+"Liter fuel");
		System.out.println("amount of fuel: "+ourAnotherCar.presentAmountOffuel()+"L ");
		ourAnotherCar.runForSeconds(60);
		System.out.println("amount of fuel: "+ourAnotherCar.presentAmountOffuel()+"L ");
	}
}
