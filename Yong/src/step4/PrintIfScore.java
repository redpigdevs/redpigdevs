package step4;

import java.util.Scanner;

public class PrintIfScore {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        //int scoreVal = 100;
        int scoreVal = scan.nextInt();
		
        //90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F
        String scoreRank = "F";
        if(90 <= scoreVal && scoreVal <= 100) {
        	scoreRank = "A";
        	
        } else if(80 <= scoreVal && scoreVal < 90) {
        	scoreRank = "B";
        	
        } else if(70 <= scoreVal && scoreVal < 80){
        	scoreRank = "C";
        	
        } else if(60 <= scoreVal && scoreVal < 70) {
        	scoreRank = "D";
        }
        System.out.println(scoreRank);
    }

}//
