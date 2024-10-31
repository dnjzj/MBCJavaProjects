package ch3;

import java.util.Scanner;

/*
 * Quiz3. OperatorQuiz에 Scanner를 이용해서 입력값 받아 처리하는 프로그램 작성
 * 풀이
 */
public class OperationQuiz2 {
	public static void main(String[] args) {
		// Scanner 객체는 사용자의 입력값을 받는 객체
		// 작업 순서: Scanner 객체 생성 > 객체 사용 > 객체 정리
		
		// 1. 두 실수를 입력 받아서 더하기 하는 프로그램 작성
		// 1단계: 객세 생성
		Scanner sc = new Scanner(System.in);

		// 2단계: 객체 사용
		System.out.print("실수 입력 1: ");
		double num1 = sc.nextDouble();
		System.out.print("실수 입력 2: ");
		double num2 = sc.nextDouble();
		
		double result = num1 + num2;
		
		System.out.println("계산 결과: " + result);
		
//		// 3단계: 객체 정리
//		scanner.close();
		
		// 2. 두 정수를 입력 받아서 빼기하는 프로그램 작성
		// 3. 두 정수를 입력 받아서 곱하기 하는 프로그램 작성
		// 4. 두 정수를 입력 받아서 나누기 하는 프로그램 작성
		// 2,3,4 취합: 두 정수를 입력받아 빼기, 곱하기, 나누기
//		// 객체 생성
//		Scanner scanner = new Scanner(System.in);
		
		// 객체 사용
	      System.out.print("첫번째 정수 입력 : ");
	      int i1 = sc.nextInt();
	      System.out.print("두번째 정수 입력 : ");
	      int i2 = sc.nextInt();

	      int minorResult = i1 - i2;
	      int multiResult = i1 * i2;
	      int divResult = i1 / i2;
	      
	      System.out.println("빼기 결과 : " + minorResult);
	      System.out.println("곱하기 결과 : " + multiResult);
	      System.out.println("나누기 결과 : " + divResult);
	      
	      // 객체 정리
	      sc.close();
		
		// 5. 세 정수를 입력 받아서 더하기 하는 프로그램 작성

	}
}
