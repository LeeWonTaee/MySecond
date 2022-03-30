package submit.submit_0107;

public class Submit08 {
	public static void main(String[] args) {
		String example = "aaabbcdddaeefffffgg";
		int count = 0;
		int cnt = 0;
		for(int i = 0; i < example.length()-1; i++) {
			if(example.charAt(i) == example.charAt(i+1)) {
				count++;
			}else {
				cnt++;
			}
		}		
		System.out.println(count);
		System.out.println(cnt);
		
		String res = "";
		String result = "";
		cnt = 0;
		for(int i = 0; i < example.length()-1; i++) {
			if(example.charAt(i) != example.charAt(i+1)) {
				res += example.charAt(i); //res = res + example.charAt(i)
//				System.out.print(res.indexOf(example.charAt(i)));

			}
//			else {
//				result += example.charAt(i);
//			}
		}
		
		System.out.println();
		System.out.println(res + result);
		System.out.println(result);
		
		

		
//		int count = 0;
//		for(int i = 0; i < winArr.length; i++) {
//			for(int j = 0; j < myArr.length; j++) {
//				if(winArr[i] == myArr[j]) {
//					count++;
//				}
//			}
//		}
	}
}
