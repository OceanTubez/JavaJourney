package a20230225;

public class StringLength {

	public static void main(String[] args) {
		
		String proto = "Arman is a good boy who lives in bellevue along with his parents.";
		char letter = 'r';
		
		System.out.println("Number of characters: " + returnString(proto, letter));
		System.out.println("(BETA) Number of characters: " + returnStringBETA(proto, letter));
		
	}
	
	public static int returnString(String string, char letter) {
		
		int numofchars = 0;
		
		for (int i = 0; i < string.length(); i++) {
			
			if (string.charAt(i) == letter) {
				
				numofchars++;
				
			}
			
		}
		
		return numofchars;
		
	}
	
	public static int returnStringBETA(String string, char letter) {
		
		int numofchars = 0;
		int iterator = 0;
		
		while (iterator < string.length()) {
			
			if (string.charAt(iterator) == letter) {
				
				numofchars++;
				
			}
			
			iterator++;
			
		}
		
		return numofchars;
	}
	
}
