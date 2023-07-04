package Oops;

class Task 
{
	private String name;
	private int phoneno;
	private String jobroll;
	private int income;
	private String location;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getJobroll() {
		return jobroll;
	}

	public void setJobroll(String jobroll) {
		this.jobroll = jobroll;
	}

	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

class Employess
{
	
	public static void main(String[] args)
	{
		Task t=new Task();
		
		t.setName("Rutik Ghodekar");
		t.setPhoneno(81082);
		t.setJobroll("Developer");
		t.setIncome(55000);
		t.setLocation("Airoli");
		
		System.out.println("Name is:"+ t.getName());
		System.out.println("Phine NO:"+ t.getPhoneno());
		System.out.println("Job Roll:"+ t.getJobroll());
		System.out.println("Income is:"+ t.getIncome());
		System.out.println("Location :"+ t.getLocation());
		
		
	}
		// TODO Auto-generated method stub

	}

}
