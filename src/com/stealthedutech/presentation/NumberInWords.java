package com.stealthedutech.presentation;

import java.util.Scanner;

public class NumberInWords {
	public Integer number;
	public static final int ONES_PLACE = 0;
	public static final int TENS_PLACE = 1;
	public static final int HUNDREDS_PLACE = 2;
	public static final int THOUSANDS_PLACE = 3;
	public static final String[] DIGIT_ONES_WORDS = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine" };
	public static final String[] ELEVEN_TO_19_WORDS = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
			"Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	public static final String[] DIGIT_TENS_WORDS = { "", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
			"Seventy", "Eighty", "Ninety" };
	public static final String HUNDRED = "Hundred";

	public static final String THOUSAND = "Thousand";

	public NumberInWords(int no) {
		number = no;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberInWords number = new NumberInWords(input.nextInt());
		System.out.println(number.getNoInWords());
		input.close();
	}

	public String getNoInWords() {
		int digitCount = number.toString().length();
		String[] words = new String[digitCount];
		int previousDigit = 0;
		for (int i = 0; i < digitCount; i++) {
			int digit = number % 10;
			if (i == TENS_PLACE && (digit == 1 || previousDigit == 0)) {
				words[i - 1] = "";
			}
			words[i] = getDigitString(digit, previousDigit, i);
			number = number / 10;
			previousDigit = digit;
		}
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			// Append And in words
			if (words.length > 2 && (!words[i].isEmpty()) && i <= 1 && ((!result.toString().contains("And")))) {
				result.append("And");
				result.append(" ");
			}
			result.append(words[i]);
			result.append(" ");
		}
		return result.toString();
	}

	public String getDigitString(int digit, int previousDigit, int digitPlace) {
		switch (digitPlace) {
		case ONES_PLACE:
			return DIGIT_ONES_WORDS[digit];
		case TENS_PLACE:
			return digit == 1 && previousDigit > 0 ? ELEVEN_TO_19_WORDS[previousDigit - 1] : DIGIT_TENS_WORDS[digit];
		case HUNDREDS_PLACE:
			return digit == 0 ? "" : DIGIT_ONES_WORDS[digit] + " " + HUNDRED;
		case THOUSANDS_PLACE:
			return DIGIT_ONES_WORDS[digit] + " " + THOUSAND;
		default:
			return "";
		}
	}
}
