package insurance;
import java.util.*;
public class Signup {
	public Signup(){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t1. SignIn");
		System.out.println("\t2. New Signup");
		System.out.println("");
		System.out.println("Enter your choice : ");
		int a = sc.nextInt();
		if(a==1) {
			login obj = new login(); 
		}
		else if(a==2) {
			System.out.println("New Signup");
			System.out.println("Enter a Username : ");
			String a1 = sc.next();
			System.out.println("Enter Password : ");
			String b = sc.next();
			System.out.println("Re-Enter Passwod : ");
			String c = sc.next();
			if(b.equals(c)) {
				System.out.println("Login Sucessfull!");
				Menu menu = new Menu();
			}
			else {
				System.out.println("Password Mismatch!\nTry Again");
				Signup obj = new Signup();
			}
		}
	}
}
