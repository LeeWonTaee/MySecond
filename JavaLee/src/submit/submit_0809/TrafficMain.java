package submit.submit_0809;

import java.util.Scanner;

public class TrafficMain {
	public static void main(String[] args) {
		TrafficList bus = new TrafficList("버스");
		bus.addTraffic(new Traffic("101번", (int)(Math.random() * 40) + 15 ));
		bus.addTraffic(new Traffic("102번", (int)(Math.random() * 40) + 15 ));
		bus.addTraffic(new Traffic("103번", (int)(Math.random() * 40) + 15 ));
		
		TrafficList taxi = new TrafficList("택시");
		taxi.addTraffic(new Traffic("카카오", (int)(Math.random() * 30) + 5));
		taxi.addTraffic(new Traffic("카카오블루", (int)(Math.random() * 30) + 5));
		taxi.addTraffic(new Traffic("T머니", (int)(Math.random() * 30) + 5));
		
		TrafficList subway = new TrafficList("지하철");
		subway.addTraffic(new Traffic("1호선", (int)(Math.random() * 35) + 10));
		subway.addTraffic(new Traffic("2호선", (int)(Math.random() * 35) + 10));
		subway.addTraffic(new Traffic("3호선", (int)(Math.random() * 35) + 10));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("교통 수단을 선택해주세요.");
			System.out.println("1. 버스 | 2. 택시 | 3. 지하철 | 4. 걸어간다.");
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.println("버스 정류장에 도착했습니다. 무슨 버스를 타시겠습니까?");
				bus.showTrafficList();
				
				System.out.println("버스를 선택해주세요.");
				String inputText = sc.nextLine();
				
				int idx = bus.indexOfTraffic(inputText);
				if(idx != -1) {
					Traffic traffic = bus.getTraffic(idx);
					System.out.println(traffic.getName() + "버스를 탑승하셨습니다.");
					if(traffic.getMinute() > 30) {
						System.out.println("지각입니다.");
					}else {
						System.out.println((40 - traffic.getMinute()) + "분 일찍 도착하셨습니다.");
					}
				}
				break;
			}else if(select == 2) {
				System.out.println("택시를 호출합니다 어떤 택시를 호출하시겠습니까?");
				taxi.showTrafficList();
				
				System.out.println("택시를 선택해주세요.");
				String inputText = sc.nextLine();
				
				int idx = taxi.indexOfTraffic(inputText);
				if(idx != -1) {
					Traffic traffic = taxi.getTraffic(idx);
					System.out.println(traffic.getName() + "택시를 탑승하셨습니다.");
					if(traffic.getMinute() > 30) {
						System.out.println("지각입니다.");
					}else {
						System.out.println((40 - traffic.getMinute()) + "분 일찍 도착하셨습니다.");
					}
				}
				break;
			}else if(select == 3) {
				System.out.println("지하철역에 도착하셨습니다. 몇호선에 타시겠습니까?");
				subway.showTrafficList();
				
				System.out.println("호선을 선택해주세요.");
				String inputText = sc.nextLine();
				
				int idx = subway.indexOfTraffic(inputText);
				if(idx != -1) {
					Traffic traffic = subway.getTraffic(idx);
					System.out.println(traffic.getName() + "을 탑승하셨습니다.");
					if(traffic.getMinute() > 30) {
						System.out.println("지각입니다.");
					}else {
						System.out.println((40 - traffic.getMinute()) + "분 일찍 도착하셨습니다.");
					}
				}
				break;
			}else if(select == 4) {
				System.out.println("걸어갑니다. \n지각입니다.");
				break;
			}
			
			sc.close();
			
		}
	}
}
