package quiz;

// 2024.10.29.Tue. (16:15~16:40)
public class LoopQuiz1 {

	public static void main(String[] args) {
		// Lotto 번호를 출력하는 프로그램 작성
		/*
		 * Quiz. 중복되지 않는 당첨번호 6개 출력하기
		 * 1. 1부터 45 사이의 랜덤 숫자를 생성
		 * 2. 크기 6의 int형 배열에 랜덤 숫자를 중복없이 담기
		 * 		=> 배열을 안 배웠기 때문에 "변수 6개를 선언해서 값을 대입한다"로 변경
		 * 		=> lotto1 ~ lotto6
		 * 3. 번호 출력
		 * 
		 */
		// test
//		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//		System.out.printf("Integer\tMAX: %d, MIN: %d\n", min, max);
//		for (int i = 0; i < 100; i++) {
//			int random = ((int) (Math.random() * 45)) + 1;
//			if (min > random) min = random;
//			if (max < random) max = random;	
//		}
//		System.out.printf("Lotto\tMAX: %d, MIN: %d\n", min, max);
		
		
		// 나의 답
		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int lotto6 = 0;
		int count = 0;
//		
//		while(true) {
//			int random = (int) (Math.random() * 45) + 1;
//			count++;
//			
//			if (lotto1 == 0) {
//				lotto1 = random;
//			} else if (lotto2 == 0 && lotto1 != random) {
//				lotto2 = random;
//			} else if (lotto3 == 0 && lotto2 != random && lotto1 != random) {
//				lotto3 = random;
//			} else if (lotto4 == 0 && lotto3 != random && lotto2 != random && lotto1 != random) {
//				lotto4 = random;
//			} else if (lotto5 == 0 && lotto4 != random && lotto3 != random && lotto2 != random && lotto1 != random) {
//				lotto5 = random;
//			} else if (lotto6 == 0 && lotto5 != random && lotto4 != random && lotto3 != random && lotto2 != random && lotto1 != random) {
//				lotto6 = random;
//			}
//			
//			if (lotto6 != 0 && lotto5 != 0 && lotto4 != 0 && lotto3 != 0 && lotto2 != 0 && lotto1 != 0)
//				break;
//		}
//		
//		System.out.printf("(count: %d)\n", count);
//		System.out.printf("%d %d %d %d %d %d", lotto1, lotto2, lotto3, lotto4, lotto5, lotto6);
//		
		
		
		
		// (정답) 더 좋은 답 ~16:50
		count = 0;
		while(true) {
			// 번호 생성
			int random = (int) (Math.random() * 45) + 1;
			
			// 검증
			if(random != lotto1 && random != lotto2 && random != lotto3
					&& random != lotto4 && random != lotto5 && random != lotto6) {
				System.out.print(random + " ");
				count++;
			
				// 대입
				if(lotto1 == 0) lotto1 = random;
				else if(lotto2 == 0) lotto2 = random;
				else if(lotto3 == 0) lotto3 = random;
				else if(lotto4 == 0) lotto4 = random;
				else if(lotto5 == 0) lotto5 = random;
				else if(lotto6 == 0) lotto6 = random;
			}
			
			if(count == 6)
				break;
		}
		
		// 또 다른 풀이
		System.out.println();
		count = 0;
		lotto1 = 0; lotto2 = 0; lotto3 = 0; lotto4 = 0; lotto5 = 0; lotto6 = 0;
		while(count < 6) {
			// 번호 생성
			int random = (int) (Math.random() * 45) + 1;
			
			// 검증
			if(random != lotto1 && random != lotto2 && random != lotto3
					&& random != lotto4 && random != lotto5 && random != lotto6) {
				System.out.print(random + " ");
				count++;
				
				// 대입
				if(lotto1 == 0) lotto1 = random;
				else if(lotto2 == 0) lotto2 = random;
				else if(lotto3 == 0) lotto3 = random;
				else if(lotto4 == 0) lotto4 = random;
				else if(lotto5 == 0) lotto5 = random;
				else if(lotto6 == 0) lotto6 = random;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
