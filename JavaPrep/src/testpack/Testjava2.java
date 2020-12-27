package testpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testjava2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[] marks=new int[5];
		entermarks(marks);
		Testjava2 tj=new Testjava2();
		tj.printmarks(marks);
		

	}
	public static void entermarks(int[] marks) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter all the marks one by one by pressing enter after each");
		for(int i=0;i<marks.length;i++) {
			int mark=Integer.parseInt(br.readLine());
			marks[i]=mark;
		}
	}
	public void printmarks(int[] marks) {
		for(int j: marks) {
			System.out.println(j);
		}
	}

}
