package Code_201608;

import java.util.Scanner;

public class PrintIfInteger {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        int intValA = 20;
        int intValB = 10;
        int intValC = 10;

        //int intValA = scan.nextInt();
        //int intValB = scan.nextInt();
        //int intValC = scan.nextInt();
        
        //��Ȯ�� ���� �� ��
        if(((intValA > intValB && intValA < intValC) || (intValA > intValC && intValA < intValB)) && (intValB != intValC)) {
        	System.out.println(intValA);
        	
        } else if(((intValB > intValA && intValB < intValC) || (intValB > intValC && intValB < intValA)) && (intValA != intValC)) {
        	System.out.println(intValB);
        	
        } else if(((intValC > intValA && intValC < intValB) || (intValC > intValB && intValC < intValA)) && (intValA != intValB) ) {
        	System.out.println(intValC);
        	
        //�� ���� ���� ��
        } else if((intValA == intValB) || (intValA == intValC)) {
        	System.out.println(intValA);
        	
        } else if((intValB == intValC)) {
        	System.out.println(intValB);
        	
        //�� ���� ���� ��
        } else if((intValA == intValB) && (intValA == intValC) && (intValB == intValC)) {
            System.out.println(intValA);
        }
    }

}//
