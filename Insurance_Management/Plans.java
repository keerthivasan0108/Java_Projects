import java.util.*;
public class Plans {
	Scanner sc = new Scanner(System.in);
	public Plans(){
		System.out.println("1. Term Insurance Plans");
		System.out.println("2. ULIPs – Unit Linked Insurance Plans");
		System.out.println("3. Endowment Insurance Plans");
		System.out.println("4. Money Back Insurance Plans");
		System.out.println("5. Whole Life Insurance Plans");
		System.out.println("6. Child Insurance Plans");
		System.out.println("7. Retirement Insurance Plans");
		System.out.print("\nEnter Your Choice : ");
		int n = sc.nextInt();
		if(n == 1) {
			Term obj =  new Term();
						
			obj.gain(obj.in());
			
		}
		else if(n==2) {
			ULIP obj = new ULIP();
			obj.gain(obj.in());

		}
		else if(n==3) {
			Endowment obj = new Endowment();
			obj.gain(obj.in());

		}
		else if(n==4) {
			Moneyback obj = new Moneyback();
			obj.gain(obj.in());

		}
		else if(n==5) {
			Wholelife obj = new Wholelife();
			obj.gain(obj.in());

		}
		else if(n==6) {
			Child obj = new Child();
			obj.gain(obj.in());

		}
		else if(n==7) {
			Retirement obj = new Retirement();
			obj.gain(obj.in());

		}
		else {
			System.out.println("Invalid!");
		}
		// System.out.println("Enter Anything to Back : ");
		// String back = sc.next();
		// Menu menu = new Menu();
		
	}
}
interface plan{
	public void gain(int a[]);
}
class Input{
	Scanner sc = new Scanner(System.in);
		static String name;
		static String gender;
		static String DOB;
		static int age,plan,payment;
		
	public int[]  in() {
		String name="",gender="",DOB="";
		int age=0,plan=0,payment=0;
		
		
		System.out.println("Enter name    : ");
		 name = sc.next();
		System.out.println("Gender        : ");
		 gender = sc.next();
		System.out.println("Date of Birth : ");
		 DOB = sc.next();
		System.out.println("Age           : ");
		 age  = sc.nextInt();
		System.out.println("Years of plan : ");
		 plan = sc.nextInt();
		 System.out.println("Payment for month : ");
		 payment = sc.nextInt();
		 int arr[] = new int[3];
		 this.name = name;
		 this.gender = gender;
		 this.DOB = DOB;
		 this.age = age;
		 this.plan = plan;
		 this.payment = payment;
		 
		 arr[0] = age;
		 arr[1] = plan;
		 arr[2] = payment;
		 
		 print();
		 return arr;
	}
	public static void print() {
		System.out.println("Name   : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("DOB    : "+DOB);
		System.out.println("Age    : "+age);
	
	}
}
class Term extends Input implements plan{
	
	public Term() {
		System.out.println("Detail About Term Insurance");
		System.out.println();
		System.out.println
		("| Term insurance protects your family’s   |"
		+"\n| financial future if something were      |"
		+"\n| to happen to you. Designed as a simple  |"
		+"\n| and affordable way to give financial    |"
		+"\n| cover, a term plan is a vital part      |"
		+"\n| of financial planning for the primary   |"
		+"\n| wage earner in a family.                |");
		
		
		System.out.println("\nApply Options : ");
		System.out.println("\t1. 10 years plan");
		System.out.println("\t2. 20 years plan");
	}
	
