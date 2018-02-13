package com.stealthedutech.presentation;

public class PrintUniqueCharctersInString {
	public static void main(String[] args) {
		String input = "I like working for Jyroo because I like the problem they are solving. Good education lays	a strong foundation	for	a	brighter tomorrow";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (!builder.toString().contains(input.charAt(i) + "")) {
				builder.append(input.charAt(i));
			}
		}
		System.out.println(builder.toString());
	}
}
