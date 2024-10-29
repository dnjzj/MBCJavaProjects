package ch2;

// 2024.10.23.
public class TypeCasting1 {
	
	public static void main(String[] args) {
		// 2.7.
		
		int b = 10;
		
		// 2.8. 타입 캐스팅
		byte c = (byte) b;
		System.out.println(c);
		
		int i = 10000000;
		byte c1 = (byte) i;
		System.out.println(c1);
		
		float f1 = 1.234F;
		int i1 = (int) f1;
		System.out.println(i1);
		
		// 연산식에서 타입 자동 변환: 연산은 같은 타입으로 변환 후 계산한다
		byte x = 10;
		byte y = 20;
		int result1 = x + y;// int 형태로 불러와 계산되기 때문에 int가 아닌 결과를 원한다면 아래와 같이 캐스팅이 필요하다.
		byte result2 = (byte) (x + y);
	}
}
