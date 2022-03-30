package submit.submit_1011;

import java.util.regex.Pattern;

public class Submit04 {
	public static void main(String[] args) {
		String result = "";
		String regex = "[a-zA-Z]*";
		String ex = "a3b2c4d1a2h4";
		for(int i = 0; i < ex.length(); i++) {
			String subStr = ex.substring(i, i+1);
			boolean res = Pattern.matches(regex, subStr);
			if(res == true) {
				String intStr = ex.substring(i+1, i+2);
				int strToInt = Integer.parseInt(intStr);
				for(int j = 0; j < strToInt; j++) {
					result += subStr;
				}
			}
		}
		System.out.println(result);
	}
}
