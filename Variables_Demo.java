class Employee{
	int Empid;
	char Grade;
	String Dept;
	double Sal;
	float Work_Hours;
	static String Company;
	static String Address;
	
	
	
}
class Company{
	int Cid;
	char Level;
    double Revenue;
	long No_of_employees;
	static String Address;
	
	
	
	
}

public class Variables_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp = new Employee();
		Emp.Empid = 1066;
		Emp.Grade = 'P';
		Emp.Dept = "HR";
		Emp.Sal = 80000;
		Emp.Work_Hours = 40;
		Employee.Company = "Neo";
		Employee.Address = "Chicago";
		System.out.println("Employee Details:");
		System.out.println("Employee_Id ="  +Emp.Empid);
		System.out.println("Employee_ Grade="  +Emp.Grade);
		System.out.println("Employee__Department ="  +Emp.Dept);
		System.out.println("Employee__Salary ="  +Emp.Sal);
		System.out.println("Employee__Work_Hours ="  +Emp.Work_Hours);
		System.out.println("Employee__Dept ="  +Emp.Dept);
		System.out.println("Employee__Company ="  +Employee.Company);
		System.out.println("Employee__Address ="  +Employee.Address);
		
		Company Cmp = new Company();
	
		Cmp.Cid = 2096;
		Cmp.Level = 5;
		Cmp.Revenue = 5000000;
		Cmp.No_of_employees = 87000;
		Company.Address = "Frisco";
		System.out.println("Company Details:");
		System.out.println("Company_Id ="  +Cmp.Cid);
		System.out.println("Company_Level ="  +Cmp.Level);
		System.out.println("Company_Revenue ="  +Cmp.Revenue);
		System.out.println("No of employees in the company ="  +Cmp.No_of_employees);
		System.out.println("Company_Address ="  +Company.Address);
		
		
		

	}

}
