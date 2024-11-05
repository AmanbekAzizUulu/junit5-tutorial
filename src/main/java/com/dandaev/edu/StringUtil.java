package com.dandaev.edu;

import org.apache.maven.surefire.shared.lang3.StringUtils;

public class StringUtil {
	public static boolean isPalindrome(String candidate) {
        if (candidate == null) {
            return false;
        }
        String reversed = StringUtils.reverse(candidate);
        return candidate.equalsIgnoreCase(reversed);
    }
}
