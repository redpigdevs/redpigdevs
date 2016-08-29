package step4;

import java.util.Scanner;

public class PrintIfSmaller {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        //int numArr = 10;
        //int numVal = 5;
        
        int numArr = scan.nextInt();
        int numVal = scan.nextInt();
		
        int numArray[] = new int[numArr];
        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = scan.nextInt();
        }
        //String[] numArray1 = {"1", "10", "4", "9", "2", "3", "8", "5", "7", "6"};
        for(int J = 0; J < numArray.length; J++) {
            if(numArray[J] < numVal) {
                System.out.print(numArray[J] + " ");
            }
        }
    }

}//
