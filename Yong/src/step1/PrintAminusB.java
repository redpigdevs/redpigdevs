package step1;

import java.util.Scanner;

public class PrintAminusB {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//int a = 3;
		//int b = 2;
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = a - b;
		System.out.println(c);
		//System.out.println(a + b);
	}

}//
