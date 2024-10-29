package ch2;

public class StringConversion {
	
	public static void main(String[] args) {
		String str = "10";
		byte value = Byte.parseByte(str);
		System.out.println(value);
		System.out.println(value + 100);
		System.out.println(str + 100);
		
		short valueShort = Short.parseShort(str);
//		short valueShort2 = Short.parseShort("600000");// short 값을 벗어나는 값이면 Error(컴파일 에러): NumberFormatException: value out of range. (숫자형식예외)
		int valueInt = Integer.parseInt(str);
		long valueLong = Long.parseLong(str);
		
		String pistr = "3.141";
		float valueFloat = Float.parseFloat(pistr);
		System.out.println(valueShort);
		Double valueDouble = Double.parseDouble(pistr);
		System.out.println(valueDouble);
		
		String strBoolean = "true";
		boolean valueBoolean = Boolean.parseBoolean(strBoolean);
		System.out.println(valueBoolean);
		
		// 기본 자료형을 문자열로 변환: String.valueOf()
		String valueConversion = String.valueOf(valueBoolean);//valueFloat);
		System.out.println(valueConversion);
	}

}
