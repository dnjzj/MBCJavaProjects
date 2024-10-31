package ch4;

/*
 * 조건문
 * - switch-case
 * - case가 여러 개인 경우 처리
 */
public class SwitchExample2 {

	public static void main(String[] args) {
		char grade = 'b';
		
		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("A등급 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("B등급 회원입니다.");
				break;
			default:
				System.out.println("일반 회원입니다.");
				break;
		}
		
		/*
		 * Switch Expression(break 없어도 되며, JAVA 12 이상부터 지원)?
		 * 값을 넘겨주는 것을 "Expression"이라고 함.
		 */
		System.out.println("======== SwitchExpression ========");
		
		switch (grade) {
			case 'A','a' -> {
				System.out.println("A등급 회원입니다.");
			}
			case 'B','b' -> {
				System.out.println("B등급 회원입니다.");
			}
			default -> 
				System.out.println("일반 회원입니다.");
		}
		
	}

}
