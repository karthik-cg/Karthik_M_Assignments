package com.CoreJavaAssignments1;

public class SimpleAndCompound {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int p=s.nextInt();
	int n=s.nextInt();
	int r=s.nextInt();
	int simple=(p*n*r)/100;
	double compound=p*(Math.pow((1+r/100),n));
	System.out.println("Simple intrest is "+simple);
	System.out.println("Compound intrest is "+compound);

     }
}
