public class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}

	void display(){

		System.out.println("Roll No.: "+rollNo);
		System.out.println("Student Name: "+name);

	}
}