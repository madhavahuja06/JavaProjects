package co.deloitte.payroll;

import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args)
	{
ConfirmedEmployee employee=new ConfirmedEmployee();
Accounts accounts=new Accounts();
accounts.processSalary(employee);

Intern employee1=new Intern();
Accounts accounts1=new Accounts();
accounts1.processSalary(employee1);




	Scanner sc = new Scanner(System.in);
	System.out.println("Type cahr type of employee");
	char e=sc.next().charAt(0);

HR hr=new HR();
Employee emp= hr.recruit(e);


accounts.processSalary(emp);
	
	}
	
}
