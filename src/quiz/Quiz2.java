package quiz;

import java.util.Scanner;

//2024.10.24 출력 문제(12:50~13:10)
public class Quiz2 {
	
	// Scanner Quiz
	public static void main(String[] args) {
		//System.out.println("- .제어문자를 이용하여 출력하도록 작성");
		Scanner sc = new Scanner(System.in);
		
		//Ex. 홍길동 20 010-1234-1234 178.5 75 O
		System.out.println("*** 정보를 입력해주세요 ***");
		System.out.print("> 이름: ");
		String name = sc.nextLine();
		System.out.print("> 나이(숫자만, 정수): ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("> 연락처(Ex.010-000-0000): ");
		String phoneNo = sc.nextLine();
		System.out.print("> 키(숫자만, 실수값): ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("> 몸무게(숫자만, 정수값): ");
		int weight = sc.nextInt();
		sc.nextLine();
		System.out.print("> 혈액형: ");
		String blood = sc.nextLine();
		
		System.out.println("========= 출력 결과 =========");
		System.out.println("이름	: " + name);
		System.out.println("나이	: " + age);
		System.out.println("Tel	: " + phoneNo);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + blood);
		
		sc.close();
		
	}
}
