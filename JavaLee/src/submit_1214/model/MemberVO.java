package submit_1214.model;

public class MemberVO {
	private String memId;
	private String memPw;
	
	public MemberVO(String memId, String memPw) {
		super();
		this.memId = memId;
		this.memPw = memPw;
	}
	
	public MemberVO() {
		
	}
	
	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPw=" + memPw + "]";
	}
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	
	
}
