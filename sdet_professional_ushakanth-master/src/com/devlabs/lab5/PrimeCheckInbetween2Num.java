package com.devlabs.lab5;

import java.util.Scanner;

public class PrimeCheckInbetween2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the number1: ");
        int  a= scan.nextInt();
        System.out.println("Please input the number2: ");
        int  b= scan.nextInt();
        scan.close();
        
       for(;a<=b;a++) {
    	   if(a%2==1) {
    		   System.out.println(a+"is Prime Number");
    	   }
    	   else {
    		   continue;
    	   }
	}

}
}