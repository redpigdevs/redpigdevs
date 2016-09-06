package step5;

//import java.util.Scanner;

public class FuncNum {

    //@SuppressWarnings("resource")
    public static void main(String[] args) {
		
        //Scanner scan = new Scanner(System.in);
        
        int valA = 0;
        int valB = 0;
        int valC = 0;
        int valD = 0;
        int valResult = 0;

        boolean[] generator = new boolean[10000];
        
        for(int i = 1; i < 10000; i++) {
            valA = i / 1000;
            valB = (i / 100) % 10;
            valC = (i / 10) % 10;
            valD = i % 10;
            
            //System.out.println("valA ######## > " + valA);
            //System.out.println("valB ######## > " + valB);
            //System.out.println("valC ######## > " + valC);
            //System.out.println("valD ######## > " + valD);
            //System.out.println("================================");
            
            valResult = valA + valB + valC + valD + i;
        	
            if((valResult >= 1) && (valResult < 10000)) {
                generator[valResult] = true;
            }
        }
        
        for(int i = 1; i < 10000; i++) {
            if(generator[i] == false) {
                System.out.println(i);
            }
        }
    }

}//
