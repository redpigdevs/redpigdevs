package step3;

import java.util.Scanner;

public class PrintForStarTwo {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
	
        //int a = 5;
        int a = scan.nextInt();
		
        for(int i = 1; i <= a; i++) {	//����
			
            for(int j = 1; j <= a - i; j++) {	//����, ������ �켱 ���
                System.out.print(" ");	//�ٹٲ��� �ƴϹǷ� ������ ���
                //System.out.print("@");
            }
            for(int k = i; k > 0; k--) {	//����, ���� ������ ������ * �� ���
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}//
