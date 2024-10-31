package ch4;

import java.util.Scanner;

/*
 * 반복문
 * - for
 */
public class ForDiamond {

	public static void main(String[] args) {	
		/*****************************
		 * Q. 줄수를 입력받아서 다이아몬드 별찍기

				     *
				    ***
				   *****
				  *******
				 *********
				  *******
				   *****
				    ***
				     *
		 *		     
		 */
		/*
		 * 힌트) 공백, 별, 단(줄)
		 * 		1. 줄 수는 홀수여야 완성됨
 		 * 		2. 줄 간 별의 개수는 +2 또는 -2
		 * 		3. 줄 간 공백의 개수는 +1, -1씩 차이 남
		 * 		4. 전체 줄 수의 반에 해당하는 위치까지 별이 +2(2씩 증가), 공백은 -1(1씩 감소)
		 * 		5. 전체 줄 수의 반 이상인 경우에는 별이 -2(2씩 증가), 공백은 +1(1씩 증가)
		 * 
		 */
		
		// 정답)
		// 1. 객체 생성
		Scanner scanner = new Scanner(System.in);

		// 2. 입력값 처리
		System.out.print("줄 수를 입력하세요(홀수로 입력): ");// 짝수이면 맨 마지막 줄 없음
		int y = scanner.nextInt();	// 줄 수
		
		// 입력값을 가지고 별 찍기
		int space = y/2;			// 공백(여백)의 개수 = 줄 수 / 2
		int star = 1;				// 별의 수
		boolean flag = true;		// true: 피라미드, false: 역피라미드
		
		// 다이아몬드 그리기를 위한 for 문
		for(int i = 0; i < y; i++) {
			// 공백(여백) 찍기
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			/*  
			 * star, space 증감 변화
			 * - 피라미드인 경우		: star += 2, space -= 1
			 * - 역피라미드인 경우	: star -= 2, space += 1
			 * 
			 * 
			 * 언제까지 피라미드로 출력하고, 언제 역피라미드로 변환할지 
			 */
			if(i == y/2) flag = false;
			
			if(flag) {
				space -= 1;
				star += 2; 
			} else {
				space += 1;
				star -= 2;
			}
		}
		
//		// 3. 객체 삭제(정리)
//		scanner.close();
		System.out.println();
			
		
		/*****************************
		 * 연습문제) 아래와 같이 가운데 별을 제거한 테두리만 출력하세요.
		     *
		    * *
		   *   *
		  *     *
		 *       *
		  *     *
		   *   *
		    * *
		     *  
		 
		 */
		// 정답)
		space = y/2;		// 공백(여백)의 갯수 = 줄수 / 2
		star = 1;			// 별의 갯수
		flag = true;		// true: 피라미드, false: 역피라미드
		
		for(int i = 0; i < y; i++) {
			// 공백(여백) 찍기
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int j = 0; j < star; j++) {
				// 정답: 여기에 조건 추가
				if(0 < j && j < star - 1)
					System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
			
			// star, space 증감 변화
			if(i == y/2) flag = false;
			if(flag) {
				space -= 1;
				star += 2; 
			} else {
				space += 1;
				star -= 2;
			}
		}
		
		scanner.close();
	}

}