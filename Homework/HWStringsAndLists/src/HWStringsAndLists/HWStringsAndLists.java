package HWStringsAndLists;

import java.util.ArrayList;

/**
 *
 ***************************************************************************************
 *         REQUIRED HELP CITATION
 *
 *         https://www.w3schools.com/java/default.asp
 ***************************************************************************************
 *
 * <dl>
 * <dt>Class:</dt><dd>HWStringsAndLists</dd>
 *
 * <dt>Purpose:</dt>
 * <dd>The problems in this assignment give you practice with
 * Strings and ArrayLists.</dd>
 *
 * <dt>Learning targets:</dt>
 * <dd>
 * <ul>
 * <li>I can read Java API documentation to learn how to use built-in classes.</li>
 * <li>I can apply basic String operations to solve small problems.</li>
 * <li>I can distinguish ArrayLists and arrays.</li>
 * <li>I can apply basic ArrayList operations to solve small problems.</li>
 * <li>(optional for this assignment) I can read and write enhanced for loops.</li>
 * </ul></dd></dl>
 *
 * @author CSSE Faculty
 */
public class HWStringsAndLists {

	/**
	 * Determine if a given string ends with an uppercase letter.
	 *
	 * For example:
	 *
	 * endsWithUppercase("dog") returns false
	 * endsWithUppercase("doG") returns true
	 * endsWithUppercase("") returns false
	 *
	 * Note that you can check if a particular char is uppercase like this:
	 *
	 * char myChar = 'A'; if(Character.isUpperCase(myChar)) {
	 * System.out.println("uppercase!"); }
	 *
	 * Note that the empty string is considered not to end with an uppercase letter.
	 *
	 * Requires if statements, strings
	 */
	public static boolean endsWithUpperCaseLetter(String input) {
		if (input.isEmpty()) {
			return false;
		}
		char lastletter = input.charAt(input.length()-1);
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(lastletter)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Given two strings of the same length, returns the index at which the strings
	 * first differ. If the strings are equal the function should return -1.
	 *
	 * For example:
	 * firstDifference("abc", "axy") returns 1
	 * firstDifference("aby", "abz") returns 2
	 * firstDifference("foo", "bar") returns 0
	 * firstDifference("ninja", "ninja") returns -1
	 * firstDifference("","") returns -1
	 *
	 * You don't need to worry about inputs of different lengths.
	 *
	 * Hint: if you want to compare the two strings to see if they are equal. For
	 * example, something like this:
	 *
	 * if(one.equals(two)) return -1;
	 *
	 * Individual characters however, should be compared with ==
	 * char a = one.charAt(0);
	 * char b = two.charAt(0);
	 * if (a == b) {
	 *     System.out.println("First characters are equal");
	 * }
	 *
	 * Requires: for loops or while loops, strings
	 */
	public static int firstDifference(String one, String two) {
		if (one.isEmpty()) {
			return -1;
		}
		for (int i = 0; i < one.length(); i++) {
			if (one.charAt(i) == two.charAt(i)) {
				continue;
			}
			else {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Takes a string that is all Ts or Fs.
	 *
	 * T stands for touchdown and is worth 7 points. F stands for fieldgoal and is
	 * worth 3 points.
	 *
	 * Returns the total score.
	 *
	 * For example: "TT" returns 14 "FTF" returns 13 "FFFF" returns 12 "" returns 0;
	 *
	 *
	 * @param a string only Ts and Fs
	 * @return a score
	 */
	public static int footballScore(String input) {
		int sum = 0;
		if (input.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'T') {
				sum += 7;
			}
			else {
				sum += 3;
			}
		}
		return sum;
	}

	/**
	 * Given one string, return the most common character.
	 *
	 * Example: mostCommonCharacter("aaab") returns 'a'
	 * mostCommonCharacter("abcbcdc") returns 'c'
	 *
	 * You can assume that your string will not be empty and that one character will
	 * be more common than all the others (i.e. there won't be a tie for the most
	 * common character)
	 *
	 * Your solution should use a pair of nested for loops. You might be tempted to
	 * use something like python's dictionary here, but we'll save that till later
	 * when we cover HashMaps.
	 *
	 * Requires: for loops, strings
	 */
	public static char mostCommonCharacter(String input) {
		char let;
		int count = 0;
		int [] tea = new int [input.length()];
		if (input.length() == 1) {
			return input.charAt(0);
		}
		for (int i = 0; i < input.length(); i++) {
			let = input.charAt(i);
			for (int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == let) {
					count += 1;
				}
				}
			tea[i] = count;
			count = 0;
			}
		int astore = 0;
		count = tea[0];
		for (int a = 0; a < input.length()-1; a++) {
			if (tea[a+1] > count) {
				count = tea[a+1];
				astore = a + 1;
			}
		}
		return input.charAt(astore);
	}

	/**
	 * Given an ArrayList of strings, return a new list where any time the word
	 * "double" appears in the original list it is doubled in the new list.
	 * <p>
	 * For example:
	 * doubleDouble(["foo","double"]) returns ["foo","double","double"]
	 * <p>
	 * doubleDouble(["a","double","b","double","c"]) returns
	 * ["a","double","double","b","double","double","c"]
	 * <p>
	 * Be careful not to modify the original list. Start by creating a new output
	 * list that holds the results! E.g.
	 * <p>
	 * ArrayList<String> output = new ArrayList<String>();
	 * <p>
	 * When you are comparing strings, be sure to use .equals and not == e.g.
	 * if(currentString .equals("double")) { stuff }
	 *
	 */
	public static ArrayList<String> doubleDouble(ArrayList<String> input) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < input.size(); i++) {
			output.add(input.get(i));
			if (input.get(i).equals("double")) {
				output.add(input.get(i));
			}
		}
		return output;
	}

