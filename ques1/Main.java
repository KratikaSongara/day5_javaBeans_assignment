package com.ques1;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails() {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id:");
		int id = sc.nextInt();
		employee.setEmployeeId(id);
		
		System.out.print("Enter Name:");
		String name = sc.next();
		employee.setEmployeeName(name);
		
		System.out.print("Enter Salary:");
		double Salary = sc.nextDouble();
		employee.setSalary(Salary);
		
		return employee;
	}
	
	public static int getPFPercentage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PF percentage");
		int pf = sc.nextInt();
		return pf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=getEmployeeDetails();
		
		int pf_percent=getPFPercentage();
		e.calculateNetSalary(pf_percent);
		
		System.out.println("Id : "+e.getEmployeeId());
		System.out.println("Name : "+e.getEmployeeName());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Net Salary : "+e.getNetSalary());
	}

}
