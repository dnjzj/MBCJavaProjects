package ch4;

public class ForExample1 {

	public static void main(String[] args) {
		// for문은 같은 코드를 여러 번 반복하고 싶은 때 사용
		/* 
		 * for(초기값; 조건식(condition); 증감식) {
		 * 		조건식이 참인 경우 실행할 코드(반복 실행할 코드)
		 * }
		 */
		
		// for문 기본 형식
		for(int i = 0; i < 10; i++) {
			System.out.println("i의 값: " + i);
		}
		
		// 가독성이 떨어져 권장하는 방식은 아니지만, 초기값과 증감값의 위치는 변경 가능함
		int i = 0;// 초기값
		for( ; i < 10; ) {
			System.out.println("i의 값: " + i++);// 증가값
		}
		
		
		
		// 예제1. for문을 사용하여 1부터 100까지 숫자의 합 구하기
		int sum = 0;
		for(int k = 1; k <= 100; k++) {
			sum += k;
		}
		System.out.println("1부터 100까지 합: " + sum);// 5050
	
		
		
		// 예제2. for문을 사용하여 1부터 100까지 홀수의 합을 구하는 프로그램을 작성하세요(17:30~17:45)
		int oddSum = 0;
		for(int k = 1; k <= 100; k++) {
			if (k % 2 == 1) oddSum += k;
		}
		System.out.println("1부터 100까지 홀수의 합: " + oddSum);		// 2500
		
		/********
		int oddSum = 0;
		int evenSum = 0;
		StringBuilder checkString1 = new StringBuilder();
		StringBuilder checkString2 = new StringBuilder();
		for(int k = 1; k <= 100; k++) {
			if (k % 2 != 0) {
				oddSum += k;
				checkString1.append(k + " + ");
			} else {
				evenSum += k;
				checkString2.append(k + " + ");
			}
		}
		System.err.println("1부터 100까지 홀수의 합: " + oddSum);		// 2500
		System.err.println("1부터 100까지 짝수의 합: " + evenSum);	// 2550
		// 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 + 21 + 23 + 25 + 27 + 29 + 31 + 33 + 35 + 37 + 39 + 41 + 43 + 45 + 47 + 49 + 51 + 53 + 55 + 57 + 59 + 61 + 63 + 65 + 67 + 69 + 71 + 73 + 75 + 77 + 79 + 81 + 83 + 85 + 87 + 89 + 91 + 93 + 95 + 97 + 99 +
		System.err.println(checkString1.toString());
		// 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40 + 42 + 44 + 46 + 48 + 50 + 52 + 54 + 56 + 58 + 60 + 62 + 64 + 66 + 68 + 70 + 72 + 74 + 76 + 78 + 80 + 82 + 84 + 86 + 88 + 90 + 92 + 94 + 96 + 98 + 100 + 
		System.err.println(checkString2.toString());
		********/
		
		
		
		// 문제 1. 100부터 1까지 순서대로 화면에 출력해주세요. 옆으로 출력해주세요. (17:45~18:00)
		String resultString = "";
		for(int k = 100; k > 0; k--) {
			resultString += k + " ";
		}
		System.out.print(resultString);
		System.out.println();
		
		for(int k = 100; k > 0; k--) {
			System.out.print(k + " ");
		}
		

	}

}
