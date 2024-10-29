package ch2;

public class Variable1 {

	public static void main(String[] args) {
		// 변수란 하나의 값을 저장할 수 있는 메모리 번지 이름
		// 변수 선언은 [데이터 타입] [변수명];
		// int age;
		// age = 10;
		int age;
		age = 100;
		// 자동완성(단축키): sysout + ctrl + space
		System.out.println(age);
		System.out.println("입력된 나이는: " + age);
		
		// 실수 타입 데이터
		double height = 179.8;
		System.out.println("나의 키는: " + height);
		float weight = 103.4f;
		System.out.println("나의 몸무게는: " + weight);
		
		// 정수 타입 데이터
		byte a = 100;
		short b = -100;
		char c = 1000;
		char d = 'A';		// 0~065535 사이 값(유니코드)
		int e = -2147483648;	// 양수면 Error
		long f = 2147483648L;
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
		// 논리 타입 데이터
		int x = 10;
		boolean result = (x == 20);
		System.out.println("x == 20: " + result);
		result = (x != 20);
		System.out.println("x != 20: " + result);
		
		result = (x>20);
		System.out.println("x>20: " + result);
		
		result = (0<x && x<20);
		System.out.println("0<x && x<20: " + result);
		result = (x<0 || x>200);
		System.out.println("x<0 || x>200: " + result);
	}

}
