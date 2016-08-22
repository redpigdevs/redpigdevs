package step3;

import java.util.Scanner;

public class PrintForStarThree {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
	
        //int a = 5;
        int a = scan.nextInt();
		
        for(int i = 1; i <= a; i++) {	//세로
			
            for(int j = i; j <= a; j++) {	//가로, 기준이 i 부터 a 까지 채워질 때 까지
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}//
