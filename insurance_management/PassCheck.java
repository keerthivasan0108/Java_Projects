package insurance;

public class PassCheck {
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
