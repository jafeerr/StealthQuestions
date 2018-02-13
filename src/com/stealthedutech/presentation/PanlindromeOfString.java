package com.stealthedutech.presentation;

public class PanlindromeOfString {
	public static void main(String[] args) {
		String input = "A nut for a jar of tuna";
		System.out.println(PanlindromeOfString.isPalindrome(input));
	}

	public static boolean isPalindrome(String input) {
		
		input=input.toLowerCase();
		int leftSpaceCount = 0, rightSpaceCount = 0;
		char space = (char) 32;
		for (int i = 0; i < input.length()/2; i++) {
			
			if (input.charAt(i+leftSpaceCount) == space) {
				leftSpaceCount++;
			}
			if (input.charAt(input.length() - 1 - i-rightSpaceCount) == space) {
				rightSpaceCount++;
			}
			if (input.charAt(i + leftSpaceCount) == input.charAt(input.length() - 1 -i- rightSpaceCount)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
