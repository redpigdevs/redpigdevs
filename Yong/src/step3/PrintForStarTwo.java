package step3;

import java.util.Scanner;

public class PrintForStarTwo {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
	
        //int a = 5;
        int a = scan.nextInt();
		
        for(int i = 1; i <= a; i++) {	//세로
			
            for(int j = 1; j <= a - i; j++) {	//가로, 공백을 우선 출력
                System.out.print(" ");	//줄바꿈이 아니므로 공백을 출력
                //System.out.print("@");
            }
            for(int k = i; k > 0; k--) {	//가로, 공백 제외한 공간을 * 로 출력
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}//
