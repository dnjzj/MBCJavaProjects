package ch5;

import java.util.Arrays;

/*
 * String 클래스
 * - String은 "데이터 표현"할 때 사용하므로 중요하다.
 */
public class StringExample1 {
	
	public static void main(String[] args) {
		// String 문자열 객체
		String nameString;		// 선언
		nameString = "홍길동";	// 대입
		
		/*
		 * [메모리 영역]
		 * 1. Stack 영역(변수, 메서드 등)
		 * - name	: 0x0010
		 * - hobby	: 0x0020
		 * 
		 * 2. Heap 영역(객체 등)
		 * - 0x0010: String 객체(실제값="홍길동")
		 * - 0x0020: String 객체(실제값="여행")
		 * 
		 * ...
		 * 
		 */
		
		String hobbyString = "여행";	// 선언 및 대입		
		String hobbyString2 = "여행";	// 이 경우는 리터럴인 "여행"을 상수값으로 인식함
		// 문자열 리터럴이 동일한 경우에는 String 객체를 공유하게 된다
		// test = hobby; 대입 후 test == hobby2와 비교했을 때 '동등 비교(==)'가 가능합니다.
		String hobbyString3 = new String("여행");	// 이 경우는 Heap 영역 안에 별도의 String 객체를 생성. 따라서 이렇게 선언한 뒤 동등비교(==)하면 false가 출력
		String testString = hobbyString;
		
		// 문자열끼리는 '동등 비교(==)'가 가능하다. 단, 위와 같이 리터럴을 지정한 경우는... (주석 참조)
		System.out.println(testString == hobbyString);		// true
		System.out.println(testString == hobbyString2);		// true	// 만약, hobbyString2 = new String("여행"); 이면 false가 출력
		System.out.println(testString == hobbyString3);		// false
		// 문자열에서 'equals()'는 문자열 그 자체(실제값)를 비교하기 때문에 '동등 비교(==)'가 가능하다.
		System.out.println(testString.equals(hobbyString3));// true	// 객체(주소)가 아닌 실제값을 비교하고 싶다면 '동등 비교(==)'가 아닌 equals()를 사용함
		
		
		// 1. 문자열 추출 charAt(index)
		String str = "자바는 즐거워!";
		// Index:	  0 12345 67
		System.out.println("2번 인덱스값을 추출: " + str.charAt(2));	// '는'
		
		
		// 2. 문자열 길이 length(): 문자열에서 문자의 개수를 알고 싶은 경우 length() 사용
		System.out.println("문자열 길이: " + str.length());
		
		
		// 3. indexOf(문자열): 원하는 문자가 시작되는 인덱스 값을 반환
		String str2 = "Hello, world! 123456789";
		// Index:	   01234567 -> w는 7번에 위치함
		int worldIndex = str2.indexOf("world");
		System.out.println("world는 str2의 몇 번째 인덱스 위치인가? " + worldIndex); // 7
		
		
		// 4. substring(시작 인덱스, 끝 인덱스): 문자열을 원하는 만큼 자른다.
		// 		substring(시작 인덱스): 해당 인덱스 이전 글자는 자른다.
		System.out.println(str2.substring(7));	// world! 123456789
		System.out.println(str2.substring(8));	// orld! 123456789	
		System.out.println(str2.substring(9));	// rld! 123456789
		System.out.println(str2.substring(10));	// ld! 123456789 
//		substring(시작 인덱스, 끝 인덱스): 해당 인덱스 범위에 있는 글자를 잘라준다.
		System.out.println(str2.substring(worldIndex, 12));	// world // 7~11번까지 출력
		
		
		// 5. split(문자 또는 문자열): 문자열을 원하는 기준(문자 또는 문자열)으로 자른다.
		str = "apple/banana/kiwi/lemon/oragne";
		String[] fruitStrings = str.split("/");
		System.out.println(Arrays.toString(fruitStrings));	// [apple, banana, kiwi, lemon, oragne]
		
		
		// 6. contains(문자): 해당 문자가 문자열에 포함되어 있는지 여부를 체크
		if(str.contains("apple")) {
			System.out.println("과일에 사과가 있습니다.");			// 여기 출력
		} else {
			System.out.println("과일에 사과가 없습니다.");
		}
		
		
		// 7. equals(): 문자열이 같은지 여부를 체크(위에 예시 참고)
		
		
		// 8. replace(바꾸기 위해서 찾는 문자열, 변경할 문자열): 원하는 문자를 치환(교체)
		str = "abcde@naver.com";
		// naver -> microsoft
		System.out.println(str.replace("naver", "microsoft"));	// abcde@microsoft.com
	
		
		// 9. lastIndexOf(문자 또는 문자열): 해당 문자를 뒤에서부터 찾아서 위치를 반환(위치값을 역순으로 찾는다)
		str = "abcd dcba";
		//     012345678   : Index
		// 'd' 인덱스 찾기
		System.out.println( "indexOf('d'): " + str.indexOf('d') );					// 3
		System.out.println( "lastIndexOf('d'): " + str.lastIndexOf('d') );			// 5
		// 두 번째 'd'를 indexOf(문자, fromIndex)를 활용해 확인하는 방법
		System.out.println( "indexOf('d')의 두 번째 위치: " + str.indexOf('d', 4) );	// 5(4번 인덱스부터 문자를 검색)
		System.out.println( "indexOf('d')의 두 번째 위치: " + str.indexOf('d', 6) );	// -1(검색한 내용이 없는 경우 -1 출력)
		
		// 예제) indexOf()를 사용하여 모든 내용을 검색하는 방법
		str = "apple/kiwi/apple/lemon";
		int appleIndex = 0;
		appleIndex = str.indexOf("apple");
		System.out.println("첫 번째 apple의 인덱스: " + appleIndex);	// 0
		appleIndex = str.indexOf("apple", appleIndex+1);
		System.out.println("두 번째 apple의 인덱스: " + appleIndex);	// 11
		appleIndex = str.indexOf("apple", appleIndex+1);
		System.out.println("세 번째 apple의 인덱스: " + appleIndex);	// -1
		
		
		// 10. toUpperCase(), toLowerCase(): 영문자를 대문자 혹은 소문자로 변환
		//		toUpperCase(): 소문자 -> 대문자 ...
		String emailString = "abcde@NaVeR.Com";
		str = "naver.com";
		System.out.println(emailString.contains(str));	// false// 대문자, 소문자를 다르게 인식
		emailString = emailString.toLowerCase();
		System.out.println(emailString);				// abcde@naver.com
		System.out.println(emailString.contains(str));	// true
		
		
		// 11. trim(): 문자열 바깥쪽 공백 제거
		String id1 = "        abc   123 ";
		String id2 = "  abc   123		";
		System.out.println("before1: " + id1);				//         abc   123 
		System.out.println("before2: " + id2);				//   abc   123		
		System.out.println("equals()? " + id1.equals(id2));	// false
		
		id1 = id1.trim();
		id2 = id2.trim();
		System.out.println("after1: " + id1);				// abc   123
		System.out.println("after2: " + id2);				// abc   123
		System.out.println("equals()? " + id1.equals(id2));	// true
		
		
		// 12. format(서식 문자열, 인자1, 인자2, ...): 서식 문자열을 이용하여 문자열을 만들어 반환;
		str = String.format("%d:%d:%d", 17, 17, 30);
		System.out.println(str);	// 17:17:30
		
		
		// 13. endsWith(문자열): 지정한 문자로 끝나는지 검사
		str = "오늘할일.html";
		if(str.endsWith(".txt")) {
			System.out.println("확장자가 올바른 텍스트 파일입니다.");
		} else if(str.endsWith(".html") || str.endsWith(".htm")) {
			System.out.println("확장자가 웹 페이지 파일입니다.");		// 여기 출력
		} else {
			System.out.println("텍스트 또는 웹 페이지 파일이 아닙니다.");
		}
		
		
	}
	

}
