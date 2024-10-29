package ch4;

import java.util.Scanner;

//2024.10.29.Tue. 4교시(14:10~15:00)
public class ForDiamond {

	public static void main(String[] args) {
		
		// 줄수를 입력받아서 다이아몬드 별찍기
		//		%%%%*
		//		%%%***
		//		%%*****
		//		%*******
		//		*********
		//		%*******
		//		%%*****
		//		%%%***
		//		%%%%*	
		//		     *
		//		    ***
		//		   *****
		//		  *******
		//		 *********
		//		  *******
		//		   *****
		//		    ***
		//		     *
		Scanner scanner = new Scanner(System.in);

		System.out.print("줄수를 입력하세요(홀수로 입력): ");// 짝수인 경우 맨 마지막 줄 없음
		int y = scanner.nextInt();	// 줄수
		int space = y/2;			// 공백(여백)의 갯수 = 줄수 / 2
		int star = 1;				// 별의 갯수
		boolean flag = true;		// true: 피라미드, false: 역피라미드
		
		for(int i = 0; i < y; i++) {
			// 공백(여백) 찍기
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			// 별찍기
			for(int j = 0; j < star; j++) {
				System.out.print("*");
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
		
		
		// 연습문제) 아래와 같이 가운데 별을 제거한 테두리만 출력하세요.
		//     *
		//    * *
		//   *   *
		//  *     *
		// *       *
		//  *     *
		//   *   *
		//    * *
		//     *    
		space = y/2;			// 공백(여백)의 갯수 = 줄수 / 2
		star = 1;				// 별의 갯수
		flag = true;		// true: 피라미드, false: 역피라미드
		for(int i = 0; i < y; i++) {
			// 공백(여백) 찍기
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			// 별찍기
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