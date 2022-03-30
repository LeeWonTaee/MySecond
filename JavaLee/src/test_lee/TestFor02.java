package test_lee;

public class TestFor02 {
	public static void main(String[] args) {
		int cnt = 0;
        for(int i = 1; i < 51; i++){
            int time = (int) (Math.floor(Math.random() * 46) + 5);
            if(time >= 5 && time <= 15){;
            		System.out.println("[0] "+ i + "번째 손님 (소요시간 : " + time + "분)\n");
                cnt += 1;
                System.out.println("==> 현재 누적 손님은 " + cnt + "명 입니다. \n");
            }else{
            		System.out.println("[ ] "+ i + "번째 손님 (소요시간 : " + time + "분)\n");
            }
        }
        System.out.println("* 총 탑승 손님은 " + cnt + "명 입니다.");
	}

}
