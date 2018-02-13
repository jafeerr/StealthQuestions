package com.stealthedutech.presentation;

public class NumberArray {
	public int[] numbers;

	public NumberArray(int[] nos) {
		numbers = nos;
	}

	public static void main(String[] args) {
		int[] numbers = { 12, 71, 92, 56, 121, 33, 89, 47, 25, 64, 100, 103, 2, 19, 96 };
NumberArray array=new NumberArray(numbers);
System.out.println(array.contains(121));
System.out.println(array.indexOf(33));
System.out.println(array.containsDuplicate());
	}

	public boolean contains(int number) {
		return indexOf(number) != -1;
	}

	public int indexOf(int number) {
		for (int index = 0; index < numbers.length; index++) {
			if (number == numbers[index])
				return index;
		}
		return -1;
	}

	public boolean containsDuplicate() {
		StringBuilder builder = new StringBuilder();
		NumberArray tempArray=new NumberArray(new int[numbers.length]);
		int index=0;
		for (int no : numbers) {
			if (!tempArray.contains(no)) {
				tempArray.numbers[index++]=no;
			} else {
				return true;
			}
		}
		return false;
	}
}