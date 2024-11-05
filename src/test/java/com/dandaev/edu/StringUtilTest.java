package com.dandaev.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilTest {

	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
		assertTrue(StringUtil.isPalindrome(candidate));
	}

	@Tag("fast")
	@Test
	void fastTest(){
		System.out.println("Fast test running....");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
