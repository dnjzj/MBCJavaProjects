package quiz;

// 2024.10.29.Tue. (09:50~10:10) ~11:10
public class ForQuiz1 {
	
	public static void main(String[] args) {
		// Quiz 1) 1 ~ 200 사이의 숫자 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.
		int sum = 0;
		for(int i = 1; i <= 200; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("2 또는 3의 배수가 아닌 수의 총합: " + sum);// 6733
		
		
		
		// Quiz 2) 랜덤 알파벳 대문자 50개를 생성해서 출력하는 프로그램을 만들어 보세요.
		// 			단, 10줄마다 줄바꿈 실행해야 합니다.
		//			조건 1. Math.random()을 활용해서 작업합니다.
		//			조건 2. char 타입의 특징을 생각해서 작업을 진행합니다. 정수 자료형, 1글자 출력(ASCII 코드 참조)
		for(int i = 1; i <= 50; i++) {
			int k = (int)(Math.random() * 26) + 65; // 65 ~ 90(26개)
			char ch = (char) k;
			// char ch = (char)('A' + (int)(Math.random() * 26));
			
			System.out.print(ch);
			if(i % 10 == 0) System.out.println();
			
		}
		
//		System.out.println(((int)'a'));// A=65, a=97
//		System.out.println(((int)'Z'));// A=65, Z=90, 90-65=25 -> 26개
		
//		int min = 65, max = 65;
//		for(int i = 0; i < 50; i++) {
//			int k = (int)(Math.random() * 26) + 65; // 0.0 ~ 1.0 미만 -> 0 ~ 25 -> 65 ~ 90
//			if(min > k) min = k;
//			if(max < k) max = k;
//		}
//		System.out.println(min + " " + max);
		
	}
}
