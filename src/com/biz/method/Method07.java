package com.biz.method;

public class Method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		System.out.println(intNum1);
		
		addVar(100);
		System.out.println(addVar(intNum1));

		addVar(intNum1);
		System.out.println(intNum1);
		
		intNum1 = addVar(intNum1);
		System.out.println(intNum1);
		
	}
	
	public static int addVar(int intNum1) {
		intNum1 += 200;
		return intNum1 ;	}

}
