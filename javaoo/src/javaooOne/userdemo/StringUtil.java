package javaooOne.userdemo;

public class StringUtil {
	public static boolean isCorrectUserName(String userNameString) {
		boolean isCorrect = true;
		if(userNameString == null) return false;
		if(userNameString.length() >25) return false;
		char[] unValidChar = {' ','"','?','<','>','='};
		for(char ch : unValidChar) {
			if(userNameString.contains(Character.toString(ch))) {
				isCorrect = false;
				break;
			}
		}
		return isCorrect;
	}
	
	public static String validatePasswordString(String passwordString) {
		String powerString = "";//密码强度
		if(passwordString == null) return powerString;
		if(passwordString.length()<6 || passwordString.length()>18) return powerString;
//		String[] correctPartStrings = {"_","@","#","$","!"};
		String partString ="_@#$!";
		for (int i = 0; i < passwordString.length(); i++) {
			if(!Character.isLetterOrDigit(passwordString.charAt(i))) {
				if(!partString.contains(Character.toString(passwordString.charAt(i)))) {
					return powerString;
				}
			}
		}
		//判断密码强度
		if(isDigit(passwordString)||isLetter(passwordString)) {
			powerString = "弱";
		}else if(isDigitAndLetter(passwordString)) {
			powerString = "中";
		}else if(isContainsSymble(passwordString)) {
			powerString = "强";
		}
		return powerString;
	}
//	private static boolean isDigitAndLetterAndSymble(String value) {
//		for (int j = 0; j < value.length(); j++) {
//			if(!(Character.isDigit(value.charAt(i)) || 
//					Character.isLetter(value.charAt(i))||
//					"_@#$!".contains(Character.toString(value.charAt(i))))) {
//				return false;
//			}
//		}
//		return true;
//	}
	private static boolean isDigitAndLetter(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetterOrDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	private static boolean isDigit(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	private static boolean isLetter(String value) {
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetter(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	private static boolean isContainsSymble(String value) {
		String partString ="_@#$!";
		for (int i = 0; i < value.length(); i++) {
			if(partString.contains(Character.toString(value.charAt(i)))) {
				return true;
			}
		}
		return false;
	}
}
