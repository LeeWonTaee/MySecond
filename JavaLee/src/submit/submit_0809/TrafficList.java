package submit.submit_0809;

import java.util.ArrayList;


public class TrafficList {
	private String name;						// 교통수단
	private ArrayList<Traffic> trafficList; // 교통수단 리스트
	
	public TrafficList(String name, ArrayList<Traffic> trafficList) {
		super();
		this.name = name;
		this.trafficList = trafficList;
	}
	
	public TrafficList(String name) {
		this.name= name;
		this.trafficList = new ArrayList<Traffic>();
	}

	@Override
	public String toString() {
		return "TrafficList [name=" + name + ", trafficList=" + trafficList + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Traffic> getTrafficList() {
		return trafficList;
	}

	public void setTrafficList(ArrayList<Traffic> trafficList) {
		this.trafficList = trafficList;
	}
	
	public void addTraffic(Traffic traffic) {
		trafficList.add(traffic);
	}
	public void showTrafficList() {
		for(Traffic tra : trafficList) {
			System.out.println(tra);
		}
	}
	public int indexOfTraffic(String name) {
		for(int i = 0; i < trafficList.size(); i++) {
			if(trafficList.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public Traffic getTraffic(int idx) {
		return trafficList.get(idx);
	}
	
}
