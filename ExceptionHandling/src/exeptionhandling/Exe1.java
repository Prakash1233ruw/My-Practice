package exeptionhandling;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		System.out.println("welocomr to my app");
		 Scanner sc=null;	
		try {
  sc=new Scanner(System.in);
  System.out.println("enter nominator");
  int num1=sc.nextInt();
  System.out.println("enter denominator");
  int num2=sc.nextInt();
 int res =num1/num2;
		
 System.out.println("the div is"+res);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("getMessage():"+e.getMessage());
			System.out.println("toString(): "+e.toString());
			System.out.println("give non zero input");
		}
		
		try {
 System.out.println("enter the size of an array");
	int size=sc.nextInt();
	int ar[]=new int[size];
	System.out.println("kindly enter element");
	int elem=sc.nextInt();
	System.out.println("enter position of array has to be inserted");
	int pos=sc.nextInt();
	ar[pos]=elem;
	System.out.println("data inserted successfully");
		}
		
		
		catch(NegativeArraySizeException e) {
			System.out.println("please be +ve");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("be in ur limits");
		}
		catch(Exception e) {
			System.out.println("invalid input");
		}
		
		
		System.out.println("thank you for using my app");
	}
	

}
