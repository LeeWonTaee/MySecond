package test_lee;

public class TestEtc1 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i <= 10; i++){
			int pin = (int) (Math.floor(Math.random() * 3) + 8); // 8 <= pin <= 10 
		    
		    if(pin == 10){
		        cnt += 30;
		        System.out.println("[ X ]");
		    } else if(pin == 9){
		        pin = (int) Math.floor(Math.random() * 2);
		        if(pin == 1){
		            cnt += 19;
		            System.out.println("[ 9 / ]");
		        } else {
		            cnt += 9;
		            System.out.println("[ 9 - ]");
		        }      
		    } else if(pin == 8){
		        pin = (int) Math.floor(Math.random() * 3);
		        if(pin == 2){
		            cnt += 18;
		            System.out.println("[ 8 / ]");
		        } else if(pin == 1){
		            cnt += 9;
		            System.out.println("[ 8 1 ]");
		        } else {
		            cnt += 8;
		            System.out.println("[ 8 - ]");
		        }   
		    }
		    System.out.println(i + "프레임 누적" + cnt + "점");
		}
		System.out.println("총점수는 " + cnt + "입니다.");
	}
}
