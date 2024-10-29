package ch4;

public class SwitchExample {

	public static void main(String[] args) {
		
		// Math.random()			: 0.0 ~ 1.0 미만의 실수인 난수 생성
		// (Math.random() * 6)		: 0.0 ~ 6.0 미만의 실수 생성
		// (int)(Math.random() * 6)	: 0 ~ 5 미만의 정수 생성
		int n = (int) (Math.random() * 6) + 1;// 1 ~ 6 사이의 임의의 정수
		System.out.println(n);
		
		switch (n) {
		case 1:	// n이 1일 때
			System.out.println("1번");
			break;
		case 2:	// n이 2일 때
			System.out.println("2번");
			break;
		case 3:	// n이 3일 때
			System.out.println("3번");
			break;		
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:	// 위에 있는 case에 속하지 않는 경우
			System.out.println("6번");
		}
		
		

	}

}
