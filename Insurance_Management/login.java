import java.util.*;
public class login {
	Scanner sc = new Scanner(System.in);
	
	public login() {
		System.out.println();
		System.out.print("UserName : ");	
		String userName = sc.next();
		System.out.println();
		System.out.print("Password : ");
		String passWord = sc.next();
		PassCheck obj = new PassCheck(userName,passWord);
		
	}
	
	
	
}
