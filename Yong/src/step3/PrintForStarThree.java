package step3;

import java.util.Scanner;

public class PrintForStarThree {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
	
        //int a = 5;
        int a = scan.nextInt();
		
        for(int i = 1; i <= a; i++) {	//����
			
            for(int j = i; j <= a; j++) {	//����, ������ i ���� a ���� ä���� �� ����
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}//
