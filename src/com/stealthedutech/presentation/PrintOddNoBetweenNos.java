package com.stealthedutech.presentation;

public class PrintOddNoBetweenNos {
public static void main(String[] args)
{
	int lowerLimit=904,upperLimit=1100,count=0;
	int nearestOddNo=(lowerLimit%2==0)?lowerLimit:lowerLimit+1;
	for(int i=nearestOddNo;i<=upperLimit;i+=2)
	{
		System.out.println(i);
	count++;	
	}
	System.out.println("Total Odd nos: "+count);
}
}
