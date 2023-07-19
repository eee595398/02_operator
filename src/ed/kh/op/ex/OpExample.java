package ed.kh.op.ex;
import java.util.Scanner;

public class OpExample { // 예제 코드 작성용 클래스 
	
	public void ex1() {
	// ex1() method : 객체 지향 프로그래밍에서 객체와 관련된 함수 	
	// -> OpExample이 가지고 있는 기능 중 ex1() 이라는 기능
		// syso ctrl space
		System.out.println("OpExaple 클래스에 ex1() 기능 수행");
		System.out.println("클래스 분리 테스트");
		System.out.println("println 자동완성");
		}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		// 실행될 때 ExampleRun -> OpExample-> Scanner 순으로 만들어낸다
		// Scanner는 같은 패키지 내에 있지 않기때문에 import(수입) 해와야한다
		
		System.out.println("정수 입력 1 : ");
		int input1 = sc.nextInt(); // 다음 입력되는 정수를 읽어옴.
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d\n", input1, input2, input1 / input2);
		System.out.printf("%d %% %d = %d\n", input1, input2, input1 / input2);
		// %% : printf 에서 % 문자 출력하는 방법
		
		
	}
	
	public void ex3() {
		// 증가 연산자 : ++ --
		// -> 피연산자(값)를 1증가 또는 감소 시키는 연산자
		
		
		int inum1 = 10;
		int inum2 = 10;
		inum1++;
		inum2--;
		System.out.println("inum1 : " + inum1);
		System.out.println("inum2 : " + inum2);
		
		// 전위 연산 : ++3, --2 연산자가 앞쪽에 배치
		// -> 다른 연산자보다 먼저 증가/감소
		int temp = 5;
		System.out.println(++temp + 5);
		
		
		// 후위 연산 : 10++ 연산자가 뒤쪽에 배치
		// 다른 연산자보다 나중에 증가/감소
		int temp2 = 3;
		System.out.println( temp2-- + 2);
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		System.out.printf("%d / %d / %d\n",a, b, c);
		//4/4/7/
		
		
		}
	public void ex4() {
		// 비교 연산자 : >, <, >=, <=, ==, !=
		// -비교 연산자의 결과는 항상 논리값(ture/ false)
		// - 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽!!
		
		// 같다 기호는 =, ==?--> ==
		// 등호 1개 = 대입 연산자로 사용 
		// -> 구분을 위해서 두개(==)를 같다 의미로 사용 
		
		int a =10;
		int b =20;
		
		System.out.println( a > b);
		System.out.println( a < b);
		System.out.println( a != b);
		System.out.println( (a == b) == false );
		System.out.println( "--------" );
		
		int c = 4;
	    int d = 5;
	    
	    System.out.println(c<d);
	    System.out.println(c+1<=d);
	    System.out.println(c>=d-1);
	    System.out.println((++c !=d) == (--c!=d));
	    System.out.println( "--------" );
		
	    int temp = 723;
	    System.out.println("temp는 짝수인가?" + (temp % 2 ==0)); //false
	    System.out.println("temp는 짝수인가?" + (temp % 2 !=1)); 
	    System.out.println("temp는 홀수인가?" + (temp % 2 ==1));
	    System.out.println("temp는 홀수인가?" + (temp % 2 !=0));
	    
	    System.out.println("temp는 3의 배수인가?" + (temp%3 ==0)); //true
	    
	    
		
		
		
	}
	
	public void ex5() {
		// 논리 연산자 : &&(AND), ||(or)
		// &&(AND) 연산자 : 둘 다 ture면 true, 나머지 false
		// 와, 그리고, ~면서, ~ 이면서, ~ 부터 ~까지, ~ 사이
		
		int a =101;
		//a는 100이상 이면서 짝수인가?
		System.out.println(a>=100);
		System.out.println(a%2 ==0 );
		
		System.out.println((a>=100) && (a%2 ==0) );
		
		int b =5;
		// b는 1부터 10까지 숫자 범위에 포함되어 있는가?
		System.out.println(b>=1);
		System.out.println(b<=10);
		System.out.println(b>=1 && b<=10);
		
		System.out.println("-------");
		
		
		//|| (OR) 연산자 : 둘 다 false면 false 나머지는 ture (AND의 반대 )
		// 또는, ~거나, ~ 이거나 
		
		
		int c = 10;
		// c는 10을 초과했거나 짝수인가?
		System.out.println(c>10 || c%2 == 0);
		
		
		
		
		
	}
	public void ex6() {
		// 논리 부정 연산자 : ! 
		// 논리값을 반대로 바꾸는 연산자 
		
		boolean bool1 = true;
		boolean bool2 = !bool1;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("---");
		Scanner sc = new Scanner(System.in);
		
		// 정수를 하나 입력 받았을때 
		// 1) 해당정수가 1부터 100사이 값이 맞는지 확인 
		// 2) 1부터 100사이 값이 아닌지 확인(반대)
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		boolean result1 = 1<=input && input<= 100;
		
		System.out.printf("%d은 1이상, 100이하의 정수인가? : %b\n", input, result1);
		
		// 1미만 또는 100초과
		boolean results2 = (input <1) || (input >100);
		
		boolean result3 = !(1<=input) && (input<= 100);
		
		System.out.printf("%d은 1미만, 100초과 정수인가 : %b/%b\n", input, results2, result3);
	}
	
	
	public void ex7() {
		// 복합 대입 연산자 :+=,-=,*=,/=,%=
		// 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		
		int a = 10;
		// a
		a++;
		System.out.println("a를 1증가 : " + a);
		a+=4;
		System.out.println("a를 4증가 : " + a);
		a-=10;
		System.out.println("a를 10감소 : " + a);
		a*=3;
		System.out.println("a를 3배 증가 : " + a);
		a/=6;
		System.out.println("a를 6으로 나눴을때 몫 : " + a);
		a%=2;
		System.out.println("a를 2로 나눴을때 나머지: " + a);
		
	}
	public void ex8() {
		// 삼항 연산자 : 조걱식 ? 식1 : 식2
		// - 조석식의 결과가 ture면 식1
		// false이면 식2를 수행하는 연산자 
		// * 조석식 : 연산 결과가 true/ false인 식 
		// (비교, 논리, 논리부정 연산이 포함)
		
		int num =30;
		// num이 30보다 크면 (초과) "num은 30보다 큰 수이다"
		// 아니면 num은 30이하의 수 출력
 String  result	=	num > 30?"num은 30보다 큰 수이다" : "num은 30이하의 수이다";
		
		System.out.println(result);
		
		// 입력 받은 정수가 음수인지 양수인지 구분 
		// 단 0은 양수로 처리
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 :");
		int input2 = sc.nextInt();
		String str1 = "양수입니다";
		String str2 = "음수입니다";
        String result2 = input2>=0? str1:str2;
        System.out.print(result2);
		
		
		
		
	}
	
	
	
}
