package com.dandaev.edu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.dandaev.edu.colors.Colors;

public class CalculatorTest {

	@ParameterizedTest
	@MethodSource("additionProvider")
	void testAddition(int a, int b, int expected) {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.add(a, b));
	}

	static Stream<Arguments> additionProvider() {
		return Stream.of(
				Arguments.of(1, 1, 2), 		// 1 + 1 = 2
				Arguments.of(2, 3, 5), 					// 2 + 3 = 5
				Arguments.of(-1, -1, -2), 				// -1 + -1 = -2
				Arguments.of(100, 200, 300) 			// 100 + 200 = 300
		);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5 })
	void testIsPositive(int number) {
		assertTrue(number > 0);
	}

	@ParameterizedTest
	@EnumSource(Colors.class)
	void testColor(Colors color) {
		assertNotNull(color);
	}

	@ParameterizedTest
	@CsvSource({
			"1, 1, 2",
			"2, 3, 5",
			"-1, -1, -2"
	})
	void testAdditionCsv(int a, int b, int expected) {
		assertEquals(expected, new Calculator().subtract(a, b));
	}

}
