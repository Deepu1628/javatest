package javatest;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 1234;
		int balance = 1000;
		int addamount = 0;
		int takeamount = 0;
		

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your pin number");
			int password = scanner.nextInt();

			if (password == pin) {
				System.out.println("Enter your name ");
			 String name = scanner.next();
				System.out.println("welcome to atm:" + name);
				while (true) {
					System.out.println("press 1 to check the balance ");
					System.out.println("press 2 to add amount ");
					System.out.println("press 3 to take amount ");

					System.out.println("press 4  to take the receipt");
					System.out.println("press 5 to exit ");
					int out = scanner.nextInt();
					switch (out) {
					case 1:
						System.out.println("your current balance is :" + balance);
						break;
					case 2:
						System.out.println(" how much do you need to add");
						addamount = scanner.nextInt();
						System.out.println("you have successfully credited");
						balance = addamount + balance;
						break;
					case 3:
						System.out.println("how much do you need to withdraw");
						takeamount = scanner.nextInt();
						if (takeamount > balance) {
							System.out.println("your balance is low");
						} else {
							System.out.println("you have successfully amt withdrawn");
							balance = balance - takeamount;
						}
						break;
					case 4:
						System.out.println("pick your recipt");
						System.out.println("avilable balance is " + balance);
						System.out.println("amount added " + takeamount);
						System.out.println("amount deposited" + addamount);
						System.out.println("thanks for comming ");
						break;
					default:
						System.out.println("press the number below 5");
						break;
					}
					if (out == 5) {
						System.out.println("thanks for comming visit again");
					}
				}

			}
			else {
				System.out.println("wrong password ");
				
			}
		}
	}
}