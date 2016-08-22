package step3;

import java.util.Scanner;

public class PrintFor2007 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        String[] monthVal = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        //int monVal = 1;
        //int dayVal = 1;
        
        int monVal = scan.nextInt();
        int dayVal = scan.nextInt();
		
        //월은 눈에보이는 월이 아닌 그 이전까지 계산 후 + 일을 한다
        for(int i = 1; i < monVal; i++) {
            if(i == 4 || i == 6 || i == 9 || i == 11) {
                dayVal = dayVal + 30;
        	
            } else if(2 == i) {
                dayVal = dayVal + 28;
        		
            } else {
                dayVal = dayVal + 31;
            }
        }
        //System.out.println(dayVal % 7);
        System.out.println(monthVal[dayVal % 7]);
    }

}//
