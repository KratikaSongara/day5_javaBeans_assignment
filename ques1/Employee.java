package com.ques1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		int int_salary = (int)salary;
		int deduct = (int_salary*pfpercentage)/100;
		int net_salary = int_salary - deduct;
		setNetSalary((double)net_salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
