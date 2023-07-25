//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package Week03ArraysAndMethodsLab;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
int[] array = new int[6];
array[0] = 1;
array[1] = 5;
array[2] = 2;
array[3] = 8;
array[4] = 13;
array[5] = 6;

double sum = 0;

		
		// 2. Print out the first element in the array

//System.out.println(array[0]);

		
		// 3. Print out the last element in the array without using the number 5
		
//System.out.println(array[array.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
//System.out.println(array[6]);
//no element at that index, will get out of bounds error
		
		// 5. Print out the element in the array at position -1, what happens?

//System.out.println(array[-1]);
//no element at that index, will get out of bounds error
			
		// 6. Write a traditional for loop that prints out each element in the array
	
//for (int i = 0; i < array.length; i++) {
//	System.out.println(array[i]);
//}
			
		// 7. Write an enhanced for loop that prints out each element in the array

//for (int element : array) {
//	System.out.println(element);
//}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum


for (int i = 0; i < array.length; i++) {
	sum += array[i];
}
	System.out.println(sum);

			
		// 9. Create a new variable called average and assign the average value of the array to it

double average = sum / array.length;
System.out.println(average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd

for (int element : array) {
	if (element % 2 != 0) {
	System.out.println(element);
	} 
	}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

	String[] newArray = new String[4];
	newArray[0] = "Sam";
	newArray[1] = "Sally";
	newArray[2] = "Thomas";
	newArray[3] = "Robert";
	
	for (String element : newArray) {
	System.out.println(element);
	}
		
		// 12. Calculate the sum of all the letters in the new array

		int sumOfLetters = 0;
		for (String name: newArray) {
			sumOfLetters += name.length();
		}
		
		System.out.println(sumOfLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		String firstName = "Bob";
		greeting(firstName);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		
		String aloha = greeting2(firstName);
		System.out.println(aloha);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		String testString = "This is a test string";
		int testNumber = 15;
		boolean testMethod = numberOfLetters(testString, testNumber);
		System.out.println(testMethod);
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		String[] testArray = {"The Deepst Breath"};
		String movieName = "The Deepest Breath";
		boolean answer = doesStringExist(testArray, movieName);
		System.out.println(answer);
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	int[] listOfNumbers = {23,29,31,37,19,41,43,47};
		System.out.println(smallestNumber(listOfNumbers));
		
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] grades = {80,75,72,99,64,75,81,91,69};
		System.out.println(averageMethod(grades));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
int[] variable = stringLength(newArray);
for (int i = 0; i < newArray.length; i++) {
	System.out.println(variable[i]);
}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	


	// Method 13:
	public static void greeting(String name) {
		String hello = "Hello" + " " + name;
		System.out.println(hello);
	}

	// Method 14:

	public static String greeting2(String name) {
		String hello2 = "Hello" + " " + name;
		return hello2;
	}
	// Method 15:
public static boolean numberOfLetters(String x, int y) {
	if (x.length() > y) {
		return true;
	} else {
		return false;
	}
	
}
	
	// Method 16:

public static boolean doesStringExist(String[] x, String y) {
	for (String element : x) {
		if (element.equals(y)) {
			return true;
		} 
		} 
			return false;
		
	}


	// Method 17:
public static int smallestNumber(int[] x) {
	int smallest = x[0];
	for (int num : x) {
		if (num < smallest) {
			smallest = num;
			
		}
		
	} return smallest;
	
}
	
	// Method 18:

public static double averageMethod(double[] x) {
	double newSum = 0;
	double newAverage = 0;
	for (int i = 0; i < x.length; i++) {
		newSum += x[i];
}
	newAverage = newSum / x.length;
	return newAverage;
}	
	// Method 19:
 public static int[] stringLength (String[] x) {
 	int[] results = new int[x.length];
 	for (int i = 0; i < x.length; i++) {
 		results[i] = x[i].length();
 	}
 	return results;
 }
	
	// Method 20:
	
	
	// Method 21:
	

}