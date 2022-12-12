package ex12.control2.switchbreak;

import java.util.Scanner;

public class Program { 			// 함수들을 수납하는 캡슐화 도구
    public static void main(String[] args) {    // 코드의 영역을 나누는 함수 블록
    	
        int kor1, kor2, kor3;   // 변수 선언: 이 기호들을 변수라고 선언하는 코드
        int total;
        float avg;
        int menu;
        
        Scanner scan = new Scanner(System.in);

        // kor1, kor2, kor3, total, avg 는 컴파일러가 알 수 없는 기호들
        kor1 = 0;
        kor2 = 0;
        kor3 = 0;
     
        종료:
        while (true) {
        	//-----------------------메인 메뉴 부분----------------------
            System.out.println("┌────────────────────────────────┐");
            System.out.println("│            메인 메뉴                                │");
            System.out.println("└────────────────────────────────┘");  
            System.out.println("\t1. 성적 입력");
            System.out.println("\t2. 성적 출력");
            System.out.println("\t3. 종료");
            System.out.println("\t선택 >");
            menu = scan.nextInt();
        	
	         switch (menu) {
	          
	         case 1: 
			       //-----------------------성적 입력 부분----------------------
			        System.out.println("┌────────────────────────────────┐");
			        System.out.println("│            성적 입력                                │");
			        System.out.println("└────────────────────────────────┘");  
			        do {
				        System.out.println("국어1 :");
				        kor1 = scan.nextInt();  
				        
				        if(kor1<0 || 100<kor1) {
				        	System.out.println("성적범위(0~100)을 벗어났습니다.");
				        }
			        }
			        while(kor1<0 || 100<kor1);
			        
			        do {
				        System.out.println("국어2 :");
				        kor2 = scan.nextInt();  
				        
				        if(kor2<0 || 100<kor2) {
				        	System.out.println("성적범위(0~100)을 벗어났습니다.");
				        }
			        }
			        while(kor2<0 || 100<kor2);
			        
			        do {
				        System.out.println("국어3 :");
				        kor3 = scan.nextInt();  
				        
				        if(kor3<0 || 100<kor3) {
				        	System.out.println("성적범위(0~100)을 벗어났습니다.");
				        }
			        }
			        while(kor3<0 || 100<kor3);
	       	    	break;              	
	         case 2:
			       //-----------------------성적 출력 부분----------------------
			        
			        total = kor1 + kor2 + kor3;
			        avg = total/3.0f;
			        
			        System.out.println("┌────────────────────────────────┐");
			        System.out.println("│            성적 출력                                │");
			        System.out.println("└────────────────────────────────┘");
			        // for(int n=3;0<n;n--)
			        for(int i=0;i<3;i++) {
			        System.out.printf("\t국어%d : %3d\n",i+1, kor1);
			        }	        
			        System.out.printf("\t총점 : %3d\n", total);
			        System.out.printf("\t평균 : %6.2f\n", avg);
			        System.out.println("──────────────────────────────────");
			        break;
	         case 3: 
	        	 break 종료;
	       	   
	         default: 
				System.out.println("잘못된 값을 입력하셨습니다.(1~3입력 가능합니다.)");
	       	   
	           }
	       
        } 
        System.out.println("시스템이 종료되었습니다.");
   }
}