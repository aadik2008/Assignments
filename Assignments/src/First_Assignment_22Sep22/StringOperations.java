/*Given is a string "Co3zy s4phinx wav0es qu23art jug3 of b2ad m1ilk" which contains number along with it.

Write a program to,
i.) Copy only alphabets & remove numbers from it.
ii.) Convert upper case to lower case
iii.) Sort the String(Without using predefined methods)
iv.)  Remove duplicates from it.
v.) Once the duplicates are removed check whether the length of string is equal to 26, and print whether the 
    string is PANGRAM or NOT.*/
package First_Assignment_22Sep22;

public class StringOperations {
	public static void main(String[] args) {
		String s = "Co3zy s4phinx wav0es qu23art jug3 of b2ad m1ilk";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a'
					|| s.charAt(i) > 'z' && s.charAt(i) == ' ') {
				s = s.substring(0, i) + s.substring(i + 1);
				i--;
			}
		}
		System.out.println(s);
	}
}
