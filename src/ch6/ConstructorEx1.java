package ch6;

/*
 * 생성자(Constructor)?
 * - 클래스 이름과 같은 이름을 지닌 메서드
 * - new 키워드를 사용하여 클래스의 인스턴스를 생성할 때 호출된다.
 * - 클래스에 생성자를 정의하지 않으면 기본 생성자를 호출한다.
 * - 기본 생성자는 "클래스명()"인 생성자를 말한다.
 * - 다른 생성자가 정의되어 있다면 정의된 생성자를 반드시 사용해야 한다.
 * 
 * 
 * 생성자는 인스턴스를 만드는 값을 주는 역할을 한다.
 * 
 * 
 * public class? 파일명과 같은 클래스, public class, main
 * 
 */
public class ConstructorEx1 {// 파일명과 같은 클래스, public class, main
	
	// 클래스의 기본 구조 만들기 연습
	public static void main(String[] args) {
		// Car 인스턴스(Instance) 생성
		System.out.println("*** 기본 생성자 테스트 ***");
		Car car1 = new Car();
		System.out.println(car1.brand);
		System.out.println(car1.wheel);
		System.out.println(car1.name);
				
		// 필드 초기화 생성자를 통해 Instance 생성
		System.out.println("*** 필드 초기화 생성자 테스트 ***");
		Car car2 = new Car("미쉐린", 6, "BMW", "티코");
		System.out.println(car2.brand);
		System.out.println(car2.wheel);
		System.out.println(car2.name);
		
		// 생성자 오버로딩 테스트
		System.out.println("*** 생성자 오버로딩 테스트 ***");
		Car car3 = new Car("niro", "KIA", "금호");
		System.out.println(car3.numOfWheel);
		System.out.println(car3.wheel);
		System.out.println(car3.name);
	}
}


class Car {
	// 필드
	String wheel;	// 타이어 이름
	int numOfWheel;	// 타이어 개수
	String brand;	// 브랜드
	String name;
	
	/*
	 * 생성자는 새로운 인스턴스를 생성할 때 가장 먼저 호출되기 때문에 값을 초기화하는 용도로 많이 사용한다.
	 */
	// 기본 생성자(매개값을 받지 않는 Instance 생성자)
	Car() {
		// 인스턴스 생성 시 동작 구현
		wheel = "금호";
		numOfWheel = 4;
		brand = "KIA";
		name = "K5";
	}
	
	// 필드(멤버변수) 초기화 생성자
	Car(String wheel, int numOfWheel, String brand, String name) {
		/*
		 * this? 현재 생성된 인스턴스를 의미하는 키워드
		 * 
		 * this는 언제 사용할까??
		 * - 클래스의 변수(참조형 변수)를 지칭하기 위해 this를 사용한다.
		 */
		this.wheel = wheel;
		this.numOfWheel = numOfWheel;
		this.brand = brand;
		this.name = name;
		
	}
	
	/*
	 * 생성자 오버로딩
	 * 
	 * 오버로딩?
	 * - 동일한 이름의 생성자 혹은 메서드의 매개변수를 달리하여 생성자 혹은 메서드를 여러 개 선언하는 것을 말한다.
	 * 
	 * 왜 사용할까?
	 * - 동일한 이름의 구동을 다양한 매개변수를 통해서 구현하기 위해서
	 * 
	 * 
	 * 오버로딩은 매개변수의 타입, 개수, 선언된 순서가 같은 경우에 같은 생성자로 구분한다.
	 * 즉 타입, 개수, 순서가 달라야 다른 오버로딩으로 인식하게 된다.
	 * 
	 */
	Car(String name, String brand) {
		// this()는 현재 인스턴스의 생성자를 가리킨다.
		this("금호", 4, brand, name);
	}
	
	Car(String name, String brand, String wheel) {
		this.name = name;
		this.brand = brand;
		this.wheel = wheel;
				
	}	
	
	// 함수(메서드)
	void go() {
		System.out.println(name + " 앞으로 이동합니다.");
	}
	
	void stop() {
		System.out.println(name + "가 정지합니다.");
	}
}
