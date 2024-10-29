package quiz;

import java.util.Scanner;

// 2024.10.28.Mon. 13:15~13:30
public class Coffeeprice {
	// [퀴즈]
	// 파일 위치: src/quiz/Coffeeprice.java
	// [문제]
	// 한 커피 매장에서 커피의 가격이 2000원 입니다. 이 매장에서 10개 이상 커피를 구매하면 초과하는 커피의 개당 가격은 1500원을 받습니다.
	// 커피의 개수를 입력 받고, 총 가격이 얼마인지 계산해서 출력하는 프로그램을 만들어 보세요. 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("커피 개수를 입력해주세요: ");
		int n = scan.nextInt();	// quantity
		int result = n * 2000;	// price
		
		if (n > 10) {
			result -= (n - 10) * 500;
		}
		// 총 가격(10잔 이상인 경우, 초과하는 커피는 개당 1500원으로 계산)
		System.out.println("총 가격: " + result + "원");
		
		scan.close();
	}
}
