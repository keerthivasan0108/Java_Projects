
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	public Menu() {
		System.out.println();
		System.out.println("\tMenu List");
		System.out.println();
		System.out.println("==================================");
		System.out.println("\t1.Insurance Info");
		System.out.println("==================================");
		System.out.println();
		System.out.println("==================================");
		System.out.println("\t2.Insurance plans");
		System.out.println("==================================");
		System.out.println();
		System.out.println("==================================");
		System.out.println("\t3.Logout");
		System.out.println("==================================");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int n = sc.nextInt();
		switch(n) {
			case 1:
				System.out.println();
				System.out.println("Insurance details");
				Info o = new Info();
				break;
			case 2:
				System.out.println();
				System.out.println("Plan list");
				System.out.println();
				Plans plan = new Plans();
				break;
			case 3 :
				Logout obj = new Logout();
				break;
			default : 
				System.out.println();
				System.out.println("Invalid!");
				Menu menu = new Menu();
		}
	}
	
	
}


class PassCheck {
	private String user ="keerthivasan";
	private String password = "kkk";
	
	public PassCheck(String userName,String passWord) {
		if((userName.equals(user))&&(passWord.equals(password))) {
			System.out.println();
			System.out.println("Login Successfull! ");
			System.out.println("");
			Menu obj = new Menu();
			
		}
		else {
			System.out.println();
			System.out.println("Invalid Username/Password");
			System.out.println("Try Again");
			Signup obj = new Signup();
		}
	}
}

