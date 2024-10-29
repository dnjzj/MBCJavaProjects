package ch3;

public class OperatorEx1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("+ 부호 연산자 사용 결과: " + (+a));
		System.out.println("- 부호 연산자 사용 결과: " + (-a));
	
		// 증감 연산자
		System.out.println("++ 전치 처리 결과: " + (++a));
		System.out.println("-- 전치 처리 결과: " + (--a));
		System.out.println(a);
		
		System.out.println("++ 후치 처리 결과: " + (a++));
		System.out.println("-- 후치 처리 결과: " + (a--));
		System.out.println(a);
		/**
			[결과]		
			++ 전치 처리 결과: 11
			-- 전치 처리 결과: 10
			10
			++ 후치 처리 결과: 10
			-- 후치 처리 결과: 11
			10
		*/	
		
		int x = 10, y = 20;
		System.out.println(x + y);
		System.out.println(x - y);		
		System.out.println(x * y);		
		System.out.println(x / y);		
		System.out.println(x / (double)y);
		System.out.println(x % y);// 배수관계, 난수 계산 시 사용되는 mod(나머지) 연산
		
		// 제곱
		System.out.println((int)Math.pow(x,  3)); // x 위치에 값, 3은 3승, 반환타입은 실수이기에 int로 캐스팅, 결과: 1000
		System.out.println();
		
		// 오버플로우: 타입이 허용하는 최대값을 벗어나는 현상
		byte over = (byte)(127 + 1);
		System.out.println("오버플로우 결과: " + over);		// -128
		
		// 언더플로우: 타입이 허용하는 최소값을 벗어나는 현상
		byte under = (byte)(-128 - 1);
		System.out.println("언더플로우 결과: " + under);		// 127
		
		// 3.4. 정확한 계산을 위한 정수 연산(87p)
		// 정확한 계산은 정수 연산을 통해서 작업한다. 따라서 산술 연산을 정확하게 계산하기 위해서는 실수 타입으로 계산하지 않는 게 좋다.
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result1 = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result1);
		
		double result2 = (int)((apple - number * pieceUnit) * 100)/100.0;
		System.out.println("(...): " + result2);// 0.29
		
		int result3 = (apple * 10) - number * (int)(pieceUnit*10);
		System.out.println("정수로 변환 후 계산: " + result3 / 10.0); // 3
		
		double result4 = (apple * 10 - number * (int)(pieceUnit * 10)) / 10.0;
		System.out.println("(...): " + result4);// 0.3
		
		// 3.5. 나눗셈 연산 후 NaN(Not a Number)과 Infinity(무한대) (88p)
		// ArithmeticException 발생
		System.out.println(Double.isInfinite(5/0.0));	// 무한대 여부
		System.out.println(Double.isNaN(5%0.0));		// NaN 여부
		System.out.println((5/0.0));	// Infinity
		System.out.println((5%0.0));	// NaN(Not a Number)
		
		// 비교 연산자
		System.out.println("**** 비교 연산자 ***");
		System.out.println("x == y	: " + (x == y));
		System.out.println("x != y	: " + (x != y));
		System.out.println("x < y	: " + (x < y));
		System.out.println("x <= y	: " + (x <= y));
		System.out.println("x > y	: " + (x > y));
		System.out.println("x >= y	: " + (x >= y));

		// 문자열 비교
		System.out.println("**** 문자열 비교는 ==, != 대신 equlas()를 활용한다 ****");
		System.out.println("test".equals("test"));
		System.out.println(!"test".equals("test"));
		
		// 논리 연산자(비트 연산자에서는 shortcut 연산 없음)
		System.out.println("**** 논리 연산자 ***");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);	// shortcut 연산
		System.out.println(false && false);	// shortcut 연산
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("결과: " + (x > y && x / 2 == 2));
		// shortcut 연산 확인: 비트 연산자에서는 shortcut 연산 없음
		System.out.println("shortcut 연산 확인 1: " + (false && ++x == 10));
		System.out.println("x = " + x);
		System.out.println("shortcut 연산 확인 2: " + (true && ++x == 10));
		System.out.println("x = " + x);
		System.out.println();
		System.out.println(true || true);	// shortcut 연산
		System.out.println(true || false);	// shortcut 연산
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println();
		
		// 비트 연산자
		x = 5;		// 0000_0101 (평문)
		y = 15;		// 0000_1111 (키값)
		System.out.println("**** 비트 연산자 ***");
		System.out.println(x & y);
		System.out.println(x | y);
		// 참고: 배타적 논리합은 "암호문, 해시값 계산"할 때 사용
		System.out.println(x ^ y);	// 10 (암호문)99
		System.out.println(10 ^ y);	// 5 (원래있던 x값)
		
		// ~(0000_0101) = 1111_1010 = 얘가 왜 -6이지????????
		System.out.println(~5);		// -6
		System.out.println();
		
		// 비트 이동 연산자(Shift 연산자): 비트를 좌 또는 우측으로 밀어 이동시키는 연산 수행
		System.out.println("**** 비트 이동 연산자 ***");
		System.out.println(10 << 2);	// left shift는 "정수값 * 2의 배수": 10 * 2의2승 = 40
		System.out.println(10 << 3);	// left shift는 "정수값 * 2의 배수": 10 * 2의3승 = 80
		
		System.out.println(-10 >> 2);	// -3 (right shift는 정수 / 2의 배수 : 10 / 2의2승 = 2.3
		System.out.println(10 >> 2);	// 2 (right shift는 정수 / 2의 배수 : 10 / 2의2승 = 2.3
		
		// unsinged shift
		// -10 = 1111_0110 = 1111_1111 1111_1111 1111_1111 1111_0110
		//       >>>     2
		//       		   = 0011_1111 1111_1111 1111_1111 1111_1101
		System.out.println(-10 >>> 2);	// 1073741821
		System.out.println((10 >>> 2));	// 2
	}
}
