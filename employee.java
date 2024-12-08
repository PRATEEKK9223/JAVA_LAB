package lab_3;

public class employee {
	int id;
	String name;
	double salary;
	
	employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void raiseSalary(double percentage)
	{
		salary+=(salary*percentage)/100;
	}
	
	public void display()
	{
		System.out.println("employee id is "+ id);
		System.out.println("employee name is "+ name);
		System.out.println("employee salary is "+ salary);
		
	}
	
	public static void main(String[] args) {
		
		employee obj=new employee(9223,"prateek",15000.00);
		System.out.println("employee details before salary highke");
		obj.display();
		obj.raiseSalary(100);
		System.out.println("employee details after salary highke");
		obj.display();
		
	}

}
