package lec09_myclass.grade;

public class Grade {
	private int mid, fin, rep, att;
	private String name;
	private long hakbun;
	
	public Grade(int mid, int fin, int rep, int att, String name, long hakbun) {
		super();
		this.mid = mid;
		this.fin = fin;
		this.rep = rep;
		this.att = att;
		this.name = name;
		this.hakbun = hakbun;
	}
	
	public Grade() {
		
	}

	@Override
	public String toString() {
		return "이름 : " + name + "학번 : " + hakbun 
				+ "\n중간고사 점수 : " + mid + "\n기말고사 점수 : " + fin 
				+ "\n과제 점수 : " + rep + "\n출석 점수 : " + att;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public int getRep() {
		return rep;
	}

	public void setRep(int rep) {
		this.rep = rep;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getHakbun() {
		return hakbun;
	}

	public void setHakbun(long hakbun) {
		this.hakbun = hakbun;
	}
	
	
}
