package ch6.obj;

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
public class Person {
	public String name;
	public int age;
	public double tall;
	
	/**
	 * Person의 이름, 나이, 키를 출력합니다.
	 */
	public void info() {
		System.out.printf("이름: %s, 나이: %d세, 키: %.1fcm\n", name, age, tall);
	}
}
