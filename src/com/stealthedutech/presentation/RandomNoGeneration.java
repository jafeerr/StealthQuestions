package com.stealthedutech.presentation;

public class RandomNoGeneration {
	public static void main(String[] args) {
		System.out.println(RandomNoGeneration.newRandomFun());
	}

	// function to generate random number between 1-11
	public static long random() {
		return Math.round(Math.random() * 11);
	}

	// new function to generate random number between 1-13
	public static long newRandomFun() {
		return Math.round(random() * 13 / 11);
	}
}
