package ch4;

import java.util.Scanner;

public class WhileExample1 {
	public static void main(String[] args) {
		
		// ...
		
		int i = 0;
		
		
		// ***** while문 *****
		
		// 무한 반복
		while(true) {
			System.out.println(i += 1000000);
			if(i % 2000000 == 0)
				continue;	// 다음 조건으로 이동
			
			// 오버플로 발생하면 음수가 되어 아래 조건문 실행하게 됨
			if(i < 0)
				break;		// 반복문 종료
		}
		
		
		// ***** do-while문 *****
		i = 0;
		Scanner scanner = new Scanner(System.in);
		
		// 무한반복, 0이면 종료
//		while( (i = scanner.nextInt()) != 0 ) {
//			System.out.println("i는 0이 아닙니다.");
//		}
		
		// 위 반복문을 do-while로 변환
		do {
			System.out.print("> ");
			i = scanner.nextInt();
			System.out.println("i가 0이어도 일단 한 번은 실행합니다.");
		} while( i != 0 );
		
		

	
	
	
	
	
	}
}
