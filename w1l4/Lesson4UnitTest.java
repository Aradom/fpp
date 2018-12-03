package w1l4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lesson4UnitTest {

	@Test
	void testMinimumCharacter() {
		Recursion rec = new Recursion();

		char smallestCharacter = 'a';
		char expectedChar = rec.minimumCharRecursive("akel");
		assertEquals(expectedChar, smallestCharacter);
	}

	@Test
	void testRecursiveMerge() {
		Recursion rec = new Recursion();

		String string1 = "ace";
		String string2 = "bdf";
		String expectedOutput = "abcdef";
		String actualResult = rec.recursiveMergTwoStrings(string1, string2);

		assertEquals(expectedOutput, actualResult);
	}

	@Test
	void testRecursiveBinarySearch() {
		Recursion rec = new Recursion();

		int[] array = { 21, 1, 2, 3, 4, 5, 9, 8 };
		int indexResult = rec.recursiveBinarySearch(21, array);
		assertEquals(7, indexResult);
	}

	@Test
	void testPalinDrome() {
		Recursion rec = new Recursion();

		String input = "Madam";
		boolean expectedResult = rec.isPalinDrome(input);
		assertEquals(expectedResult, true);
	}

}
