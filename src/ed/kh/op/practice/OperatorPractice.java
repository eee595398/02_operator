package ed.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	
       public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.println("사탕개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", input2/input1);
		System.out.printf("남는 사탕 개수 : %d\n", input2%input1);
	
		
			}
	
	    public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String input1 = sc.next();
		System.out.println("학년(정수만) : ");
		int input2 = sc.nextInt();
		System.out.println("반(정수만) : ");
		int input3 = sc.nextInt();
		System.out.println("번호)정수만) : ");
		int input4 = sc.nextInt();
		System.out.println("성별(남학생/여학생) :  ");
		String input5 = sc.next();
		System.out.println("성적(소수점 아래 둘째 자리까지 :  ");
		double input6 = sc.nextDouble();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다\n.", input2, input3, input4, input1, input5, input6);
		
		
		
	}
	    
	    public void practice3() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("국어 : ");
	    int input1 = sc.nextInt();
	    System.out.println("영어 : ");
	    int input2 = sc.nextInt();
	    System.out.println("수학 : ");
	    int input3 = sc.nextInt();
	    int sum =input1+input2+input3;
	    System.out.printf("합계 : %d\n",sum);
	    System.out.printf("평균 : %.1f\n",(input1+input2+input3)/3.0);
	   double avg = sum / 3.0;
	    boolean result = (input1>=40) && (input2>=40)&&(input3>=40)&&(avg>=60);
	    System.out.println(result ? "합격" : "불합격");
	
	    

	    }
}
