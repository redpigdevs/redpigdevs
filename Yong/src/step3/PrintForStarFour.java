package step3;

import java.util.Scanner;

public class PrintForStarFour {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
        //int a = 5;
        int a = scan.nextInt();
		
        for(int i = 1; i <= a; i++) {	//세로
			
            for(int j = 1; j <= i - 1; j++) {	//가로, 공백을 우선 출력
                System.out.print(" ");
                //System.out.print("@");
            }
            for(int k = a; k >= i; k--) {	//가로, 공백 제외한 공간을 * 로 출력
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}//
