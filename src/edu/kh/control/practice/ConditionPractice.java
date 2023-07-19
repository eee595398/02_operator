package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("숫자를 한 개 입력하세요 : ");
		int input=sc.nextInt();
		if(input<0) {
			System.out.println("양수만 입력해주세요.");
			}
		
		if(input%2==0) {
			System.out.println("짝수입니다.");
		}
		else if(input%2==1)	{
			System.out.println("홀수입니다.");
	}

	}
	public void practice2() {
		System.out.println("국어점수 : ");
		int input1=sc.nextInt();
		System.out.println("수학점수 : ");
		int input2=sc.nextInt();
		System.out.println("영어점수 : ");
		int input3=sc.nextInt();
		
		int in = input1+input2+input3;
		double in1 = in/3;
		if(in1<60&&input1<40) {
			System.out.println("불합격입니다");
		}
		else if(input2<40&&input3<40) {System.out.println("불합격입니다");
		}
		
		else 
			{System.out.printf("국어 :%d\n",input1);
		    System.out.printf("수학 :%d\n",input2);
		    System.out.printf("영어 :%d\n",input3);
		    System.out.printf("합계 :%d\n",in);
		    System.out.printf("평균 :%.1f\n",in1);
		    System.out.printf("축하합니다, 합격입니다!");
			}
		    
		    
	
	}
	public void practice3() {
		System.out.println("1~12 사이의 정수 입력 : ");
		int month=sc.nextInt();
		String result; 
		switch (month) {
		case 1 : case  3 : case 5 :  case 7 : case 8 : case  10 : case 12 : 
		System.out.print(month + "월은 31일까지 있습니다");break;
		case 9 : case  11 : case 4 : case 6 : result = "30일";
        System.out.print(month + "월은 30일까지 있습니다");break;
		case 2 :
		System.out.print(month + "월은 28일까지 있습니다");break;
	    default :
	    System.out.printf("잘못된 달입니다.");
		}
	   	
		
		
	}
	
	public void practice4() {
		String result;
		System.out.println("키(m)를 입력해 주세요 : ");
		double input1 = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 ");
		double input2 = sc.nextDouble();
		double bmi = input2/(input1+input1)*100;
		System.out.println("BMI 지수 "+ bmi);
		if(bmi>=18.5&&bmi<23) {
			result = "정상체중";
		}
		else if(bmi>=23&&bmi<25) {
			result = "과체중";
		}
		else if(bmi>25&&bmi<30) {
			result = "비만";
		}
		else if(bmi<18.5) {
			result = "저체중";
		}
		else {result ="고도비만";}
		System.out.println(result);
		
	}
	public void practice5() {
		System.out.println("중간 고사 점수 : ");
		int input1=sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int input2=sc.nextInt();
		System.out.println("과제 점수 : ");
		int input3=sc.nextInt();
		System.out.println("출석 횟수 : ");
		int input4=sc.nextInt();
		System.out.println("=======결과======");
		double in1 = input1*0.2;
		// input1*=0.2;
		double in2 = input2*0.3;
		double in3 = input3*0.3;
		double in4 = input4;
		double in5 = in1+in2+in3+in4;
		if(in4<15) {
			System.out.printf("Fail[출석 횟수 부족]("+ input4+"/20)");
		}
		else 
	  {System.out.printf("중간 고사 점수(20) : %.1f\n",in1);
		System.out.printf("기말 고사 점수(30) : %.1f\n",in2);
		System.out.printf("과제 점수(30) : %.1f\n",in3);
		System.out.printf("출석 점수(20) : %.1f\n",in4);
		System.out.printf("총점 : %.1f\n",in5);
	  
		if (in5>70){
			System.out.println("Pass");
		}
		else System.out.println("Fail");
		
	  }
	}
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		for(int i =1; i<=input; i+=2) {
			System.out.println(i);}
			
		}
		
    public void ex6() {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 번호 : ");
		double input = sc.nextDouble();
			for(double i =1; i<=input; i+=0.5) {
				System.out.println(i);
				
			}
			
	}
    public void ex7() {
    	//영어 알파벳 A 부터 Z까지 한줄로 출력
    	//AB...
    	
    	//*char 자료형은 문자형이지만 실제로 정수(문자표 번호)를 저장한
    	
    	for(int i ='A'; i<='Z'; i++) {
			System.out.println((char)i);}//강제형변환
    	for(char i ='A'; i<='Z'; i++) {
			System.out.println(i);}//강제형변환
    	
    }
    public void ex8() {
    	// 10에서 1까지 1씩 감소하며 출력
    	for(int i=10; i>0; --i) {
    		System.out.println(i);
    	}
    	
    }
    public void ex9() {
		//for 문 응용 1 : 반복문을 이용한 값의 누적
    	// 1부터 10 까지 모든 정수의 합 구하기 
    	int sum = 0;
    	//반복 되어 증가되는 i값의 합계를 저장할 변수
    	// 0으로 시작하는 이유 : 아무것도 더하지 않음으로 정확히 결과를 도출할 수 있기때문
    	
    	for(int i = 1; i<=10; i++) {
    		//sum = sum+i;
    		sum+=i;
    	}
    	System.out.println("합계 : " + sum);
    	
	}
    public void ex10() {
    	// for문 응용 2 : 정수 5개를 입력 받아서 합계 구하기
    	Scanner sc = new Scanner(System.in);
    	
       int sum = 0;
    	for(int i=1; i<=5; i++) {
    		System.out.print("입력" + i +":");
    		int input = sc.nextInt();
    
    		sum +=input; // sum에 입력 받은 input 값 누적
    	}
    	System.out.println("합계" + sum);
    }
    
    public void ex11() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("입력 받을 정수의 개수 : ");
    	int input = sc.nextInt();
    	int sum = 0;
        for(int i=1; i<=input; i++) {
        System.out.print("입력  : " + i + " ");
        
        sum+=input;
        }
        System.out.print("합계  : " +  sum);
    	
    }
    public void ex12(){
    	// 1부터 20까지 1씩 증가하면서 출력
    	// 단, 5의 배수() 를 붙여서 출력
    	// ex) 1 2 3 4(5) 6 7 8 9 (10) 11 ..(20) 
    	for(int i= 1; i<=20; i++) {
    		if(i%5==0) {
    			 System.out.print("(" + i +")");
    		}
    		else { 
    			System.out.print(i +" ");
    		}
    	}
    }
    public void ex13() {
    	// 1부터 20까지 1씩 증가하면서 출력
    	// 단, 입력 받은 수의 배수()표시
    	
    	// ex) 괄호를 표시할 배수 :3
    	// 1 2 (3)
    	System.out.print("괄호를 표시할 배수 : ");
    	int input = sc.nextInt();
    	int sum = 0;
    	for(int i=1; i<=20; i++) {
    		if(i%input ==0) {
    			System.out.print("(" + i +")");
    		}
    		else { 
    			System.out.print(i +" ");
    		}
    	}
    }
    public void ex14() {
    	// 구구단 출력
    	// 2 ~ 9 사이 수를 하나 입력받아 
    	// 해당 단을 출력
    	// 단, 입력받은수가 2~9 사이 숫자가 아니면 "잘못 입력하셨습니다" 출력
    	
    	System.out.print("단 입력 : ");
    	int dan = sc.nextInt();
    	if(dan>=2 && dan<=9) {
    		for(int i=1; i<=9; i++) {
    			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
    		}
    		
    	}
    	else {
    		System.out.print("잘못 입력하셨습니다");
    	}
    }
    public void ex15() {
    	// 19단 출력기
    	// 2 ~ 19단 사이 단을 입력 받아서 x1 ~x19까지 출력
    	// 단, 2 ~ 19 사이 단이 입력되지 않으면 " 잘못입력" 출력
    	System.out.print("단 입력 : ");
      	int dan = sc.nextInt();
    	if(dan>=2 && dan<=19) {
    		for(int i=1; i<=19; i++) {
    			System.out.printf("%d X %d = %d\n",dan, i, dan*i);
    		}
    	}
    	else { System.out.print("잘못 입력하셨습니다");
    		
    	}
    }
    public void ex16() {
    	//구구단 모두 출력하기
    	//중첩 반복문 
    	for(int dan = 2; dan<=9; dan++) { //2~9단 까지 차례대로 증가

    		for(int num=1; num<=9; num++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
    			System.out.printf("%2d x %2d = %2d ", dan, num, dan* num);
    	
    		}
    		
    		System.out.println();//하나의 단 출력이 끝났을때 줄바꿈
    		// 아무 내용 없는 println() == 줄바꿈
    		
    	}
    	
    	
    	
    }
    
    public void ex17() {
    	for(int dan=9; dan>=2; dan--) {
    		for(int num=1; num<=9; num++) {
    			System.out.printf("%d X %d = %2d",dan, num, dan * num);
    		}
    		System.out.println();
    	}
    	
    }
    public void ex18() {
    	// 2중 for 문을 이용해서 다음 모양을 출력하시오 
    	//12345
    	//12345
    	//12345
    	//12345
    	//12345
    	for(int i =1; i<=5; i++) { //5바퀴 반복하는 for문
    		
    		for(int j=1; j<=5; j++) {// 12345 한줄 출력하는 for문
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    	 //54321
    	for(int i=1; i<=3; i++) {
         	for(int j=5; j>=1; j--) {
         		System.out.print(j);
     		}
         	System.out.println();
         	}
         	
         
     	
    	
    }
    public void ex19() {
    	// 2중 for문을 이용하여 다음 모양을 출력하시오
    	//1
    	//12
    	//123
    	//1234
    	for(int i=1; i<=4; i++) {
    		for(int j=1; j<=i; j++) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    	//4321
    	//321
    	//21
    	//1
    	for(int i=4; i>=1; i--) {// 줄반복
    		for(int j=i; j>=1; j--) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    	
    	
    }
    public void ex20() {
    	// 숫자세기 count 
    	// 1부터 20까지 1씩 증가하면서
    	// 3의 배수 총개수 출력
    	// 3의 배수의 합계 출력
    	
    	// 3 6 9 12 15 18 : 6개
    	// 3의 배수 합계 : 63
    	int count = 0; // 3의 배수의 개수를 세기 위한 변수
    	int sum = 0; // 3의 배수의 합계를 구하기 위한 변수
    	
    	for(int i = 1; i<=20; i++) {
    		if(i%3 == 0) {
    			System.out.print(i+ " ");
    			count++;
    			sum+=i;
    		}
    	}
    	System.out.println(":" + count + "개");
    	System.out.println("3의 배수 합계 : " + sum);;
    }
    public void ex21() {
    	// 1  2  3  4
    	// 5  6  7  8
    	// 9 10 11 12 
    	// 2중 for 문과 count를 이용해서 아래모양 출력하기
    	int count = 1;
    	for(int i=1; i<=3; i++) {// 3줄
    		for(int j=1; j<=4; j++) {//4칸
    			System.out.printf("%3d",count);
    			count++;
    		}
    		System.out.println();
    	}
    }
    public void ex22() {
    	for(int dan =1; dan<=9; dan++) {
    		for(int i = 2; i<=9; i++) {
    			System.out.printf("%2d X%2d =%2d     ",i,dan,i*dan);
    			
    		}
    		System.out.println();
    	}
    	
    	
    }
    
	}

