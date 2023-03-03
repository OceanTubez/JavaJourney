package a20230225;

public class DayOfWeek {
	
	public static void main(String[] args) {
		
		findday(2);
		findday(7);
		findday(3);
		findday(4);
		findday(5);
		findday(1);
		findday(6);
		
	}
	
	public static void prnt(String y) {
		
		System.out.println(y);
		
	}
	
	public static void findday(int x) {
		
		switch (x) {
		
		case 1: 
			prnt("Monday");
			break;
		
		case 2:
			prnt("Tuesday");
			break;
		
		case 3:
			prnt("Wednesday");
			break;
			
		case 4:
			prnt("Thursday");
			break;
			
		case 5:
			prnt("Friday");
			break;
			
		case 6:
			prnt("Saturday");
			break;
		
		default:
			prnt("Sunday");
			
		
		}
		
	}

}
