package by.bsu.webxml.entity;



public class Student {// extends  DomParser  {
	public class Address {

	}
	private Integer rollno;
	private String lastname;
	private String firstname;
	private String nickname;
	private String marks;
	public Student(String lastname, String firstname, String nickname, String marks, Integer rollno) {
		this.rollno = rollno;
		this.lastname = lastname;
		this.firstname = firstname;
		this.nickname = nickname;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", lastname=" + lastname + ", firstname=" + firstname + ", nickname="
				+ nickname + ", marks=" + marks + "]";
	}
}

