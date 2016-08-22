package Code_201608;

import java.util.Scanner;

public class PrintAremainderB {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//int a = 5;
		//int b = 8;
		//int c = 4;
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		//첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
		int d = (a + b) % c;
		int e = (a % c + b % c) % c;
		int f = (a * b) % c;
		int g = (a % c * b % c) % c;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

}//
