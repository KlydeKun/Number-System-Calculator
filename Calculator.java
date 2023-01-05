import java.util.*;

class Calculator {

	public void menu1() {
		System.out.println("NUMBER SYSTEM CALCULATOR");
		System.out.println("\nSelect Number System");
		System.out.println("[1] Binary");
		System.out.println("[2] Octal");
		System.out.println("[3] Decimal");
		System.out.println("[4] Hexadecimal");
		System.out.println("[5] Exit");
	}

	public void menu2() {
		System.out.println("\n\nSelect what arithmetic Operation:");
		System.out.println("[1] Addition");
		System.out.println("[2] Subtraction");
		System.out.println("[3] Multiplication");
		System.out.println("[4] Division");
		System.out.println("[5] Back to Main Menu");
	}

	public static String hexIn() {
		String hex1 = "";
		Scanner scan = new Scanner(System.in);
		hex1 = scan.nextLine();

		return hex1;
	}

	public static void main(String args[]) {
		Scanner userIn = new Scanner(System.in);
		String cont = "";
		String hexa1= "";
		String hexa2 = "";
		int choice = 0, choice2 = 0;
		long usIn1=0, usIn2=0;

		do {
			Calculator mMenu = new Calculator();
			Calculator sMenu = new Calculator();
			mMenu.menu1();
			System.out.print("\nENTER YOUR CHOICE [1 - 5]: ");
			choice = userIn.nextInt();

			if (choice == 5) {
				System.out.println();
				System.exit(0);
			} else if (choice == 1) {
				System.out.print("\n\nEnter first binary number [0 - 1]: ");
				usIn1 = userIn.nextLong();
				System.out.print("Enter second binary number [0 - 1]: ");
				usIn2 = userIn.nextLong();
			} else if (choice == 2) {
				System.out.print("\n\nEnter first octal number [0 - 7]: ");
				usIn1 = userIn.nextLong();
				System.out.print("Enter second octal number [0 - 7]: ");
				usIn2 = userIn.nextLong();
			} else if (choice == 3) {
				System.out.print("\n\nEnter first decimal number [0 - 9]: ");
				usIn1 = userIn.nextLong();
				System.out.print("Enter second decimal number [0 - 9]: ");
				usIn2 = userIn.nextLong();
			} else if (choice == 4) {
				System.out.print("\n\nEnter first hexadecimal number [0 - F]: ");
				hexa1 = hexIn();
				System.out.print("Enter second hexadecimal number [0 - F]: ");
				hexa2 = hexIn();
			}

			sMenu.menu2();
			System.out.print("\nENTER YOUR CHOICE [1 - 5]: ");
			choice2 = userIn.nextInt();

			switch (choice) {
				case 1:
				switch (choice2) {
					case 1:
					BinaryAddition method1 = new BinaryAddition();
					method1.add(usIn1, usIn2);
					break;
					case 2:
					BinarySubtraction method2 = new BinarySubtraction();
					method2.sub(usIn1, usIn2);
					break;
					case 3:
					BinaryMultiplication method3 = new BinaryMultiplication();
					method3.prod(usIn1, usIn2);
					break;
					case 4:
					BinaryDivision method4 = new BinaryDivision();
					method4.quo(usIn1, usIn2);
					break;
				}
				break;
				case 2:
				switch (choice2) {
					case 1:
					OctalAddition method13 = new OctalAddition();
					method13.octadd(usIn1, usIn2);
					break;
					case 2:
					OctalSubtraction method14 = new OctalSubtraction();
					method14.octsub(usIn1, usIn2);
					break;
					case 3:
					OctalMultiplication method15 = new OctalMultiplication();
					method15.octprod(usIn1, usIn2);
					break;
					case 4:
					OctalDivision method16 = new OctalDivision();
					method16.octquo(usIn1, usIn2);
					break;
				}
				break;
				case 3:
				switch(choice2) {
					case 1:
					DecimalOperations method5 = new DecimalOperations();
					method5.add(usIn1, usIn2);
					break;
					case 2:
					DecimalOperations method6 = new DecimalOperations();
					method6.sub(usIn1, usIn2);
					break;
					case 3:
					DecimalOperations method7 = new DecimalOperations();
					method7.prod(usIn1, usIn2);
					break;
					case 4:
					DecimalOperations method8 = new DecimalOperations();
					method8.quo(usIn1, usIn2);
					break;
				}
				break;
				case 4:
				switch (choice2) {
					case 1:
					HexadecimalAddition method9 = new HexadecimalAddition();
					method9.add(hexa1, hexa2);
					break;
					case 2:
					HexadecimalSubtraction method10 = new HexadecimalSubtraction();
					method10.sub(hexa1, hexa2);
					break;
					case 3:
					HexadecimalMultiplication method11 = new HexadecimalMultiplication();
					method11.prod(hexa1, hexa2);
					break;
					case 4:
					HexadecimalDivision method12 = new HexadecimalDivision();
					method12.quo(hexa1, hexa2);
					break;
				}
				break;
				default:
			}
			System.out.println();
		} while (choice !=5);
	}
}

