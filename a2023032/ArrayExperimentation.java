package a2023032;

import utilities.ezprinter;
import java.util.Scanner;

public class ArrayExperimentation {
	
	public static void main(String[] args) {
		
		int[] x = {20, 5, 1, 5};
		
		x[3] = 2;
		
		for (int i: x) {
			
			ezprinter.print("Printing: " + i);;
			
		}
		
		ezprinter.print("---------------------");
		
		protoFindNumbers();
		
		ezprinter.print("---------------------");
		
		addAllElements();
		
		ezprinter.print("----------------------");
		
		findMaxAndMin();
		
	}
	
	public static void findNumbers() {
		
		int listToCheck[] = {1, 2, 4, 2, 1, 4, 5, 2, 1, 5, 7, 9, 1, 1, 1, 2, 3, 8, 0, 0, 9, 8, 7};
		int numberAmount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		ezprinter.print("Enter the number to check for in the array..");
		
		int numToCheck = sc.nextInt();
		
		for (int i: listToCheck) {
			
			if (i == numToCheck) {
				
				numberAmount++;
				
			}
			
			
		}
		
		ezprinter.print("Amount of times " + numToCheck + " has appeared in the array: " + numberAmount);
		
	}
	
	public static void protoFindNumbers() {
		
		int[] listToCheck = {1, 2, 4, 2, 1, 4, 5, 2, 1, 5, 7, 9, 1, 1, 1, 2, 3, 8, 0, 0, 9, 8, 7};
		int[] amountNumbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for (int i: listToCheck) {
			
			switch (i) {
			
			case 0: {
				
				amountNumbers[0]++;
				
				break;
				
			} case 1: {
				
				amountNumbers[1]++;
				
				break;
				
			} case 2: {
				
				amountNumbers[2]++;
				
				break;
				
			} case 3: {
				
				amountNumbers[3]++;
				
				break;
				
			} case 4: {
				
				amountNumbers[4]++;
				
				break;
				
			} case 5: {
				
				amountNumbers[5]++;
				
				break;
				
			} case 6: {
				
				amountNumbers[6]++;
				
				break;
				
			} case 7: {
				
				amountNumbers[7]++;
				
				break;
				
			} case 8: {
				
				amountNumbers[8]++;
				
				break;
				
			} default: {
				
				amountNumbers[9]++;
				
			}
			
			}
			
		}
		
		ezprinter.print("// Amount of numbers in the array //");
		
		for (int iterator = 0; iterator <= 9; iterator++) {
			
			ezprinter.print("Amount of " + iterator + ": " + amountNumbers[iterator]);
			
		}
		
	}
	
	public static void addAllElements() {
		
		int[] arrayToSum = {1, 2, 3, 1, 2, 3, 4, 5, 1, 2, 6, 2, 8, 6, 2, 3, 6, 1, 3, 4, 5, 6, 8, 1, 2, 3, 1, 9, 0, 2, 0};
		int totalAmount = 0;
		
		for (int i = 0; i < arrayToSum.length; i++) {
			
			totalAmount += arrayToSum[i];
			
		}
		
		ezprinter.print("Sum of elements in the array: " + totalAmount);
		
	}
	
	public static void findMaxAndMin() {
		
		int[] arrayToFindIn = {1, 2, 6, 2, 1, 6, 9, 2, 0, 1, 2, 6};
		int Max = 0;
		int Min = 0;
		
		for (int i = 0; i < arrayToFindIn.length; i++) {
			
			if (i > Max) {
				
				Max = i;
				
			} else if (i < Min) {
				
				Min = i;
				
			}
			
		}
		
		ezprinter.print("Biggest (Max) Number in the Array: " +  Max);
		ezprinter.print("Smallest (Min) Number in the Array: " + Min);
				
	}

}
