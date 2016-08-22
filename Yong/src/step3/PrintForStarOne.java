package step3;

import java.util.Scanner;

public class PrintForStarOne {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//int a = 5;
		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {	//세로
			
			for(int j = 1; j <= i; j++) {	//가로, i 를 a 로 하면 5개씩 출력
				System.out.print("*");
				//System.out.println("*");	//줄바꿔서 세로로 출력
			}
			System.out.println("");
		}
	}

}//
