package step3;

import java.util.Scanner;

public class PrintForStarOne {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//int a = 5;
		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {	//����
			
			for(int j = 1; j <= i; j++) {	//����, i �� a �� �ϸ� 5���� ���
				System.out.print("*");
				//System.out.println("*");	//�ٹٲ㼭 ���η� ���
			}
			System.out.println("");
		}
	}

}//