	/**
	 * Given a string, return all 3 character substrings of that string in an
	 * arraylist. That is, first it will return the 1st 3 characters of the string
	 * Then it will return the 2nd 3rd and 4th characters Then it will return the
	 * 3rd 4th and 5th characters etc.
	 *
	 * For example:
	 * threeCharacterStrings("hello")  returns ["hel","ell","llo"]
	 * threeCharacterStrings("foo")    returns ["foo"]
	 * threeCharacterStrings(["ab"])   returns []
	 */
	public static ArrayList<String> threeCharacterStrings(String input) {
		int start = 0;
		int end = 3;
		ArrayList<String> output = new ArrayList<String>();
		while (end<input.length()+1) {
			output.add(input.substring(start, end));
			start++;
			end ++;
		}
		return output;
	}



	/**
	 * In this problem, you are given an ArrayList of Strings.
	 * You should modify the ArrayList so that includes all of the original
	 * Strings replaced with a substring terminating at the first occurrence of X.
	 * (That is, a capital 'X' only, ignore the lower case 'x')
	 *
	 * If a String has no 'X' in it, you should leave the String alone.
	 *
	 * Examples:
	 *
	 * ["abcXdef", "XXX"] is modified to become ["abcX", "X"]
	 *
	 * ["HelloXHowXAreXYouX", "HelloThere", "abcd", "xxxxx"]
	 *   is modified to become  ["HelloX", "HelloThere", "abcd", "xxxxx"]
	 *   (the last three strings did not change because there was no 'X')
	 *
	 * ["aXbXcX", "aXbcd", "abcXd", "StringWithAnX", "XInAString"]
	 *   is modified to become ["aX", "aX", "abcX", "StringWithAnX", "X"]
	 *
	 * @param strings - an ArrayList of Strings to modify
	 *
	 * you will not return a new list, but modify the strings list
	 */
	public static void truncateStringsAtX(ArrayList<String> strings) {
		for (int i = 0; i < strings.size(); i++) {
			for (int j = 0; j < strings.get(i).length(); j++) {
				if (strings.get(i).charAt(j) == 'X') {
					strings.set(i, strings.get(i).substring(0, j + 1));
					break;
				}
			}
		}
	}
}
