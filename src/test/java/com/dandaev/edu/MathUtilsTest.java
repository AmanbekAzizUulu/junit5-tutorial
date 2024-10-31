package com.dandaev.edu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

	@Test
	void testingArraysEquality() {
		// int[] array_1 = new int[] { 0, 1, 2, 3, 4 };
		// int[] array_2 = new int[] { 4, 3, 2, 1, 0 };

		// assertArrayEquals(array_1, array_2, "given two integer arrays should be equal");

		int[] array_3 = new int[] { 5, 6, 7, 8, 9 };
		int[] array_4 = new int[] { 5, 6, 7, 8, 9 };

		assertArrayEquals(array_3, array_4, "given two integer arrays should be equal");
	}

	@Test
	void testingListsEquality(){
		// var expected_list_1 = Arrays.asList("apple", "banana", "cherry");
		// var actual_list_1 = Arrays.asList("coconut", "banana", "cherry");

		// assertIterableEquals(expected_list_1, actual_list_1, "given two lists should be equal");

		var expected_list_2 = Arrays.asList("apple", "banana", "cherry");
		var actual_list_2 = Arrays.asList("apple", "banana", "cherry");

		assertIterableEquals(expected_list_2, actual_list_2, "given two lists should be equal");

	}

	@Test
	void testingAdderMethod(){
		assertEquals(new MathUtils().adder(2,3), 5, "sum of 2 and 3 should be 5");
	}

	@Test
	void testingSubtractorMethod(){
		assertEquals(new MathUtils().subtractor(3, 2), 1, "the result of subtraction should be 1");
	}

	@Test
	void testingComputationOfCircleArea() {
		assertEquals(new MathUtils().circleArea(10), 314.1592653589793);
	}

	@Test
	void testingDividerMethod(){
		// если будет выброшен  ArithmeticException, тест будет пройден успешно
		assertThrows(ArithmeticException.class, () -> new MathUtils().divider(10, 0), "divide by zero should throw ArithmeticException");

		// если же не будет выброшен  ArithmeticException, или будет выброшен Exception отличный от ArithmeticException, тест будет пройден нуспешно
		// assertThrows(ArithmeticException.class, () -> new MathUtils().divider(10, 2), "divide by zero should throw ArithmeticException");
	}
}
