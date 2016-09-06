package step5;

import java.util.Scanner;

public class FuncStar {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        //int valA = 110;
        int valA = scan.nextInt();
        int valK = 0;
        int valHan = 0;
        int varArr[] = new int[3];
		
        for(int i = 1; i <= valA; i++) {
            if(0 < i && i < 100) valHan = i;
            else if(i == 1000) break;
            else {
                valK = 0;
                int valT = i;
                while(valT > 0) {
                    varArr[valK] = valT % 10;
                    valT /= 10; valK++;
                }
                if(varArr[0] - varArr[1] == varArr[1] - varArr[2]) valHan++;
            }
        }
        System.out.println(valHan);
    }

}//
