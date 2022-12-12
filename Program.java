package ex3.io.escape;
public class Program { // 함수들을 수납하는 캡슐화 도구
    public static void main(String[] args) {    // 코드의 영역을 나누는 함수 블록
        int kor1, kor2, kor3;   // 변수 선언: 이 기호들을 변수라고 선언하는 코드
        int total;
        float avg;

        // kor1, kor2, kor3, total, avg 는 컴파일러가 알 수 없는 기호들
        kor1 = 50;
        kor2 = 60;
        kor3 = 80;

        total = kor1 + kor2 + kor3;
        avg = total/3.0f;

       //-----------------------성적 출력 부분----------------------
        System.out.println("┌────────────────────────────────┐");
        System.out.println("│            성적 출력                                │");
        System.out.println("└────────────────────────────────┘");
        
        
        System.out.printf("\t국어1 : %3d\n", kor1);
        System.out.printf("\t국어2 : %3d\n", kor2);
        System.out.printf("\t국어3 : %3d\n", kor3);
        System.out.printf("\t총점 : %3d\n", total);
        System.out.printf("\t평균 : %6.2f\n", avg);
        System.out.println("──────────────────────────────────");
        
    }
}