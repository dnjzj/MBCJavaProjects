package ch4;

/*
 * 다중 for문
 * - 2중
 * - 3중
 * - ...
 */
public class ForExample2 {

	public static void main(String[] args) {
		// 다중 for
		// 2중 for문
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
//				System.out.println("i가 " + i + "이고, j가 " + j + "인 경우");
				System.out.print((i+j) + " ");
			}
			System.out.println();
		}
				
		System.out.println();
		
		// 3중 for문
		for (int i = 0; i < 10; i++) {
			System.out.println("=========================== 바깥쪽 반복문: " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("---------------- 안쪽 반복문: " + i + "-" + j);
				for (int k = 0; k < 10; k++) {
					System.out.println("+++++ 제일 안쪽 반복문: " + i + "-" + j + "-" + k);
				}
			}
		}
				
		System.out.println();

		/*****************************
		 * 예제1. 구구단 출력하기(2~9단)
		 */
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("===== " + dan + "단 =====");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
		}
				
		System.out.println();
		
		/*****************************
		 * 예제2. 구구단 출력하기2(2~9단, 아래와 같이)
		 *
		 * 결과:
		 * 	2 x 1 = 2	3 x 1 = 3	4 x 1 = 4  ... 9 x 1 = 9
		 *  2 x 2 = 4 	3 x 2 = 6	4 x 2 = 8  ... 9 x 2 = 18
		 *  ...
		 *  
		 *  2 x 9 = 18 	3 x 9 = 27	4 x 9 = 36 ... 9 x 9 = 81
		 *  
		 */
		for(int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++) {
//				System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
				System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
			}
			System.out.println();
		}
				
		System.out.println();
		
		/*****************************
		 * 예제3. for문의 초기화 식에는 부동 소수점을 쓰는 float 타입을 사용하지 않도록 주의한다.
		 * 		 따라서 이런 때는 정수로 변환해서 작업하도록 한다.
		 * 
		 * 결과:
		 *		0.1
		 *		0.2
		 *		0.3
		 *		0.4
		 *		0.5
		 *		0.6
		 *		0.70000005
		 *		0.8000001
		 *		0.9000001
		 * 
		 */
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}

	}

}
