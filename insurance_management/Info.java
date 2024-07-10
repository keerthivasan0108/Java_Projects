package insurance;

import java.util.Scanner;

public class Info {
	Scanner sc = new Scanner(System.in);
	public  Info() {
		
		System.out.println();
		System.out.println("Details : ");
		System.out.println();
		System.out.println(" ----------------------------------------------- ");
		System.out.println
				("| Life Insurance can be defined as a contract   |"
                +"\n| between an insurance policy holder and an     |"
				+"\n| insurance company, where the insurerence      |"
				+"\n| promises to pay a sum of money in exchange    |"
				+"\n| for a premium, upon the death of an insured   |"
				+"\n| person or after a set period. Here, at Our    |"
				+"\n| Prudential Life Insurance, you pay premiums   |"
				+"\n| for a specific term and in return,we provide  |"
				+"\n| you with a Life Cover. This Life Cover        |"
				+"\n| secures ones’ future by paying a lump sum     |"
				+"\n| amount inyour loved case of an unfortunate    |"
				+"\n| event.In some policies,you are paid an amount |"
				+"\n| called Maturity Benefit at the end of         |"
				+"\n| the policy term.                              |");
		System.out.println(" ----------------------------------------------- ");
		System.out.println();
		System.out.println("Enter Anything to Back : ");
		String back = sc.next();
		Menu menu = new Menu();
	}
}
