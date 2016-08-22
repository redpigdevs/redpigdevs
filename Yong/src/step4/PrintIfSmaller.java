package Code_201608;

import java.util.Scanner;

public class PrintIfSmaller {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        int numVal = 5;
        //int numVal = scan.nextInt();
		
        String[] arrVal = {"1", "10", "4", "9", "2", "3", "8", "5", "7", "6"};
        String printVal = "";
        for(int i = 0; i < arrVal.length; i++) {
        	String strVal = arrVal[i];
        	if(numVal > Integer.parseInt(strVal)) {
        		printVal += arrVal[i] + " ";
        	}
        }
        System.out.println(printVal);
        //System.out.println(arrVal.length);
    }

}//
