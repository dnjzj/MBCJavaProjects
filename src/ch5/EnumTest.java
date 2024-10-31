package ch5;

import java.util.Calendar;

/*
 * 열거형, 열거 타입(Enum)
 */
public class EnumTest {

	// 열거형 Week을 통해서 특성 확인
	public static void main(String[] args) {
		
		Week day;				// 열거형, 열거 타입
		day = Week.FRIDAY;		// 열거형 상수값만 대입 가능
		System.out.println(day);// FRIDAY
		
		day = Week.WEDNSDAY;
//		day = "Test";			// Error: 열거 상수 목록 이외의 값 대입 불가
		System.out.println(day);// WEDNSDAY
		
		
		/*****************************
		 * 예제) 정의한 열거형 불러오기
		 */
		Week todayWeek = null;
		
		// Calendar 객체 얻기
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);// 오늘의 요일을 나타내는 상수값(정수 1~7)
		System.out.println(week);	// 4
		
		// 열거 상수로 변환해서 변수에 대입
		switch (week) {
			case 1: todayWeek = Week.SUNDAY; break;
			case 2: todayWeek = Week.MONDAY; break;
			case 3: todayWeek = Week.TUESDAY; break;
			case 4: todayWeek = Week.WEDNSDAY; break;
			case 5: todayWeek = Week.THURSDAY; break;
			case 6: todayWeek = Week.FRIDAY; break;
			case 7: todayWeek = Week.SATURDAY; break;
		}

		// 열거 타입 변수 활용
		if(todayWeek == Week.SUNDAY) {
			System.out.println("일요일에 축구를 합니다.");
		} else if(todayWeek == Week.WEDNSDAY) {
			System.out.println("자바를 죽도록 열심히 공부합니다.");	// ㅋㅋㅋ
		} else {
			System.out.println("죽을 만큼 공부합니다.");			// ...ㅎ
		}
		
	}

}
