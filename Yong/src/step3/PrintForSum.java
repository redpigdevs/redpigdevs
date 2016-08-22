package step3;

import java.util.Scanner;

public class PrintForSum {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        //int sumNum = 3;
        int sumVal = 0;
        
        int sumNum = scan.nextInt();
		
        for(int i = 1; i <= sumNum; i++) {
            sumVal += i;
        }
        System.out.println(sumVal);
    }

}//
