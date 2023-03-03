package a20230225;

public class ReverseString {

	public static void main(String[] args) {
		
		String proto = "Arman is a good boy";
		
		System.out.println("Normal String: " + proto);
		System.out.println("Reversed String: " + reverseString(proto));
		
	}
	
	public static String reverseString(String string) {
		
		String finishedString = "";
		
		for (int i = string.length()-1; i >= 0; i--) {
			
			finishedString += string.charAt(i);
			
		}
		
		return finishedString;
		
	}
	
}
