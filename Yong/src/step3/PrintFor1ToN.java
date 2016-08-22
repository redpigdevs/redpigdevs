package step3;

import java.util.Scanner;

public class PrintFor1ToN {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	
		//int a = 5;
		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println(i);
		}
	}

}//
