package w1l4;

import java.util.Arrays;

/**
 * 
 * @author {Aradom}
 *
 *         Lesson 4 – Recursion - Lab Homework
 *
 *
 */

public class Recursion {
	StringBuilder sBuilder;
	boolean isFirstRound = true;

	public static void main(String[] args) {

		// The test runs are found on Lesson4UnitTest.java
	}

	/**
	 * Recursively merges two sorted strings in ascending order
	 * 
	 * @param str1
	 * @param str2
	 * @return the merged String of{@code str1} and {@code str2}
	 */
	public String recursiveMergTwoStrings(String str1, String str2) {
		if (isFirstRound) {
			sBuilder = new StringBuilder();
			isFirstRound = false;
		}
		if (str1.equals("") && str2.equals("")) {
			return sBuilder.toString();
		} else if (str1.equals("")) {
			sBuilder.append(str2);
			return sBuilder.toString();
		} else if (str2.equals("")) {
			sBuilder.append(str1);
			return sBuilder.toString();
		}

		char firstCharOfStr1 = str1.charAt(0);
		char firstCharOfStr2 = str2.charAt(0);

		if (firstCharOfStr1 <= firstCharOfStr2) {
			sBuilder.append(firstCharOfStr1);
			recursiveMergTwoStrings(str1.substring(1), str2).toString();
		} else {
			sBuilder.append(firstCharOfStr2);
			recursiveMergTwoStrings(str1, str2.substring(1)).toString();
		}

		return sBuilder.toString();
	}

	/**
	 * Checks whether an input string is equal when read forwar and backwards
	 * 
	 * @param str
	 * @return
	 */
	boolean isPalinDrome(String str) {

		if (str != null)
			str = str.toLowerCase();

		if (str.length() == 1 || str.length() == 0) {
			return true;
		}
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);

		if (first == last) {
			isPalinDrome(str.substring(1, str.length() - 1));
		} else {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param key
	 * @param array
	 * @return searches for a given key in an array using a recursive Binary search
	 *         algorithm
	 */
	int recursiveBinarySearch(int key, int[] array) {
		return recursiveBinarySearchUtil(key, array, 0, array.length);
	}

	private int recursiveBinarySearchUtil(int key, int[] array, int start, int end) {
		for (Integer i : array) {
			if (!(i instanceof Integer))
				return -1;
		}

		Arrays.sort(array);

		int middle = (start + end) / 2;

		if (array[middle] == key) {
			return middle;
		} else if (key > array[middle]) {
			int m = middle + 1;
			if (m == end) {
				return -1;
			}
			return recursiveBinarySearchUtil(key, array, m, end);
		} else if (key < array[middle]) {
			int m = middle;
			if (m == start) {
				return -1;
			}
			return recursiveBinarySearchUtil(key, array, start, middle);
		} else {
			return -1;
		}
	}

	/**
	 * 
	 * @param input
	 * @return returns a character with the minimum ASCII code
	 */
	char minimumCharRecursive(String input) {
		if (input.length() == 1) {
			return input.charAt(0);
		}
		char firstChar = input.charAt(0);
		char secondChar = minimumCharRecursive(input.substring(1));

		if (firstChar <= secondChar) {
			return firstChar;
		} else {
			return secondChar;
		}
	}
}
