package ch2;

public class Variable2 {

	public static void main(String[] args) {
		// 문자열
		String var1 = "A";
		String var2 = "홍길동";

		System.out.println(var1);
		System.out.println(var2);
		
		// 이스케이프 문자: 특수한 기능을 하거나 특수한 기능을 하는 문자를 일문 문자로 변환
		// '\'가 붙어있는 문자
		System.out.println("\"");
		System.out.println("'");
		System.out.println('\'');
		System.out.println("\\");
		
		// \u0000 16진수 유니코드 문자
		System.out.println("\u0065\u0064\u0063\u0062\u0061");
		
		// A = 65(10진수) = 41(16진수)
		// 아스키코드(10진수)표: 65
		System.out.println("\u0041\u0064\u0063\u0062\u0061");
		// 탭 간격: \t
		// 줄 바꿈: \n
		System.out.println("\\n사용 예시: 나는\n오늘\n아침을\n먹었다.");
		// 캐리지 리턴: \r
		System.out.println("\\r사용 예시: 나는\r오늘\r아침을\r먹었다.");
	}

}
