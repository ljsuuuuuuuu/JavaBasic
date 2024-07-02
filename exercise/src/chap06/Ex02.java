package chap06;

class Person {
	private int age;
	private String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}

class Student extends Person{
	private int studentId;

	public Student(int age, String name, int studentId) {
		super(age, name);
		this.studentId = studentId;
	}	
	
	public int getStudentId() {
		return studentId;
	}
	
	public void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d, 학번 : %d]\n", super.getName(), super.getAge(), studentId);
	}
}

class ForeignStudent extends Student {
	private String country;
	
	public ForeignStudent(int age, String name, int studentId, String country) {
		super(age, name, studentId);
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void show() {
		System.out.printf("사람[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", super.getName(), super.getAge(), super.getStudentId(), country);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person p[] = {new Person(22, "길동이"), new Student(23, "황진이", 100), new ForeignStudent(30, "Amy", 2000, "U.S.A")};
		
		for(Person p1 : p) {
			p1.show();
		}
	}
}
