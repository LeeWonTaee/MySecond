package submit.submit_0809;

import java.util.ArrayList;

public class submit01 {
	public static void main(String[] args) {
		// 1. 정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20 사이의 랜덤 숫자를 10개 담으시오.
		ArrayList<Integer> testList = new ArrayList<Integer>();
	
		for(int i = 0; i < 10; i++) {
			testList.add((int)(Math.random()*11) + 10);
		}	
		// 2. 해당 정수형 리스트를 한 줄로 출력하시오.
		System.out.println(testList);
		
		// 3. 해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오.
		ArrayList<Integer> testList2 = new ArrayList<Integer>();
		for(int i = 0; i < testList.size(); i++) {
			if(testList2.indexOf(testList.get(i)) == -1) {
				testList2.add(testList.get(i));
			}
		}
		System.out.println(testList2);
		
		// 4. 중복을 제거한 정수형 리스트를 오름차순으로 정렬하여 출력하시오.
		for(int i = 0; i < testList2.size(); i++) {
			for(int j = 0; j < testList2.size() -1 -i; j++) {
				if(testList2.get(j) > testList2.get(j+1)) {
					int temp = testList2.get(j);
					testList2.set(j, testList2.get(j+1));
					testList2.set(j+1, temp);
				}
			}
		}
		System.out.println(testList2);
		
		// 5. 중복을 제거한 정수형 리스트를 내림차순으로 정렬하여 출력하시오.
		for(int i = 0; i < testList2.size(); i++) {
			for(int j = 0; j < testList2.size() -1 -i; j++) {
				if(testList2.get(j) < testList2.get(j+1)) {
					int temp = testList2.get(j);
					testList2.set(j, testList2.get(j+1));
					testList2.set(j+1, temp);
				}
			}
		}
		System.out.println(testList2);
		
		
		
		
		
		
		
		
	}
}
