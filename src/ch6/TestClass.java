package ch6;

import ch6.obj.Bread;
import ch6.obj.Person;

/*****************************
 * Q. 아래 문제를 읽고 클래스, 메서드를 만드세요.
 * 		(생성 위치: src/ch6/obj 패키지)
 * 
 * 1. Bread 클래스 생성
 * - 필드(멤버변수)	: 가격, 이름
 * - 기능(메서드)	: 이름과 가격을 출력하는 메서드 info()
 * 
 * 2. Person 클래스 생성
 * - 필드(멤버변수)	: 이름(name), 나이(age), 키(tall)
 * - 기능(메서드)	: 이름, 나이, 키를 출력하는 메서드 info()
 *  
 * 3. 클래스 생성 테스트
 * - main() 함수가 포함된 TestClass 클래스를 위 클래스 객체 생성을 테스트합니다.
 * - 테스트는 객체 생성 후 필드에 값을 대입하여 해당 클래스의 메서드가 호출되는지 확인합니다.
 * 
 */
public class TestClass {

	public static void main(String[] args) {
		// 객체(Instance) 생성
		Bread bread = new Bread();
		Person person = new Person();
		
		// 필드값 대입
		bread.name = "모닝빵";
		bread.price = 5000;
		person.name = "홍길동";
		person.age = 20;
		person.tall = 183.2;
		
		// 메서드 호출
		bread.info();
		person.info();
		/* 
		 * 이름: 모닝빵, 가격: 5000원
		 * 이름: 홍길동, 나이: 20세, 키: 183.2cm
		 */
		
				
		// 예제) 클래스를 사용하지 않은 경우
		System.out.println("*** 클래스를 사용하지 않은 경우: ");
		info();
		System.out.println();
		info2();
		
		/*
		 * 연습)
		 *  
		 * - cake, hong, kim은 각각 생성된 객체를 의미하는 인스턴스(instance)라고 한다.
		 * - Person 타입 객체가 hong, kim 독립적으로 활동하는 것을 알 수 있다.
		 */
		Bread cake = new Bread();
		cake.name = "케이크";
		cake.price = 35000;
		cake.info();
		
		// 홍길동 19 180
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 19;
		hong.tall = 180;
		hong.info();
		
		// 김수한 3000 178.5
		Person kim = new Person();
		kim.name = "김수한";
		kim.age = 3000;
		kim.tall = 178.5;
		kim.info();
	}
	
	static int price = 1500;
	static String name = "피자빵";
	static void info() {
		System.out.println(price + "원");
		System.out.println(name);
	}
	
	static int price2 = 10500;
	static String name2 = "딸기케익";
	static void info2() {
		System.out.println(price2 + "원");
		System.out.println(name2);
	}
	
}
