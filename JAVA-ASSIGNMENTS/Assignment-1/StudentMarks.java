package com.CoreJavaAssignments1;

import java.util.Scanner;

class Student
{
	String name;
	float total, percentage;
	int marks[]=new int[3];
	Scanner sc=new Scanner(System.in);
	Student()
	{
	
	System.out.println("Enter name of student");
	name=sc.next();
	getMarks();
	}
	public void getMarks()
	{
		System.out.println("Enter marks out of 100:");
		for(int i = 0; i < 3; i++)
        {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        percentage = total / 3;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
	}
}
public class StudentMarks {
	
	public static void main(String[] args) {
        Student s[] = new Student[5];
        int marksSum = 0;
        int subjectCode = 1; //suppose we want to get an average of 2nd subject
        for (int i = 0; i < 5; i++) {

            s[i] = new Student();
            marksSum += s[i].marks[subjectCode];
        }
        System.out.println("Average marks scored in "+subjectCode+" subject are "+(double)marksSum/s.length);

    }

}

