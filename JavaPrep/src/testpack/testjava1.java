package testpack;

import java.util.Scanner;

public class testjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salaries=new double[] {23500.00,250080.00,287600.00,22300.00,23800.00};	
		
		double sum=0;
		for(double i:salaries) {
			sum+=i;
		}
		double avgsal=sum/5;
		System.out.println("The average salary is : " + avgsal);
		
		int incrementone=0;
		for(int j=0;j<salaries.length;j++) {
			if(salaries[j]>=avgsal) {
				incrementone++;
			}
		}
		System.out.println("Number of employees having salary more than average is : "+ incrementone);
		System.out.println("number of employees having salary less than average is: "+ (5-incrementone));
	

	}

}
