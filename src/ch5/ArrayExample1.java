package ch5;

import java.util.Arrays;

/*
 * 배열? 같은 타입의 변수를 한 번에 여러 개 선언하는 방법(연속된 데이터값)
 * - 배열 선언, 배열 값 사용, 배열의 길이, 배열과 반복문
 * - 얕은 복사(swallow copy)와 깊은 복사(deep copy)
 * 
 * 배열 선언 방법
 * 1. 타입명[] 변수명 = new 타입명[배열의 길이];
 * 2. 타입명[] 변수명 { 데이터들 };	// 데이터는 ","로 부분
 * 3. 타입명[] 변수명 = new 타입명[] { 데이터들 };
 * 
 */ 
public class ArrayExample1 {
	
	public static void main(String[] args) {	
		int[] numbers = new int[10];	// 정수 10개를 가진 배열(각 항목은 0으로 초기화됨)
		boolean[] win = { true, false, true, false, false, true };
		String[] welcomeStrings = new String[] {"오늘 날씨는 괜찮네요", "오세요! 학원으로", "환영합니다."};
		
		/*
		 * 배열 값 사용하기
		 * - 변수명[인덱스]로 데이터 접근 (*인덱스는 위치값)
		 * 
		 */
		System.out.println(welcomeStrings[0]);
		System.out.println(welcomeStrings[1]);
		System.out.println(welcomeStrings[2]);
		
		/*
		 * 배열의 길이 알아오기
		 * - 배열명.length 사용
		 * 
		 */
		System.out.println("win[] 길이\t: " + win.length);
		System.out.println("welcome[] 길이\t: " + welcomeStrings.length);
		
		/*
		 * 배열과 반복문
		 */
		for(int i = 0; i < win.length; i++) {
			if(win[i]) {
				System.out.println(i+1 + "번째 전적: 승리");
			} else {
				System.out.println(i+1 + "번째 전적: 패배");
			}
		}
		
		/*
		 * 배열의 내용 출력
		 * Arrays.toString() 사용
		 */
//		System.out.println(win);			// [Z@574caa3f
//		System.out.println(numbers);		// [I@64cee07
//		System.out.println(welcomeStrings);	// [Ljava.lang.String;@1761e840
		
		System.out.println(Arrays.toString(win));			// [true, false, true, false, false, true]
		System.out.println(Arrays.toString(numbers));		// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(welcomeStrings));// [오늘 날씨는 괜찮네요, 오세요! 학원으로, 환영합니다.]

		/*
		 * 배열은 선언 시 초기값을 쓰지 않으면, 자동적으로 기본값으로 초기화를 합니다
		 * 
		 * - 초기화 기본값
		 * - 정수: 0
		 * - 실수: 0.0
		 * - boolean: false
		 * - 참조형(reference): null
		 */
		String[] byeMessage = new String[10];
		System.out.println(Arrays.toString(byeMessage));	// [null, null, null, null, null, null, null, null, null, null]

		/*
		 * 배열의 얕은 복사(sallow copy)와 깊은 복사(deep copy)
		 * 
		 */
		String[] byeMessage2 = new String[] { "good bye", "bye bye", "see you" };
		
		/*
		 * 얕은 복사(swallow copy) - 참조 객체 주소를 복사
		 */
		byeMessage = byeMessage2;
		
		System.out.println(byeMessage);		// [Ljava.lang.String;@574caa3f
		System.out.println(byeMessage2);	// [Ljava.lang.String;@574caa3f
		
		byeMessage2[1] = "bye bye bye bye ya~~~";
		System.out.println(Arrays.toString(byeMessage));	// [good bye, bye bye bye bye ya~~~, see you]
		System.out.println(Arrays.toString(byeMessage2));	// [good bye, bye bye bye bye ya~~~, see you]

		/*
		 * 깊은 복사(deep copy) - 배열의 주소 아닌 값을 복사
		 * 
		 * System.arraycopy()
		 * System.arraycopy(src, srcPos, dest, destPos, length);
		 * - src	: 원본 배열의 이름
		 * - srcPos	: 원본 배열에 복사를 시작할 위치
		 * - dest	: 복사, 붙여넣기할 배열의 이름
		 * - destPos: 붙여넣기할 배열의 시작 위치 지정
		 * - length	: 복사할 갯수
		 * 
		 */
		System.arraycopy(byeMessage2, 1, byeMessage, 5, 2);
		System.out.println(Arrays.toString(byeMessage));	// [good bye, bye bye bye bye ya~~~, see you]
		System.out.println(Arrays.toString(byeMessage2));	// [good bye, bye bye bye bye ya~~~, see you]
	
		
		byeMessage[0] = "Good bye!";
		System.out.println(Arrays.toString(byeMessage));
		System.out.println(Arrays.toString(byeMessage2));
	}
}
