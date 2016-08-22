package step3;

import java.util.Scanner;

public class PrintForNTo1 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		
		//int a = 5;
		int a = scan.nextInt();
		
		for(int i = a; i >= 1; i--) {
			System.out.println(i);
		}
	}

}//
