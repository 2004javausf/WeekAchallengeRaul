package com.revature.beans;

import java.util.Scanner;

public class MainDriver {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name");
		s.nextLine();
		
		boolean isTrue = true;
		
		BeanOne bean = new BeanOne();
		bean.ballType = "Basketball";
		bean.ballQuantity = 23;
		
		BeanTwo beanTwo = new BeanTwo();
		beanTwo.carBrand = "Ford";
		beanTwo.carQuantity = 5;
		
		//overloaded
	
		String myString = saySomething("Hello ","World ");
		String myString2 = saySomething("I ","Am ","so ","happy ");
		System.out.println(myString+ myString2);
		
		int addNum = saySomething(1);
		
		//end overloaded
		
		//start wrapper
		Integer myInt =5;
		System.out.println(myInt.intValue());
		//end wrapper
		System.out.println(addNum);
		while(isTrue) {
		if (beanTwo.carBrand == "Ford" ) {
			 System.out.println("Congratulations!");
		}else if(beanTwo.carBrand == "Chevy"){
			System.out.println("Chevy is good too");
		}else {
			int magicNumber=4;
			switch(magicNumber) {
			case 1:
				System.out.println("Number 1");
				break;
			case 2:
				System.out.println("Number 2");
				break;
			case 3:
				System.out.println("Number 3");
				break;
			case 4:
				for (int i = 0; i < 5; i++) {
					  System.out.println(i);
				}
			}
		}
		return;
		
		
	}
	}

//method overloading
	private static String saySomething(String string, String string2) {
		return string + string2;
	}
	
	private static int saySomething(int x) {
		return x;
	}
	private static String saySomething(String string, String string2, String string3, String string4) {
		return string + string2+ string3 + string4;
	}
		
}
