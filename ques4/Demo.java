package com.ques4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Student objects need to be created");
		int num = sc.nextInt();
		
		Student[] student =new  Student[num];
		
		for(int i=0; i<student.length; i++)
		{
			System.out.println("Fill details of student " +(i+1));
			student[i]=new Student();
			
			System.out.print("roll: ");
			int roll = sc.nextInt();
			student[i].setRoll(roll);
			
			System.out.print("name: ");
			String name = sc.next();
			student[i].setName(name);
			
			System.out.print("address: ");
			String address = sc.next();
			student[i].setAddress(address);
			
			System.out.print("marks: ");
			int marks = sc.nextInt();
			student[i].setMarks(marks);
			
			System.out.println("--------------------");
			
		}
		
		int sum = 0;
		int average;
		for(int j=0; j<student.length; j++)
		{
			System.out.println("Student "+(j+1));
			System.out.println("roll number :"+student[j].getRoll());
			System.out.println("name :"+student[j].getName());
			System.out.println("address :"+student[j].getAddress());
			System.out.println("marks :"+student[j].getMarks());
			System.out.println("--------------------");
			
			sum = sum + student[j].getMarks();
		}
		
		average = (sum)/(student.length);
		System.out.println("Average of all Student marks : "+average);
	}

}
