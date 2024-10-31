package ch4;

/*
 * 조건문
 * - switch-case
 * - SwitchValueExample(Java 12 이전 문법)
 * - yield(Java 12 이후 문법, Java 13부터 사용 가능)
 */
public class SwitchExample3 {

	public static void main(String[] args) {		
		// SwitchValueExample
		// Java 12 이전 문법
		String gradeString = "B";
		int score1 = 0;	// 등급에 따른 점수 저장 변수
		
		switch (gradeString) {
			case "A": 
				score1 = 100;
				break;
			case "B": 
				score1 = 100 - 20;
				break;
			default:
				score1 = 60;
		}
		
		System.out.println("score1 : " + score1);
		
		// Java 12 이후 문법
		int score2 = switch (gradeString) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				// Java 13부터 사용 가능
				yield result;
			}
			default -> 60;
		};
		
		System.out.println("score2 : " + score2);
		
	}

}
