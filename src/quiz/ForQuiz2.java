package quiz;


// 2024.10.29.Tue. (12:10~13:25)
public class ForQuiz2 {
	
	public static void main(String[] args) {
		// 이중 for문 혹은 반복문을 통해서 별찍기
		/*
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 * 	*****
		 */
//		for(int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(i >= j) System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 다음과 같이 별찍기 하세요.
//		/*
//		 * Quiz 1) 
//		 * 
//		 * 		*
//		 * 	   **
//		 * 	  ***
//		 * 	 ****
//		 * 	*****	
//		 * 
//		 */
//		System.out.println();
//		System.out.println("Q1 결과: (정답공개)");
//		for(int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5-i-1; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.println("Q1 결과:");
//		for(int i = 0; i < 5; i++) {		// 0 1 2 3 4
//			for (int j = 4; j >= 0; j--) {	// 4 3 2 1 0
//				// 0:4		0:3		0:2		0:1		0:0
//				if(i >= j) System.out.print("*");
//				else System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		
//		/*
//		 * Quiz 2)
//		 * 
//		 * 	*****
//		 * 	****
//		 * 	***
//		 * 	**
//		 * 	*	
//		 * 
//		 */
//		System.out.println();
//		System.out.println("Q2 결과:");
//		for(int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(i <= j) System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		/*
//		 * Quiz 3)
//		 * 
//		 * 	*****
//		 * 	 ****
//		 * 	  ***
//		 * 	   **
//		 * 	    *	
//		 * 
//		 */
//		System.out.println();
//		System.out.println("Q3 결과:");
//		for(int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(i <= j) System.out.print("*");
//				else System.out.print(" ");
//			}
//			System.out.println();
//		}
		

		/*
		 * Quiz 4)
		 * 
		 * 	    *
		 * 	   ***
		 * 	  *****
		 * 	 *******
		 * 	*********
		 * 
		 */
		System.out.println();
		System.out.println("Q4 결과:");
		for(int i = 0; i < 5; i++) {
			// i : j
			// 0 : 0 1 2 3 * 6 7 8 9 
			// 1 : 0 1 2 * * * 7 8 9
			// 2 : 0 1 * * * * * 8 9
			// 3 : 
			// 4 : 
			//for (int j = 0; j < 10; j++) {
//				
//				i						start
//				0 -> 4 					4 		1개 - 9 = 8 -> 9-start*2
//				1 -> 3 4 5				3 		3개 - 9 = 6 -> 9-3*2=3
//				2 -> 2 3 4 5 6			2 		5개 - 9 = 4
//				3 -> 1 2 3 4 5 6 7		1 		7개 - 9 = 2
//				4 -> 0 1 2 3 4 5 6 7 9	0 		9개 - 9 = 0
			int start = 4 - i;
			int count = 9 - start * 2;
			int end = start + count;
			for (int j = 0; j < 10; j++) {
				if(start <= j && j < end) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

//		
//		/*
//		 * Quiz 5)
//		 * 
//		 * 	*********
//		 * 	 *******
//		 * 	  *****
//		 * 	   ***
//		 *      *	
//		 * 
//		 */
		System.out.println();
		System.out.println("Q5 결과:");
		for(int i = 4; i >= 0; i--) {
			int start = 4 - i;
			int count = 9 - start * 2;
			int end = start + count;
			for (int j = 9; j >= 0; j--) {
				// if(start <= j && j < end) System.out.print("*");// Q4 정답
				if(start < j && j <= end) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
