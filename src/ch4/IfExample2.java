package ch4;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		// 예제 1) 정수를 입력받아 정수가 
		// 		3의 배수이면 "3의 배수입니다."를 출력하고, 
		// 		2의 배수이면 "2의 배수이고, 짝수입니다."를, 
		// 		2의 배수도 아니고 3의 배수도 아니면 "2의 배수도 3의 배수도 아닙니다."라는
		// 		문자열을 출력하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
//		// 나의 답: 오답. X. 왜냐하면 6의 배수인 경우 "3의 배수입니다"만 출력하게 됨. 그러나 6의 배수는 2의 배수이고 3의 배수이기 때문에 오답이다.
//		String resulString = "2의 배수도 3의 배수도 아닙니다.";
//		if (n % 2 == 0 ) {
//			resulString = "2의 배수이고, 짝수입니다.";	
//		} else if (n % 3 == 0) {
//			resulString = "3의 배수입니다.";
//		}
		
		// 1) 단순 if
//		String resulString = "";
//		
//		if (n % 3 == 0) {
//			resulString = "3의 배수입니다.";
//		}
//		if (n % 2 == 0) {
//			resulString = "2의 배수이고, 짝수입니다.";	
//		}
//		if (n % 2 != 0 && n % 3 != 0) {
//			resulString = "2의 배수도 3의 배수도 아닙니다.";
//		}
		
		// 2) if-else 사용하여 동일한 결과값 출력(중첩 if 사용 가능, else if문 사용 X)
		String resulString = "";
		if (n % 2 != 0 && n % 3 != 0) {
			resulString = "2의 배수도 3의 배수도 아닙니다.";
		} else {
			if (n % 2 == 0) {
				resulString = "2의 배수이고, 짝수입니다.";	
			}
			if (n % 3 == 0) {
				resulString = "3의 배수입니다.";
			}
		}
		System.out.println(resulString);
		
		// if-else if-else
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F
		int score = 86;
		if(score >= 90) {
			System.out.println("A 입니다.");
		} else if(score >= 80) {
			System.out.println("B 입니다.");
		} else if(score >= 70) {
			System.out.println("C 입니다.");
		} else if(score >= 0) {
			System.out.println("D 입니다.");
		} else {
			System.out.println("F 입니다.");
		}
		
		sc.close();
	}
}
