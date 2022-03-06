package userLogin;

import java.util.Scanner;
public class sinif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To The Password Change Program!");
		
		System.out.print("Enter Your Username:");
		String username=sc.nextLine();
		System.out.print("Enter Your Password:");
		String password=sc.nextLine();
		char select;
		String input;
		
		if(username.equals("kadir")&&password.equals("123")) {
			System.out.println("Login Successful!");
			System.out.print("Do you want to change your password(y/n)?");
			select=sc.next().charAt(0);
			if(select=='y') {
				System.out.print("Enter a new password:");
				input=sc.nextLine();
				input=sc.nextLine();
				if(input.equals(password)) {
					System.out.println("You have entered the same password!\tYou must enter a different password.");
					
				}
				else {
					password=input;
					System.out.println("Password has changed succesfully!");
				}
				
			}
			else if(select=='n') {
				System.out.println("System Exited");
			}
			else {
				System.out.println("Incorrect Select!");
			}
			
		}
		else if(username.equals("kadir")&&!password.equals("123")) {
			System.out.println("Incorrect Password!");
		}
		else if(!username.equals("kadir")&&password.equals("123")) {
			System.out.println("Incorrect Username!");
			
		}
		

	}

}
