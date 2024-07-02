package chap04;

public class Member {
	private String name, id, pw;
	private int age;
	
	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
}