	public void gain(int a[]) {
		double p  = a[1]/100;
		if(a[1] == 10) {
			
			System.out.println("Application for "+a[0]+" years Life Insurance Plan sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
			
		}
		else if(a[1] == 20) {
			System.out.println("\nApplication for "+a[0]+" years sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
	
	
}
class ULIP extends Input implements plan{
	public ULIP() {
		System.out.println("Detail About ULIPs Insurance");
		System.out.println();
		System.out.println
		(" | A unit linked insurance plan (ULIP)    |"
		+"\n | is a combination of insurance and      |"
		+"\n | investment. A ULIP provides life       |"
		+"\n | cover that offers financial protection |"
		+"\n | for your loved ones. In addition to    |"
		+"\n | this, it also gives you the potential  |"
		+"\n | to create wealth through market-linked |"
		+"\n | returns from systematic investments.   |");
		
		System.out.println("\nApply Options : ");
		System.out.println("\t1. 20 years plan");
		System.out.println("\t2. 30 years plan");
	}
	public void gain(int a[]) {
		double p  = a[1]/100;
		if(a[1] == 10) {
			
			System.out.println("Application for "+a[0]+" years Life Insurance Plan sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
			
		}
		else if(a[1] == 20) {
			System.out.println("\nApplication for "+a[0]+" years sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
}
class Endowment extends Input implements plan{
	public Endowment() {
		System.out.println("Detail About Endowment Insurance");
		System.out.println();
		System.out.println
		(" | Endowment plans are ideal for people   |"
		+ "\n | who want guaranteed returns along      |"
		+ "\n | with the protection of life insurance. |"
		+ "\n | An endowment plan is a life insurance  |"
		+ "\n | policy that provides life coverage     |"
		+ "\n | along with an opportunity to save      |"
		+ "\n | regularly. This enables you to receive |"
		+ "\n | a lump sum amount on the maturity of   |"
		+ "\n | the policy.                            |");
	}
	public void gain(int a[]) {
		double p  = a[1]/100;
		if(a[1] == 10) {
			
			System.out.println("Application for "+a[0]+" years Life Insurance Plan sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
			
		}
		else if(a[1] == 20) {
			System.out.println("\nApplication for "+a[0]+" years sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
}
class Moneyback extends Input implements plan{
	public Moneyback() {
		System.out.println("Detail About Money Back Insurance");
		System.out.println();
		System.out.println
		(" | Money back plan is an endowment plan    |"
		+ "\n | with the benefit of increased liquidity |"
		+ "\n | with systematic payouts. Money back     |"
		+ "\n | plans are designed to help you meet     |"
		+ "\n | your short-term financial goals. The    |"
		+ "\n | money back feature can add to your      |"
		+ "\n | monthly or yearly income.               |");
	}
	public void gain(int a[]) {
		double p  = a[1]/100;
		if(a[1] == 10) {
			
			System.out.println("Application for "+a[0]+" years Life Insurance Plan sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
			
		}
		else if(a[1] == 20) {
			System.out.println("\nApplication for "+a[0]+" years sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
}
class Wholelife extends Input implements plan{
	public Wholelife() {
		System.out.println("Detail About Whole Life Insurance");
		System.out.println();
		System.out.println
		(" | A whole life insurance plan is        |"
		+ "\n | a life insurance policy that          |"
		+ "\n | gives you life coverage for 99 years. |"
		+ "\n | Unlike other policies that have a     |"
		+ "\n | relatively shorter term of 10-30      |"
		+ "\n | years,the long coverage period of such| "
		+ "\n | plans ensures protection for your     |"
		+ "\n | family for an extended period of time.|");
	}
	public void gain(int a[]) {
		double p  = a[1]/100;
		if(a[1] == 10) {
			
			System.out.println("Application for "+a[0]+" years Life Insurance Plan sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
			
		}
		else if(a[1] == 20) {
			System.out.println("\nApplication for "+a[0]+" years sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
}
class Child extends Input implements plan{
	public Child() {
		System.out.println("Detail About Child Insurance");
		System.out.println();
		System.out.println
		(" | Children deserve the best, and a child  |"
		+ "\n | insurance plan helps to build a corpus   |"
		+ "\n | for your child’s future. A child         |"
		+ "\n | plan is one of the most vital financial  |"
		+ "\n | planning tools for parents.              |");
	}
	public void gain(int a[]) {
		double p  = a[1]/100;
		if(a[1] == 10) {
			
			System.out.println("Application for "+a[0]+" years Life Insurance Plan sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
			
		}
		else if(a[1] == 20) {
			System.out.println("\nApplication for "+a[0]+ " years sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
}
class Retirement extends Input implements plan{
	public Retirement() {
		System.out.println("Detail About Retirement Insurance");
		System.out.println();
		System.out.println
		(" | Retirement plans are designed to   |"
		+ "\n | help you build a sizeable corpus  |"
		+ "\n | for your post-retirement days.    |"
		+ "\n | They help you gain financial      |"
		+ "\n | independence in your non-working  |"
		+ "\n | years.                            |");
	}
	public void gain(int a[]) {
		double p  = a[1]/100;
		if(a[1] == 10) {
			
			System.out.println("Application for "+a[0]+" years Life Insurance Plan sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your"+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
			
		}
		else if(a[1] == 20) {
			System.out.println("\nApplication for "+a[0]+ "years sucessfull ");
			System.out.println("Your Total Investment for "+a[1]+" years is "+((a[2]*12*a[1])));			
			System.out.println("In your "+(a[0]+a[1])+" age you will get "+((a[2]*12*a[1])+((a[2]*12*a[1])*p)));
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
}