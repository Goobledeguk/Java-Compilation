public class Employee{
	private  String name;
	private int age, id;
	int salary = 100;

	public void Monthly(){
	System.out.println("Salary: "+salary);
	}

	public void StName(String name){
	this.name = name;
	}

	public void StAge(int age){
	this.age = age;
	}

	public void StId(int id){
	this.id = id;
	}

	public String Name(){
	System.out.println("Employee : "+name);
	return name;
	}

	public int Age(){
	System.out.println("Age : "+age);
	return age;
	}

	public int Id(){
		System.out.println("Id : "+id);
		return id;
	}



}