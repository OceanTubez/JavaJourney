package a20230225;

public class Loops {
	
	public static void main(String[] args) {
		
		int i = 1;
		int x = 20;
		
		while (i <= 10) {
			
			System.out.println(i);
			++i;
			
		}
		
		System.out.println("-------------------");
		
		do {
			
			x /= 10;
			++x;
			System.out.println(x);
			
		} while (x < 2);
		
		System.out.println("-------------------");
		
		for (int y = 0; y <= 20; y += 2) {
			
			System.out.println(y);
			
		}
		
	}

}
