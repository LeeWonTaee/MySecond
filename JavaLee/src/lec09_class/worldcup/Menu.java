package lec09_class.worldcup;

public class Menu {
	// 캡슐화
	// 1. 필드 변수들의 접근 제어자를 private 으로 만든다.	
	private String name;
	private boolean isSelect = false;

	// 클래스 만들때 
	// [단축키 Alt + Shift + S] 또는 [마우스 우클릭 - Source]
	// 2. Generate Constructor using fields
	public Menu(String name, boolean isSelect) {
		super();
		this.name = name;
		this.isSelect = isSelect;
	}
	
	public Menu(String name) {
		this.name = name;
	}
	// 3. 기본 생성자 추가
	public Menu(){
		
	}
	// 4. Generate toString
	@Override
	public String toString() {
		return "Menu [name=" + name + ", isSelect=" + isSelect + "]";
	}
	// 5. Generate Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSelect() {
		return isSelect;
	}
	public void setSelect(boolean isSelect) {
		this.isSelect = isSelect;
	}
	
}
