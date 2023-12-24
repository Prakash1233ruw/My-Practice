package exeptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe0 {
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
System.out.println(res);
	
	System.out.println("thank u");
	System.out.println("enter the size");	
int size=sc.nextInt();

int ar[]=new int[size];// if above exception occurs then  control goes to catch block and executes below catch block
System.out.println("enter the element");
int ele=sc.nextInt();
System.out.println("enter the position to be inserted");
int pos=sc.nextInt();
ar[pos]=ele;
}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("peace");
	}
	catch(NegativeArraySizeException e) {
		System.out.println("sleeep ");
	}
catch(ArithmeticException e) {
	System.out.println("forget ");
}

	
	
	catch(Exception e) {
		System.out.println("invalid");
	}
	System.out.println("thank u");	

}
}


