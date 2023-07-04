package Oops;

class Students 
{
	private String name; 
	private int rollno;
	private int age;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
	
class mainstudent
{
	public static void main(String[]args)
	{
		Students r=new Students();
		
		r.setName("Rutik");
		r.setRollno(07);
		r.setAge(21);
		r.setAddress("Mulund");
		
		System.out.println("Name is:"+ r.getName());
		System.out.println("Roll No:"+ r.getRollno());
		System.out.println("Age is :"+ r.getAge());
		System.out.println("Address:"+ r.getAddress());
	}
}
		 