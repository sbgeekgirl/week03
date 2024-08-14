//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int [] nums = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
		System.out.println("Prompt 2");
		System.out.println(nums[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("Prompt 3");
		System.out.println(nums[nums.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("Prompt 4");
		//System.out.println(nums[6]);
		// throws out of bounds exception

		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("Prompt 5");

		//System.out.println(nums[-1]);
		// throws out of bounds exception

		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Prompt 6");
		for (int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Prompt 7");
		for (int num: nums){
			System.out.println(num);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("Prompt 8");
		int sum = 0;
		for (int num: nums){
			sum += num;
		}
		System.out.println("Sum = " + sum);

		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println("Prompt 9");
		double average = sum / nums.length;
		System.out.println("Average = " + average);
		
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		System.out.println("Prompt 10");
		for (int num: nums){
			if (num % 2 != 0){
				System.out.println(num);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		System.out.println("Prompt 11");
		String [] names = {"Sam", "Sally", "Thomas", "Robert"};
		System.out.println("Names = " + names);
		
		// 12. Calculate the sum of all the letters in the new array
		System.out.println("Prompt 12");
		int letterSum = 0;
		for (String name: names){
			letterSum += name.length();
		}
		System.out.println("letter sum = " + letterSum);

		// Call 13
		String myName = "Amy";
		greeting(myName);

		//Call 14
		System.out.println(greetingOutside(myName));

		//Call 15
		System.out.println(longerWord("LotsOfLetters", 8));
		System.out.println(longerWord("LotsOfLetters", 80));

		//Call 16
		String [] dumbList = {"dumb", "stupid", "moron", "genius"};
		String inList = "stupid";
		System.out.println(inArray(inList, dumbList));
		inList = "Mamas Boy";
		System.out.println(inArray(inList, dumbList));

		//Call 17
		System.out.println(smallestNumber(nums));

		//Call 18
		double [] arrayOfDoubles = {12.4, 15.7, 303.3, 19.2};
		System.out.println(arrayAverage(arrayOfDoubles));

		//Call 19
		String [] string19 = {"hello", "my", "name", "is", "amy"};
		int [] counts = wordLength(string19);
		for (int num: counts){
			System.out.println(num);
		}

		//Call 20
		System.out.println(evensOrOdds(string19));

		//Call 21
		System.out.println(isPalindrome("hello"));
		System.out.println(isPalindrome("frorf"));
	}
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
	public static void greeting(String name){
		System.out.println("Hello " + name);
	}
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
	public static String greetingOutside(String name){
		String greeting = "Hello, " + name;
		return greeting;
	}
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		public static boolean longerWord(String word, int x){
			return word.length() > x;
		}
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		public static boolean inArray(String str, String [] arr){
			boolean match = false;
			for (String list: arr){
				if (list.equals(str)){
					match = true;
				}
			}
			return match;
		}
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		public static int smallestNumber(int [] list){
			int smallest = list[0];
			for (int num: list){
				if (num < smallest){
					smallest = num;
				}
			}
			return smallest;
		}
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		public static double arrayAverage(double [] doubleList){
			double sum = 0.0;
			for (double num: doubleList){
				sum += num;
			}
			double ave = sum / doubleList.length;
			return ave;
		}

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		public static int[] wordLength(String [] strList){
			int [] letterCounts = new int [strList.length];
			for (int i = 0; i < strList.length; i++ ){
				letterCounts[i] = strList[i].length();
			}
			return letterCounts;
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		public static boolean evensOrOdds(String[] strs){
			int evens =0;
			int odds = 0;
			for (String str: strs){
				if (str.length() % 2 == 0){
					evens += str.length();
				} else {
					odds += str.length();
				}
			}
			return evens > odds;
		}
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		public static boolean isPalindrome(String word){
			boolean isIt = true;
			int i = 0;
			while (isIt && (i < word.length()-(i+1))){
				char front = word.charAt(i);
				char back = word.charAt(word.length()-(i+1));
				if (front==back){
					isIt = true;
				} else {
					isIt = false;
				}
				i++;
			}
			return isIt;
		}
		
		
	}
