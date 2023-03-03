package a2023219;

public class JavaOperators {
	
	public static void main(String[] args) {
		
		int x = 20;
		int y = 10;
		int z = 5;
		int a = 30;
		int b = 25;
		int c = 35;
		
		x %= 3;
		y &= 3;
		z |= 3;
		a ^= 3;
		b >>= 3;
		c <<= 3;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		System.out.println("Calculator Method Output");
		
		System.out.println("Addition: " + sum(x, y));
		System.out.println("Multiplication: " + multi(x, y));
		System.out.println("Subtraction: " + sub(x, y));
		System.out.println("Division: " + div(x, y));
		System.out.println("Modulus: " + modu(x, y));
		
	}
	
	public static int sum(int a, int b) {
		
		return a + b;
		
	}
	
	public static int multi(int a, int b) {
		
		return a * b;
		
	}
	
	public static int sub(int a, int b) {
		
		return a - b;
		
	}
	
	public static int div(int a, int b) {
		
		return a / b;
		
	}
	
	public static int modu(int a, int b) {
		
		return a % b;
		
	}

}
