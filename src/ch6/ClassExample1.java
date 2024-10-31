package ch6;

/*
 * 객체지향 프로그래밍? OOP(Object Oriened Programming)
 * 
 * 
 * 객체(Object)? 세상에 존재하는 모든 것들(사물, 추상적인 것들)
 * - 세상에 존재하는 모든 것들은 변수(필드, 속성)과 메서드(기능, 동작)으로 표현 가능
 * - 메서드는 객체의 행동 및 기능을 나타내고, 변수는 상태(설정값)를 나타냄.
 * 
 * 
 * 클래스(Class)?
 * - 객체를 프로그래밍 언어로 표현한 것
 * - 객체의 설계도
 * - 클래스를 통해 만드는 하나의 실제 객체를 인스턴스라고 함.
 * - 클래스의 메서드는 객체의 행동, 클래스의 변수는 객체의 현재 상태를 나타냄.
 * - 클래스는 참조형 변수 타입이다.
 * 
 * 
 * JAVA 클래스 규칙
 * - public class는 파일 이름과 같아야 함.
 * - public class는 한 파일 내에서 한 개만 존재할 수 있음
 * - 같은 패키지 내에서 같은 이름의 클래스를 사용할 수 없음
 * - 다른 패키지에 import 할 때는 public class에만 접근할 수 있음
 * - public class는 파일의 이름이기 때문에 그 소스 파일 전체의 주제를 알 수 있는 이름을 짓는 것이 좋음
 * - 클래스의 이름은 대문자로 시작하는 것이 좋음
 * 
 * 
 */
public class ClassExample1 {
	
	public static void main(String[] args) {
		
		// 학생 인스턴스 생성
		Student s1 = new Student();
		Student s2 = new Student();
		
		// 클래스 타입 배열 사용
		Student[] kids = new Student[100];// 참조 타입 배열 초기값? null
		
		for (int i = 0; i < kids.length; i++) {
			kids[i] = new Student();				// 객체 생성 후 배열에 저장
			kids[i].name = "default name" + (i+1);	// 생성 객체 속성값 정의
			System.out.println((i+1) + "번째 학생 이름: " + kids[i].name);
		}
		
		// Student[] 타입에서 값을 꺼내기, 변경하기
		Student s50 = kids[50];
		s50.name = "51번 째 학생 이름입니다.";
		System.out.println(s50.name);	// default name51
		
		for(int i = 0; i < kids.length; i++) {
			System.out.println((i+1) + "번째 학생 이름: " + kids[i].name);
		}
		
		s1.korean = 100;
		s1.math = 70;
		s1.english = 90;
		s1.history = 95;
		s1.name = "홍길동";
		
		System.out.println(s1);				// ch6.Student@65e579dc (@뒤는 해시값) <- 주소값이 나오면 참조 타입
		System.out.println(s1.korean);		// 100
		System.out.println(s1.history);		// 95
		System.out.println(s1.getTotal());	// 355
		System.out.println(s1.getName());
		
	}

}

// 학생
class Student {
	// 필드 멤법변수 속성
	public String name;
	public int age;
	// 과목
	public int korean;
	public int english;
	public int programming;
	public int history;
	public int math;

	/*
	 * 메서드 타입
	 * 1. 매개값이 있고, 반환값이 있는 경우
	 * 2. 매개값이 있고, 반환값이 없는 경우 
	 * 3. 매개값이 없고, 반환값이 있는 경우
	 * 4. 매개값이 없고, 반환값이 없는 경우
	 * 
	 * 
	 * 메서드 구조
	 * [접근제한자][반환타입][메서드명] (매개변수들...) {
	 * 		// 메서드 동작 코드
	 * }
	 * 
	 */
	
	// 메서드
	public String getName() {
		return name;
	}
	
	// 과목별 점수 총점
	public int getTotal() {
		return (korean + english + programming + history + math);
	}
	

}
