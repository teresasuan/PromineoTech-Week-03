//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03Package;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] values = {1,5,2,8,13,6};
		
		
		// 2. Print out the first element in the array
		System.out.println("\nQuestion 2:");

		System.out.println(values[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("\nQuestion 3:");

		System.out.println(values[values.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//"Exception in thread main...Index 6 out of bounds for length 6..."
		System.out.println("\nQuestion 4:");

		//System.out.println(values[6]);
		
		// 5. Print out the element in the array at position -1, what happens?
		//"Exception in thread main...Index -1 out of bounds for length -1..."
		System.out.println("\nQuestion 5:");

		//System.out.println(values[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6:");
		
		for (int i=0; i < 6; i++) {
			System.out.println(values[i]);
		}
		// 7. Write an enhanced for loop that prints out each element in the array
		
		System.out.println("\nQuestion 7:");
		
		for (int value : values) {
			System.out.println(value);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("\nQuestion 8:");

		int sum = 0;
		for (int value : values) {
			sum = sum + value;
			System.out.println("The sum of the array is: " + sum);	
		}
		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println("\nQuestion 9:");

		double average = sum/values.length;
			System.out.println("The average of the array is: " + average);
		
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println("\nQuestion 10:");

		for(int value : values) {
			if (value % 2 != 0) {
				System.out.println("Odd number: " + value);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"}; 
		System.out.println("\nQuestion 11:");

		for (String name : names) {
			System.out.println(name);
		}
		
		// 12. Calculate the sum of all the letters in the new array
		int sumLetters = 0;
		for (String name : names) {
			//for (int i=0; i < name.length(); i++) {
				//sumLetters = sumLetters++;
		//}
			sumLetters += name.length();
		}
			System.out.println("\nQuestion 12:");
			System.out.println("The sum of all the letters of the names in the array is: " + sumLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		//Calling Methods...
			
		//Calling Method 13:
		returnsNothingGreetingMethod("Tom"); //calling a method (below) and passes firstName & lastName into x & y
		
		//Calling Method 14:
		String resultFromGreetingMethod = returnsGreetingMethod("Susan");
		System.out.println(resultFromGreetingMethod);
		
		//Calling Method 15:
		numLetters("promineo", 15);
		
		//Calling Method 16:
		String anArray[] = {"red", "blue", "black", "purple", "pink", "orange"};
		doesExistInArray(anArray, "red");
		
		//Calling Method 17:
		int anotherArray[] = {16,34,65,87,12,3,76,9};
		smallestNumber(anotherArray);
		
		//Calling Method 18:
		double yetAnotherArray[] = {4.55, 2.33, 1.22, 6.55, 7.66};
		average(yetAnotherArray);

		//Calling Method 19:
		String arrayInput[] = {"w","wo","wor","word","words","wordzzzz"};
		elements(arrayInput);
		
		//Calling Method 20:
		String arrayInput2[] = {"w","wo","wor","word","words","wordzzzz"};
		sumEvenStringsGreater(arrayInput2);
		
		//Calling Method 21: 
		stringIsPalindrome("book");
	}
	
	//ACTUAL METHODS
	
	//Method #13:
	public static void returnsNothingGreetingMethod(String name) {
			String greeting = name + ", how are you today?";
			System.out.println("\nQuestion 13:");
			System.out.println(greeting);
	}
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

	//Method #14: 
	public static String returnsGreetingMethod(String name) {
		String greeting = name + ", how are you today?";
		System.out.println("\nQuestion 14:");
		return greeting;
	}
	
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? It involved fewer lines of code to call the method that does not return anything
		//		c. How are they different? The place from which the print command happens is different - within the method or outside of the method
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
	
	//Method #15: 
	public static void numLetters(String x, int y) {
		boolean numLetterGreater = x.length() > y;
		System.out.println("\nQuestion 15:");
		System.out.println("string = " + x + ", int = " + y);
		System.out.println("The number of letters in the string is greater than the int: " + numLetterGreater);
	}
	
	//Method #16:
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
	public static boolean doesExistInArray(String[] array, String letters) {
		System.out.println("\nQuestion 16:");
		boolean exists = false;

		for (String word : array) {
			if (word.equals(letters)) {
				exists = true;
				System.out.println(exists);
			}
		}
	 return exists;
	}
	
	//Method #17:
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	public static int smallestNumber(int[] numbers) {
		System.out.println("\nQuestion 17:");

		int minimum = numbers[0];
		
		for (int i=0; i < numbers.length; i++) {
			if (minimum > numbers[i]) {
				minimum = numbers[i];
			}
		}
		System.out.println(minimum);
		return minimum;
	}
	
	//Method #18:
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		public static double average(double[] anArray) {
			System.out.println("\nQuestion 18:");

			double sum = 0;
			for (double number : anArray) {
				sum = sum + number;
			}
			double average = sum/anArray.length;
			System.out.println("The average of the array is: " + average);
			return average;
		}
		
	//Method #19:
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		public static int[] elements(String[] words) {
			System.out.println("\nQuestion 19:");
			
			int[] newArray = new int[words.length];
			
			for (int i=0; i < words.length; i++) {
				newArray[i] = words[i].length();
				
			//int counter = 0;	
			//for (String word : words) {
				//if (word.length() > 0) {
				//int wordLength = word.length(); 
				//newArray[counter] = word.length();
				//counter++;
				System.out.println(newArray[i]);
			}
			return newArray;
		}	
		
		//Method #20:
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		public static boolean sumEvenStringsGreater(String stringArray[]) {
		System.out.println("\nQuestion 20:");

		int evenLetters = 0;
		int oddLetters = 0;
		boolean sumEvenIsGreater = false;
		
		for (String word : stringArray) {
			if (word.length() % 2 == 0) {
				evenLetters += word.length();
			} else {
				oddLetters += word.length();
			}
		}
		sumEvenIsGreater = evenLetters > oddLetters;
		System.out.println(sumEvenIsGreater);
		return sumEvenIsGreater;
		}

		//Method #21:
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		
		public static boolean stringIsPalindrome(String word) {
		System.out.println("\nQuestion 21:");
		
		for(int i=0; i < word.length()/2; i++) {
			if (word.charAt(i) == word.charAt(word.length()-i-1)) {
				System.out.println("True -" + word + "- is a palindrome.");
				return true;
			}	
		}
		System.out.println("False -" + word + "- is not a palindrome.");
		return false;
		}
}
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

