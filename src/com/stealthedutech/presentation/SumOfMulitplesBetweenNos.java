package com.stealthedutech.presentation;

public class SumOfMulitplesBetweenNos {
public static void main(String[] args)
{
	int lowerLimit=1107,upperLimt=21000,divisor=7;
	int lowerLimitMulOfSeven=(lowerLimit%divisor==0)?lowerLimit:lowerLimit+(divisor-
			(lowerLimit%divisor));
	int upperLimitMulOfSeven=upperLimt-(upperLimt%divisor);
	//Using  series formulae
	int count=((upperLimitMulOfSeven-lowerLimitMulOfSeven)/divisor)+1;
	System.out.println((count*(lowerLimitMulOfSeven+upperLimitMulOfSeven))/2);
	//Using loop
	int sum=0;
	for(int i=lowerLimitMulOfSeven;i<=upperLimt;i+=7)
			sum=sum+i;
	System.out.println(sum);
	
	
	
}
}
