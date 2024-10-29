package quiz;


//2024.10.29.Tue. (15:40~15:50) 4번까지 변경함 -> ForQuiz2 참고
public class WhileQuiz {
	public static void main(String[] args) {
		// Quiz) 별찍기 5개문제 while문으로 코드 변경하기
		
		/*
		 *  quiz... 다음과 같이 별찍기 하세요... 
		 * 
		 *  1)      *   2) *****   3)    *****
		 *         **      ****          ****
		 *        ***      ***           ***
		 *       ****      **            **
		 *      *****      *             *
		 * 
		 *  4)     *      5)   *********
		 *        ***           *******
		 *       *****           *****
		 *      *******           ***
		 *     *********           *
		 * 
		 */
		// #1
		System.out.println("===== 1 =====");
		//  for (int i = 0; i < 5; i++) {
		//     // 공백 찍기
		//     for (int j = 0; j < 5 - i - 1; j++) {
		//        System.out.print(" ");
		//     }
		//     // 별 찍기
		//     for (int j = 0; j <= i; j++) {
		//        System.out.print("*");
		//     }
		//     System.out.println();
		//  }
		//  
		int i = 0;
		while(i < 5) {
		  int j = 0;
		  while(j < 5 - i - 1) {
			  System.out.print(" ");  
			  j++;
		  }
		  
		  j = 0;
		  while(j <= i) {
			  System.out.print("*");  
			  j++;
		  }
		  
		  System.out.println(); 
		  i++;
		}
		
		
		// # 2
		System.out.println("===== 2 =====");
		//  for (int i = 0; i < 5; i++) {  // 0, 1, 2, 3, 4
		//     for (int j = 0; j < 5 - i; j++) {  // 회차 기대 값은 5, 4, 3, 2, 1
		//        System.out.print("*");
		//     }
		//     System.out.println();
		//  }
		//
		i = 0;
		while(i < 5) {
		  int j = 0;
		  while(j < 5 - i) {
			  System.out.print("*");  
			  j++;
		  }
		  
		  System.out.println(); 
		  i++;
		}
		
		
		// # 3 
		System.out.println("===== 3 =====");
		//  for (int i = 0; i < 5; i++) {  // 0, 1, 2, 3, 4
		//     // 공백 찍기
		//     // 반복 회차 : 0, 1, 2, 3, 4
		//     for (int j = 0; j < i; j++ ) {  // 반복회차 : 0, 1, 2, 3, 4 
		//        System.out.print(" ");
		//     }
		//     
		//     // 별 찍기
		//     for (int j = 0; j < 5 - i; j++) {  // 회차 기대 값은 5, 4, 3, 2, 1
		//        System.out.print("*");
		//     }
		//     System.out.println();
		//  }
		i = 0;
		while(i < 5) {
		  int j = 0;
		  while(j < i) {
			  System.out.print(" ");  
			  j++;
		  }
		  
		  j = 0;
		  while(j < 5 - i) {
			  System.out.print("*");  
			  j++;
		  }
		  
		  System.out.println(); 
		  i++;
		}
		
		
		// # 4
		System.out.println("===== 4 =====");
		//  for (int i = 0; i < 5; i++) {
		//     // 공백 찍기
		//     for (int j = 0; j < 5 - i - 1; j++) {
		//        System.out.print(" ");
		//     }
		//     // 별 찍기
		//     for (int j = 0; j <= i*2; j++) {
		//        System.out.print("*");
		//     }
		//     System.out.println();
		//  }
		i = 0;
		while(i < 5) {
		  int j = 0;
		  while(j < 5 - i - 1) {
			  System.out.print(" ");  
			  j++;
		  }
		  
		  j = 0;
		  while(j <= i * 2) {
			  System.out.print("*");  
			  j++;
		  }
		  
		  System.out.println(); 
		  i++;
		}
		
		
		// # 5
		System.out.println("===== 5 =====");
		//  for (int i = 0; i < 5; i++) {
		//     // 공백 찍기
		//     for (int j = 0; j < i ; j++) {
		//        System.out.print(" ");
		//     }
		//     // 별 찍기
		//     for (int j = 0; j < 2*5- (i*2)- 1; j++) {
		//        System.out.print("*");
		//     }
		//     System.out.println();
		//  }
		i = 0;
		while(i < 5) {
		  int j = 0;
		  while(j < i) {
			  System.out.print(" ");  
			  j++;
		  }
		  
		  j = 0;
		  while(j < 2*5- (i*2)- 1) {
			  System.out.print("*");  
			  j++;
		  }
		  
		  System.out.println(); 
		  i++;
		}
		
	    
	}
}
