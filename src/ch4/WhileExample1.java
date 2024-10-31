package ch4;

import java.util.Scanner;

/*
 * 반복문
 * - while
 * - do-while
 * 
 * while문?
 * - for문 보다 더 자유도가 높은 반복문
 * - for문은 초기화값, 조건(condition), 증가값 기술하는 형식을 사용하고
 * - while은 문법상 조건(condition)만 사용한다.
 * 
 *  
 * while(condition) {
 * 		조건식이 참인 경우 실행할 코드(반복 실행할 코드)
 * }
 * 
 * 
 * do-while?
 * - while 반복을 하는데 먼저 한번 실행하고 조건을 보는 반복문
 * - 잘 사용하지 않는다.
 * 
 */
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
		
		scanner.close();
	
	}
}
