package com.dandaev.edu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.Arguments;

// @TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {
	private MathUtils mathUtils_to_test;
	private static int counter = 0;

	@BeforeAll
	static void setup(){
		System.out.println("Setting up resources ....");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterAll
	static void release(){
		System.out.println("Releasing resources ...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeEach
	void init() {
		mathUtils_to_test = new MathUtils(); // инициализация объекта тестирования
		System.out.println(++ counter + " — Initializing of test instance ....");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterEach
	void cleanup() {
		System.out.println( counter + " — Cleaning up ....");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Testing arrays equality")
	void testingArraysEquality() {
		// int[] array_1 = new int[] { 0, 1, 2, 3, 4 };
		// int[] array_2 = new int[] { 4, 3, 2, 1, 0 };

		// assertArrayEquals(array_1, array_2, "given two integer arrays should be equal");

		int[] array_3 = new int[] { 5, 6, 7, 8, 9 };
		int[] array_4 = new int[] { 5, 6, 7, 8, 9 };

		assertArrayEquals(array_3, array_4, "given two integer arrays should be equal");
	}

	@Test
	@DisplayName("Testing lists equality")
	void testingListsEquality() {
		// var expected_list_1 = Arrays.asList("apple", "banana", "cherry");
		// var actual_list_1 = Arrays.asList("coconut", "banana", "cherry");

		// assertIterableEquals(expected_list_1, actual_list_1, "given two lists should be equal");

		var expected_list_2 = Arrays.asList("apple", "banana", "cherry");
		var actual_list_2 = Arrays.asList("apple", "banana", "cherry");

		assertIterableEquals(expected_list_2, actual_list_2, "given two lists should be equal");
	}

	@Test
	@Disabled
	@DisplayName("Testing adder() method")
	void testingAdderMethod() {
		assertEquals(mathUtils_to_test.adder(2, 3), 5, "sum of 2 and 3 should be 5");
	}

	@Test
	@DisplayName("Testing subtractor() method")
	void testingSubtractorMethod() {
		assertEquals(mathUtils_to_test.subtractor(3, 2), 1, "the result of subtraction should be 1");
	}

	@Test
	@DisplayName("Testing circleArea() method")
	void testingComputationOfCircleArea() {
		assertEquals(mathUtils_to_test.circleArea(10), 314.1592653589793);
	}

	@Test
	@Disabled
	@DisplayName("Testing divider() method")
	void testingDividerMethod() {
		// если будет выброшен ArithmeticException, тест будет пройден успешно
		assertThrows(ArithmeticException.class, () -> mathUtils_to_test.divider(10, 0),"divide by zero should throw ArithmeticException");

		// если же не будет выброшен ArithmeticException, или будет выброшен Exception отличный от ArithmeticException, тест будет пройден нуспешно
		// assertThrows(ArithmeticException.class, () -> instance_to_test.divider(10, 2), "divide by zero should throw ArithmeticException");
	}

	@Test
    @EnabledOnOs(OS.MAC)
    void runOnlyOnMac() {
        // This test only runs on Mac
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "PROD")
    void runOnlyOnProdEnvironment() {
        // This test only runs if the ENV environment variable is set to "PROD"
    }

	@Test
    void testMultipleAssertions() {
        MathUtils mathUtils = new MathUtils();

        assertAll("Testing multiple assertions",
            () -> assertEquals(4, mathUtils.adder(2, 2), "Adder test failed"),
            () -> assertEquals(0, mathUtils.subtractor(2, 2), "Subtractor test failed"),
            () -> assertEquals(1, mathUtils.divider(2, 2), "Divider test failed")
        );
    }


}
