package com.dandaev.edu;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

	@Test
	void test(){
		MathUtils mathUtils = new MathUtils();

		int expected_value = -1;
		int actual_value = mathUtils.adder(1, 1);

		assertEquals(expected_value, actual_value);


	}
}
