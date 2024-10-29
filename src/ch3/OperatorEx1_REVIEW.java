package ch3;

// 2024.10.28.월 : 비트 연산자 및 이진수, 음수표현(2의 보수) 등 복습
public class OperatorEx1_REVIEW {
	public static void main(String[] args) {
//		//*********** 부호 연산자 ***********
//		// 변수의 부호를 유지하거나 변경...  +(부호 변경X), -(부호 변경)
//		int a = 10;
//		System.out.println("+ 부호 연산자 사용 결과 : "+ (+a));
//		System.out.println("+ 부호 연산자 사용 결과 : "+ (-a));
//		
//		
//		
//		// *********** 증감 연산자 ***********
//		//  변수의 값을 1씩 증가 혹은 감소시키는 연산자
//		//  ++(1씩 증가), --(1씩 감소)
//		//  전치(증가/감소를 먼저 한 후에 변수 처리) ex) ++a, --a, 
//		//  후치(변수값 사용 후 증가/감소 처리) ex) a++, a--
//		System.out.println("++ 처리 결과 : "+ (++a));  // 11
//		System.out.println("-- 처리 결과 : "+ (--a));  // 10
//		System.out.println(a);
//		// 후치 처리 결과
//		System.out.println("++ 후치 결과 : "+ a++);    // 10출력 , a값 1증가
//		System.out.println("-- 후치 결과 : "+ a--);    // 11출력 , a값 1감소
//		System.out.println(a);  // 10
//		// 10 + a++ = ?, 
//		System.out.println(10 + a++);   // 20
//		
//		
//		
		// *********** 산술 연산자 ***********
		//  +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)
		int x = 10, y = 20;
		System.out.println("**** 산술 연산 ****");
		System.out.println(x + y);   		// 30
		System.out.println(x - y);			// -10
		System.out.println(x * y);			// 200
		System.out.println(x / y);			// 0  ?? 0.5가 아닌 이유. 정수라서.
		System.out.println(x / (double)y);	// 0.5
		System.out.println(x % y);          // 10
		// %(mod) 연산의 특징...계산 결과는 우측 피연산자의 값의 범위에 있음.
		// x % 10 => 0,1,2,3,4,5,6,7,8,9
		// x % 3  => 0,1,2
		//  사용되는 곳이 배수관계, 난수 계산
		// 제곱
		System.out.println((int)Math.pow(x, 3));// 1000  // x위치에 값, 3은 3승
		System.out.println();
		
		// 오버플로우 : 타입의 허용하는 최대값을 벗어나는 것
		// 언더플로우 : 타입의 허용하는 최소값을 벗어나는 것
		byte over = (byte)(127 + 1);
		System.out.println("오버플로우 결과 : "+over);	// -128
		byte under = (byte)(-128 - 1);
		System.out.println("언더플로우 결과 : "+under);	// 127
		
		// 정확한 계산은 정수 연산을 통해서 작업... 
		// 산술 연산을 정확하게 계산하기 위해서는 실수 타입으로 계산하지 않는게 좋음.
		int apple = 1;   		// 사과 개수
		double pieceUnit = 0.1;	// 조각의 크기
		int number = 7;			// 조각의 갯수
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양 : " + result);			// 0.29999999999999993
				
		int result2 = (apple * 10) - number * (int)(pieceUnit * 10);
		System.out.println("정수로 변환후 계산 : "+ result2/(double)10);	// 0.3
		
//		// 나눗셈 연산에서 예외
//		// Infinity(무한대), NaN(Not a Number)
//		// 좌측은 정수이고, 우측 피연산자가 0인 경우. ArithmeticException 발생
//		//  5 / 0.0  => 무한대
//		//  5 % 0.0  => NaN
//		// 이 두 가지의 경우에 연산은 수행하면 안됨. 
//		// 무한대 혹은 NaN인지 확인하는 메서드... 
//		// Double.isInfinit()와 Double.isNaN() 메서드(함수)를 통해서 무한대 혹은 NaN인지
//		// 확인이 가능함. 
//		System.out.println( Double.isInfinite( (5/0.0) ) );		// 무한대인지 여부 확인
//		System.out.println(Double.isNaN((5%0.0)));		 		// NaN인지 여부 확인
//		
//		
//		
		// // *********** 비교 연산자 ***********
		// (동등비교) : ==(같다), !=(다르다)
		// (크기비교) : <, <=, >, >=
		// 비교 결과는 boolean 타입으로 반환 -> true/false
		// 흐름 제어문인 조건문 if, 반복문 for,while에서 실행의 흐름을 제어할 때 주로 사용
		x = 5;
		y = 10;
//		System.out.println("**** 비교 연산자 ****");
//		System.out.println("x == y 결과 : " + (x == y));
//		System.out.println("x != y 결과 : " + (x != y));
//		System.out.println("x < y 결과 : " + (x < y));
//		System.out.println("x <= y 결과 : " + (x <= y));
//		System.out.println("x > y 결과 : " + (x > y));
//		System.out.println("x >= y 결과 : " + (x >= y));
//		
//		// 문자열 비교시.... equals() 또는 !equals()를 ==, != 연산자 대신 사용
//		System.out.println("문자열 비교 -> test 와 test의 비교");
//		System.out.println("test".equals("test"));  // 같은지 여부 확인
//		System.out.println(!"test".equals("test")); // 같지 않은지 여부 확인
//		
//		
//		
//		// *********** 논리 연산자 ***********
//		//  논리곱(&&)-and , 논리합(||)-or, 배타적 논리합(^), 논리 부정(!)
//		// 비교 연산자와 같이 흐름제어를 위한 if, 반복문 for, while 에서 주로 사용함.
//		System.out.println("**** 논리 연산자 ****");
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);   // shortcut 연산
//		System.out.println(false && false);
//		System.out.println("결과 : "+ (x > y && ++x == 10));
//		System.out.println(x);
//		System.out.println();
//		System.out.println(true || true);	// shortcut 연산
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
//		System.out.println();
//		System.out.println(true ^ true);
//		System.out.println(true ^ false);
//		System.out.println();
//		System.out.println(!true);
//		System.out.println(!false);
//		
//		
//		
		// *********** 비트 논리 연산자 ***********
		System.out.println("**** 비트 논리 연산자 ****");
		// x = 5  => 0000_0101
		// y = 15 => 0000_1111
		x = 5; y = 15;
		System.out.println(x & y);  // 5
		//   	0000_0101
		//	&	0000_1111
		//      ==========
		//      0000_0101
		
