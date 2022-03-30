package submit.submit_0809;

import java.util.ArrayList;


public class submit02 {
	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		// 2.
		productList.add(new Product("냉장고", 2000000));
		productList.add(new Product("TV", 1000000));
		productList.add(new Product("에어컨", 800000));
		productList.add(new Product("컴퓨터", 1300000));
		productList.add(new Product("선풍기", 100000));
		

		for(int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		
		System.out.println("\n================================\n");
		// 3.
		for(int i = 0; i < productList.size(); i++) {
			for(int j = 0; j < productList.size()-1 -i; j++) {
				if(productList.get(j).getPrice() > productList.get(j+1).getPrice()) {
					Product temp = productList.get(j);
					productList.set(j, productList.get(j+1));
					productList.set(j+1, temp);
				}
			}	
		}
		for(Product price : productList) {
			System.out.println(price);
		}
		// 4.
		for(int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
	
	}
}
