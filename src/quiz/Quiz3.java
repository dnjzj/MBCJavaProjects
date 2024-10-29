package quiz;

import java.util.Scanner;

// Operation quiz
//OperatorQuiz에 Scanner를 이용해서 입력값 받아 처리하는 프로그램 작성
//1. 두 실수를 입력 받아서 더하기 하는 프로그램 작성
//2. 두 정수를 입력 받아서 빼기하는 프로그램 작성
//3. 두 정수를 입력 받아서 곱하기 하는 프로그램 작성
//4. 두 정수를 입력 받아서 나누기 하는 프로그램 작성
//5. 세 정수를 입력 받아서 더하기 하는 프로그램 작성
public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1/n2);
		
		double d1 = 5.2;
		double d2 = 3.1426;
		System.out.println((float)(d1+d2));// 8.3426
		System.out.println(d1+d2);// 8.342600000000001
		System.out.println();

		System.out.println("1. 두 실수를 입력 받아서 더하기 하는 프로그램 작성");
		System.out.println("실수 입력1: ");
		double num1 = sc.nextDouble();
		System.out.println("실수 입력2: ");
		double num2 = sc.nextDouble();
		System.out.println("결과: " + (num1 + num2));
		System.out.println();
		
		System.out.println("2. 두 정수를 입력 받아서 빼기하는 프로그램 작성");
		System.out.println("정수 입력1: ");
		int num3 = sc.nextInt();
		System.out.println("정수 입력2: ");
		int num4 = sc.nextInt();
		System.out.println("결과: " + (num3 - num4));
		System.out.println();
		
		System.out.println("3. 두 정수를 입력 받아서 곱하기 하는 프로그램 작성");
		System.out.println("정수 입력1: ");
		int num5 = sc.nextInt();
		System.out.println("정수 입력2: ");
		int num6 = sc.nextInt();
		System.out.println("결과: " + (num5 * num6));
		System.out.println();
		
		System.out.println("4. 두 정수를 입력 받아서 나누기 하는 프로그램 작성");
		System.out.println("실수 입력1: ");
		double num7 = sc.nextDouble();
		System.out.println("실수 입력2: ");
		double num8 = sc.nextDouble();
		System.out.println("결과: " + (num7 / num8));
		System.out.println();
		
		System.out.println("5. 세 정수를 입력 받아서 더하기 하는 프로그램 작성");
		System.out.println("정수 입력1: ");
		int num9 = sc.nextInt();
		System.out.println("정수 입력2: ");
		int num10 = sc.nextInt();
		System.out.println("정수 입력3: ");
		int num11 = sc.nextInt();
		System.out.println("결과: " + (num9 + num10 + num11));
		System.out.println();
		
		sc.close();
	}
}
