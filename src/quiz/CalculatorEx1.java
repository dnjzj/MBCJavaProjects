package quiz;

//import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Q1. (메서드 활용 실습) 계산기 구현하기
 * - CalculatorEx1 클래스 생성
 * - main()에 switch-case문을 이용하여 메뉴 번호를 선택하면 해당 번호 기능을 동작하게 만들어 주세요.
 * 		>> 초기 메뉴		>> 계산을 선택했을 때
 *  	[계산 프로그램]		선택 > 1
 *  	1. 더하기			더하기 연산 기능 실행
 *  	2. 빼기			첫번째 정수 입력: 10
 *  	3. 곱하기			두번째 정수 입력: 20
 *  	4. 나누기			더하기 결과: 30
 *  	0. 종료			(결과 처리 후에 다시 초기 메뉴가 출력되게 해주세요)
 *  	선택 >			(종료 선택하면 "프로그램을 종료합니다." 출력 후 종료)
 * 
 * - 각 메뉴에 기능 구현은 메서드로 구현한다.
 * - 메서드 예시) add(), sub(), mul(), div(), ...
 * 위와 같은 동작을 하는 프로그램을 작성하세요.
 * 
 * (위 문제 단계별 나누기)
 * 1-1. 메뉴 구성하기 
 * 1-2. 연산 기능을 메서드로 구현하기
 * 		각 더하기, 빼기, 곱하기, 나누기 기능을 메서드로 구현한다. 
 * 
 * 
 * Q2. 내일은 이 계산기도 동일한 기능을 Calurator 클래스 생성을 활용하여 구현하는 퀴즈를 낼 예정 
 *   
 */
public class CalculatorEx1 {
	// 1-2. 연산 기능을 메서드로 구현하기
	public static void add(int a, int b) {// add
		System.out.printf("더하기 결과: %d", (a+b));
	}
	
	public static void sub(int a, int b) {// subtract
		System.out.printf("빼기 결과: %d", (a-b));
	}
	
	public static void mul(int a, int b) {// multiply
		System.out.printf("곱하기 결과: %d", (a*b));
	}
	
	public static void div(int a, int b) {// divides
		/*
		 * "0으로 나눌 수 없습니다." 예외 처리
		 */
		
		/*
		 * 실수 계산 오차 관련 참고
		 * => https://8iggy.tistory.com/232
		 * => BigDecimal 클래스 참고하기
		 */
		// 계산 결과 검증: BigDecimal 활용
//		BigDecimal num1 = new BigDecimal(a);
//		BigDecimal num2 = new BigDecimal(b);		
//		System.out.printf("나누기 결과: %.3f(검증: %.3f)", ((double)a/b), num1.divide(num2));
		
		/*
		 * 오차를 없애기 위한 계산식(선생님 답)
		 * => (int)((num1 / (double)num2) * 100) / (double)100)
		 */
		
		System.out.printf("나누기 결과: %.1f", ((double)a/b));
	}
	
	public static void main(String[] args) {
		
		// 제출)
		Scanner sc = new Scanner(System.in);
		int operator = -1;		// 연산자(1:더하기, 2:빼기, 3:곱하기, 4:나누기, 0:종료
		int a = -1;
		int b = -1;
		
		while (operator != 0) {
			System.out.println("[계산 프로그램]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 종료");			 			
			System.out.print("선택 > ");
			operator = sc.nextInt();
			
			// 종료 또는 없는 메뉴 처리
			if (operator == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (operator > 4) {
				// 메뉴 선택이 잘못됐습니다.
				System.out.println("계산할 수 없습니다.");
				continue;
			}
			
			// 정수값 입력받아 계산하기
			System.out.print("첫번째 정수 입력: ");
			a = sc.nextInt();
			
			System.out.print("두번째 정수 입력: ");
			b = sc.nextInt();
			
			// 연산 및 출력
			switch (operator) {
				case 1 -> add(a, b);			
//					System.out.println("더하기 계산을 합니다.");					
				case 2 -> sub(a, b);
//					System.out.println("빼기 계산을 합니다.");					
				case 3 -> mul(a, b);
//					System.out.println("곱하기 계산을 합니다.");					
				case 4 -> div(a, b);
//					System.out.println("나누기 계산을 합니다.");					
			}
			System.out.println();
			
		}		
		sc.close();
	}
	
	
	/*
	 * 출력결과:
	 * [계산 프로그램]
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		0. 종료
		선택 > 2
		첫번째 정수 입력: 9
		두번째 정수 입력: 4
		빼기 결과: 5
		[계산 프로그램]
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		0. 종료
		선택 > 1
		첫번째 정수 입력: 3
		두번째 정수 입력: 2
		더하기 결과: 5
		[계산 프로그램]
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		0. 종료
		선택 > 3
		첫번째 정수 입력: 6
		두번째 정수 입력: 5
		곱하기 결과: 30
		[계산 프로그램]
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		0. 종료
		선택 > 4
		첫번째 정수 입력: 7
		두번째 정수 입력: 5
		나누기 결과: 1.4
		[계산 프로그램]
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		0. 종료
		선택 > 8
		계산할 수 없습니다.
		[계산 프로그램]
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		0. 종료
		선택 > 9
		계산할 수 없습니다.
		[계산 프로그램]
		1. 더하기
		2. 빼기
		3. 곱하기
		4. 나누기
		0. 종료
		선택 > 0
		프로그램을 종료합니다.

	 */
	
}