package step3;

import java.util.Scanner;

public class PrintForGuGuDan {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	
		//int a = 2;
		int a = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}

}//