		System.out.println(x | y);	// 15
		//   	0000_0101
		//	|	0000_1111
		//      ==========
		//      0000_1111
		
		System.out.println(5 ^ y);	// 10
		//   	0000_0101
		//	^	0000_1111
		//      ==========
		//      0000_1010
		
		System.out.println(10 ^ y);	// 5
		//   	0000_1010
		//	^	0000_1111
		//      ==========
		//      0000_0101
		
		System.out.println(~5);     // -6
		//      0000_0101
		//      1111_1010

		
		
		// *********** 비트 이동 연산자 ***********
		// 비트를 좌측 또는 우측으로 밀어서 이동시키는 연산을 수행
		//  <<, >>, >>>
		// <<
		System.out.println(10<<2);		// 40			// 왼쪽 shift연산은 정수 * 2배수	-> 10 * 2^2 = 10 * 4
		//   	0000_1010(10) 
		// <<           2
		// ===============
		//      0010_1000(40)     

		System.out.println(10>>2);		// 2			// 오른쪽 shift연산은 정수 / 2배수 -> 10 / 2^2 = 10 / 4
		//		0000_1010(10)
		// >>           2
		// ===============
		//      0000_0010
		
		System.out.println(-10>>2);		// -3			// 오른쪽 shift연산은 정수 / 2배수	-> -10 / 2^2 = -10 / 4 = ...
		//   	1111_0110(-10) 
		// >>           2
		// ===============
		//      1111_1101(-3) -> 1_0000_0000(0) - 1111_1101(-3) = 0000_0011(3), 따라서 1111_1101은 3의 음수표현은 -3이다
		
		// 1111 1111 1111 1111 1111 1111 1111 0110(-10)	// 계산기 프로그래머 DWORD(8bit * 4byte = 32칸)
		// >>          							 2		// '산술 시프트' 선택
		// =======================================
		// 1111 1111 1111 1111 1111 1111 1111 1101(-3)
		
		
		System.out.println((-10>>>2));	// 1073741821	// 오른쪽 shift연산은 정수 / 2배수
		// 1111 1111 1111 1111 1111 1111 1111 0110(-10)	// 계산기 프로그래머 DWORD(8bit * 4byte = 32칸)
		// >>>          						 2		// '산술 시프트' 아닌 '논리적 시프트'로 변경
		// =======================================
		// 0011 1111 1111 1111 1111 1111 1111 1101(1,073,741,821)
		
		
		
		// *********** 대입 연산자 ***********
		// = -> 왼쪽변수에 오른쪽 비연산자를 대입
		// 복합 대입 연산자
		// +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
		// 왼쪽 피연산자 항에 두 피연산자의 연산결과를 저장!
		// a += 10  => a = a + 10
		
		
		
		// *********** 삼항 연산자 ***********
		// 월요일에..... 
	}
}
