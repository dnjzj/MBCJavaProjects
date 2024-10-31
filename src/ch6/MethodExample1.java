package ch6;

import java.util.Arrays;

/*
 * 메서드
 * - 클래스 행동 및 기능을 나타낸다. 다른 언어에서는 함수라고도 한다.
 * - JAVA에서는 클래스 내부에선 함수를 정의할 수 있기 때문에 메서드라는 용어를 사용한다.
 * 
 * 
 * 메서드 특징
 * - 어떤 단어(이름) 뒤에 ()가 붙는다.
 * - 한 번 만들면 여러 번 사용 가능하다.
 * - 여러 기능들을 묶어서 이름을 붙여놓은 것을 의미한다.
 * - return 키워드를 사용하여 값을 반환할 수 있다.
 * 
 * 
 * 선언 방식
 * (접근제한자) (static) 반환타입 메서드명(매개변수타입 매개변수명) {
 * 		
 * 		// 기능 구현 코드들...
 * 
 * }
 *  
 * - 접근제한자? public, default, protect, private, ...
 * - static? 생략 가능함
 * - 반환타입? 메서드가 모든 기능을 수행하고 반환할 값의 타입을 의미한다.
 * 		(타입은 int, String,Student, char, boolean, ..., void 등 사용할 수 있다.)
 * 		(void 타입은 함수 반환값이 없을 때 사용한다.)
 * - 메서드명? 메서드 호출을 위해 사용하는 이름
 * - 매개변수? 메서드(함수) 호출 시 함께 전달하는 값을 전달받는 변수
 * - 매개변수 타입? 매개변수의 타입을 의미한다.
 * 
 */
public class MethodExample1 {

	/*
	 * 로또 번호(1~45 사이) 생성하는 메서드(매개변수 X, 반환타입 O)
	 */
	static int[] getLottoNumber() {
		
		final int LOTTO_SIZE = 6;	// final로 한번 선언된 내용은 변경되지 않음(주로 상수 정의할 때 사용)
//		LOTTO_SIZE = 10;			// Error: final로 정의했기 때문에 다른 값 대입 불가
		int[] lotto = new int[LOTTO_SIZE];
		
		// 로또 번호 생성: 1~45 사이의 랜덤 값
		for(int i = 0; i < LOTTO_SIZE; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			// 검증: 중복된 번호를 뽑지 않도록 체크
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		// 실행 결과 반환
		return lotto;
	}
	
	
	/*****************************
	 * Q1. 토끼 이모티콘을 console에 출력하는 createRabbit() 메서드을 구현하세요.
	 * 	(quiz 패키지 > Quiz1.java > 문제 1번) 12:35~
	 * 
	 *	결과: 아래 문자열을 console에 출력합니다.
	 	===================
		      /)/)
		     (  ..)
		     (   >♡
		 Have a Good Time.
		=================== 		
	 */
	static void createRabbit() {
		System.out.println("===================");
		System.out.println("      /)/)");     
		System.out.println("     (  ..)");
		System.out.println("     (   >♡");
		System.out.println(" Have a Good Time.");
		System.out.println("===================");
		return; // 1. 함수(메서드) 종료, 2. 값 반환 처리(void는 반환값이 없음)
	}
	
	
	/*****************************
	 * Q2. 메시지를 전달받아 해당 메시지 "* * *" 값을 양쪽에 붙인 문자열을 만드는 메서드를 구현하세요.
	 * 	   메시지를 전달받아 "* * *" 값을 양쪽에 붙인 문자열을 만들어 반환하는 메서드를 구현하세요.
	 * - 매개값 전달: String
	 * - 반환값: String
	 */
	static String makeBanner(String str) {
//		String message;
//		message = "* * *" + str + "* * *";
//		return message;
		
		return "* * *" + str + "* * *";
	}
	
	
	public static void main(String[] args) {
		// 중복 없이 6개의 숫자(1~45 사이)를 출력하는 함수
		int[] lottoNum = getLottoNumber();
		System.out.println(Arrays.toString(lottoNum));
		
		// 함수(메서드) 호출
		for(int i = 0; i< 10; i++) {
			createRabbit();
		}
		
		// makeBanner("문자열") 결과 확인
		String result = makeBanner("알 림");
		System.out.println(result);					// * * *알 림* * *
		System.out.println(makeBanner("오늘 할 일"));	// * * *오늘 할 일* * *
	}
	
}
