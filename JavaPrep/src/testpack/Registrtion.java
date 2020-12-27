package testpack;



public class Registrtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 st=new student1();
		st.setname("Jacob");
		st.setstudentid(10);

		System.out.println(st);
	}



}
class student1 {

	private int studentid;
	private String name;
	private float marks;
	private char resident;
	private int year;

	public void setstudentid(int sid) {
		this.studentid=sid;

	}
	public int getstudentid() {

		return studentid;

	}

	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;

	}
	public String toString() {
		return "Student name: " + getname()+ "ID: "+ getstudentid();
	}
}


