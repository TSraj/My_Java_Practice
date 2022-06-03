package First;

public class VariableTest1 {
	static int x = 11;
	static int y = 22;
	
	public void method1(int x) {
		VariableTest1 t = new VariableTest1();
		this.x = 33;
		y = 44;
		
		System.out.println("VariableTest1.x = "+VariableTest1.x);
		System.out.println("t.x = "+t.x);
		System.out.println("t.y = "+t.y);
		System.out.println("y : "+y);
	}
	
	public static void main(String[] args) {
		VariableTest1 t = new VariableTest1();
		t.method1(5);
	}
}
