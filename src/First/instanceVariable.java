package First;

class instanceVariable {
		
	public String info;
	
	public instanceVariable() {
		this.info = "raj";
	}
	
	public static void main(String[] args) {
		instanceVariable name = new instanceVariable();
		System.out.println("The Information is: " +name.info);
	}
}
