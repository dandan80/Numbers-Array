import java.util.*;
public class NumbersTest {

	public static void main(String[] args) {
		Numbers num = new Numbers();
		int choice1 = 0;
	
		do {
			displayMainMenu();
			try {
				Scanner input = new Scanner(System.in);
				choice1 = input.nextInt();
				input.nextLine();
				switch (choice1) {

				case 1:
					num = new Numbers();
					break;

				case 2:
					System.out.println("Enter new size of the array: ");
					int choice2 = input.nextInt();
					input.nextLine();
					if (choice2 > 0) {
						num = new Numbers(choice2);
					} else {
						System.out.println("Please only input positive integer.");
					}
					break;

				case 3:
					num.addValue(input);
					break;

				case 4: 
					System.out.println("Numbers are:");
					System.out.println(num.toString());
					break;

				case 5: 
					Float[] findValue = num.findMinMax();
					System.out.print("Average is: " + num.calcAverage());
					System.out.print(", Minimum value is " + findValue[1]);
					System.out.print(", Maximum value is " + findValue[0]);
					if (findValue[2] != null) {
						System.out.print(",max mod min is " + findValue[2]);
					} else {
						System.out.printf("%s", ", max mod min is not exist, because the min is 0.");
					}
					System.out.println();
					break;

				case 6: 
					System.out.println("Exiting... ");
					break;
				default:
					System.out.println("Your choice should from 1 to 6. ");
				}
			} catch (InputMismatchException ioe) {
				System.out.println("The input type is invalid");
			}
		} while (choice1 != 6);
	}


	public static void displayMainMenu() {
		System.out.println("Please select one of the following:");
		System.out.println("1: Initialize a default array");
		System.out.println("2: To specify the max size of the array");
		System.out.println("3: Add value to the array");
		System.out.println("4: Display values in the array");
		System.out.println("5: Display average of the values, minimum value, maximum value, max mod min");
		System.out.println("6: To Exit");
		System.out.println(">");
	}

}
