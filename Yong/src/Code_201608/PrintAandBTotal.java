package Code_201608;

import java.util.Scanner;

public class PrintAandBTotal {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//int a = 7;
		//int b = 3;
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		int g = a % b;
		
		//ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
		//System.out.println("A + B >> " + c);
		//System.out.println("A - B >> " + d);
		//System.out.println("A * B >> " + e);
		//System.out.println("A / B >> " + f);
		//System.out.println("A % B >> " + g);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

}//
