package ch3;

import java.util.Scanner;

// 2024.10.28.Mon.
public class OperatorEx2 {

	public static void main(String[] args) {
		// 삼항 연산자: 3개의 피연산자 항을 통해서 결과를 출력하는 연산자
		// 형식: 조건식 ? 참인 경우 동작 연산식 : 거짓인 경우 동작 연산식;
		
		int x = 11;		
		boolean result = (x == 10) ? true : false;// 삼항 연산자
		System.out.println("x는 10인가요? " + result);
		System.out.println();
		
		// Q1. 정수를 입력받아 짝수면 짝수를, 홀수이면 홀수를 출력하는 코드를 작성해 보세요.
		//	   단, 입력은 Scanner를 사용해서 nextInt()를 통해서 값을 전달받습니다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int n = scanner.nextInt();
		
		String resultString = (n % 2 == 0) ? "짝수" : "홀수";
		System.out.println(resultString);
		
		// Q2. 정수 입력값이 3의 배수이면서 짝수이면, 그 값을 출력해 주세요. -> 6의 배수인 숫자 찾기
//		resultString = (n % 6 == 0) ? n + "(3의 배수이면서 짝수)" : "3의 배수이면서 짝수가 아닙니다.";
		
		// (n % 3 == 0 && n % 2 == 0)
		// (n % 6 == 0)
		int resultInt = (n % 6 == 0) ? n : 0;// 수학적으로 0의 어떤 수의 배수값이 될 수 없다.
		System.out.print("입력값이 3의 배수이면서 2의 배수인 경우의 값: " + resultInt);
		
		scanner.close();
	}

}
