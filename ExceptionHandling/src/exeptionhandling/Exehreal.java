package exeptionhandling;

import java.util.Scanner;
class LegendsException extends Exception{
	public LegendsException(String m) {
		super(m);
	}
}
class ATM{
	private int accNum=1234;
	private int password=1111;
	int acNo;
	int pwd;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter acc number");
		acNo=sc.nextInt();
		System.out.println("enter your atm password");
		pwd=sc.nextInt();
		
	}
	public void verify() throws LegendsException {
		
		if(accNum==acNo &&  password==pwd) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter thre amount");
			int amt=sc.nextInt();
			System.out.println("here is ur "+amt+"rs in cash");
		}
		else {
			
			 throw new LegendsException("wrong credentials are u sure is this is ur own card");
			
		}
	}
}

class Bank{
	public void initiate() {
	ATM a=new ATM();
	try {
	a.input();
	a.verify();
	}
	catch(LegendsException e) {
		System.out.println(e.getMessage());
		try {
			a.input();
			a.verify();
			}
		catch(LegendsException v) {
			System.out.println(e.getMessage());
			try {
				a.input();
				a.verify();
				}
			catch(LegendsException b) {
				System.out.println(e.getMessage());
				System.out.println("3 chances are completed u r card is blocked ");
			}
		}
		
	}
	
	
	
	}

}
	
public class Exehreal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new Bank();
b.initiate();
	}

}
