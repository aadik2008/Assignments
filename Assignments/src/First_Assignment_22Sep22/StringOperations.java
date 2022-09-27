/*Given is a string "Co3zy s4phinx wav0es qu23art jug3 of b2ad m1ilk" which contains number along with it.

Write a program to,
i.) Copy only alphabets & remove numbers from it.
ii.) Convert upper case to lower case
iii.) Sort the String(Without using predefined methods)
iv.)  Remove duplicates from it.
v.) Once the duplicates are removed check whether the length of string is equal to 26, and print whether the 
    string is PANGRAM or NOT.*/
package First_Assignment_22Sep22;

import java.util.*;

public class StringOperations {
	public static void main(String[] args) {
		String s = "Co3zy s4phinx wav0es qu23art jug3 of b2ad m1ilk";

		// Remove the numbers

		s = s.replaceAll("[0-9]", "");
		System.out.println(s);

		// Converting in lower case

		s = s.toLowerCase();
		System.out.println(s);

		// Sorting the string with Optimised Approach(Time Complexity O(nlogn))
		char[] d = s.toCharArray();         
		java.util.Arrays.sort(d);          
		String sortedString = new String(d);  
		System.out.println(sortedString); 	
				
        // Without using predefined method i.e:Through Bubble Sort(Time Complexity O(n^2))
/*		String sortedString = "";
		char tempString[] = s.toCharArray();
		int n = tempString.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (tempString[i] > tempString[j]) {
					char temp = tempString[i];
					tempString[i] = tempString[j];
					tempString[j] = temp;
				}
			}
		}
		sortedString = new String(tempString);
		System.out.println("Original String : " + s);
		System.out.println("Sorted String : " + sortedString);
*/
//////////////////////////////////////////////////////////////////////////////		
		// Remove Duplicates from the string
		String str=sortedString;
		StringBuilder sb = new StringBuilder();
		Set<Character> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			linkedHashSet.add(str.charAt(i));
		}

		for (Character c : linkedHashSet) {
			sb.append(c);
		}
		System.out.println(sb);

		// Checking length of string is 26 or not??

		int len = sb.length();
		if (len == 26) {
			System.out.println("Length of string is equal to 26");
		} else {
			System.out.println("Length of string is not equal to 26");
		}

		// Checking PANGRAM or Not?

		boolean[] mark = new boolean[26];
		int index = 0;
		for (int i = 0; i < sb.length(); i++) {

			if ('a' <= sb.charAt(i) && sb.charAt(i) <= 'z')
				index = sb.charAt(i) - 'a';
			mark[index] = true; 
		}
		for (int i = 0; i <= 25; i++) {
			if (!mark[i]) {
				System.out.println("The given string is not PANGRAM");
				return;
			}
		}
		System.out.println("The given string is Pangram String😄👍");
	}
}
