package project2;

import java.util.Scanner;

public class project2 {
	
	public static void main(String[] args) {

		String firstName, lastName; // to hold first and last name
		int money = 0;
		String a; // to loop the program
		Scanner input = new Scanner(System.in);

		// user input first and last name
		System.out.println("Please enter your first name:");
		firstName = input.next();
		System.out.println("Please enter youe last name:");
		lastName = input.next();

		do { // start of loop

			System.out.println("please ener the amount of money you would like to start the game:");
			money = input.nextInt(); // user input money
			System.out.print("let's start  ");
			System.out.print("--------> You hvae " + money + " dollars \n");

			// 3 random integers between 0-5 are generated
			int rNum1 = (int) (Math.random() * 6);
			int rNum2 = (int) (Math.random() * 6);
			int rNum3 = (int) (Math.random() * 6);

			// start of if else statements -------------------------------------------
			// show the output for the random number 1
			if (rNum1 == 0) {
				System.out.print("Cherry");
			} else {
				if (rNum1 == 1) {
					System.out.print("Orange");
				} else {
					if (rNum1 == 2) {
						System.out.print("Plum");
					} else {
						if (rNum1 == 3) {
							System.out.print("Bell");
						} else {
							if (rNum1 == 4) {
								System.out.print("Melon");
							} else {
								if (rNum1 == 5) {
									System.out.print("Bar");
								}
							}
						}
					}
				}
			}
			System.out.print("		");
			
			// show output for second random number
			if (rNum2 == 0) {
				System.out.print("Cherry");
			} else {
				if (rNum2 == 1) {
					System.out.print("Orange");
				} else {
					if (rNum2 == 2) {
						System.out.print("Plum");
					} else {
						if (rNum2 == 3) {
							System.out.print("Bell");
						} else {
							if (rNum2 == 4) {
								System.out.print("Melon");
							} else {
								if (rNum2 == 5) {
									System.out.print("Bar");
								}
							}
						}
					}
				}
			}
			System.out.print("		");
			
			//show output for third random number
			if (rNum3 == 0) {
				System.out.println("Cherry");
			} else {
				if (rNum3 == 1) {
					System.out.println("Orange");
				} else {
					if (rNum3 == 2) {
						System.out.println("Plum");
					} else {
						if (rNum3 == 3) {
							System.out.println("Bell");
						} else {
							if (rNum3 == 4) {
								System.out.println("Melon");
							} else {
								if (rNum3 == 5) {
									System.out.println("Bar");
								}
							}
						}
					}
				}
			}
			
			// calculate results for 3 way match and display money
			if (rNum1 == rNum2 && rNum2 == rNum3) {
				System.out.println("you won 300 dollars");
				money = money + 300;
				System.out.println("your total money is " + money + " dollars");
			} else {
				
				// calculate results for a 2 way match and display current money
				if (rNum1 == rNum2 || rNum1 == rNum3 || rNum2 == rNum3) {
					System.out.println("you won 200 dollars");
					money = money + 200;
					System.out.println("your total money is " + money + " dollars");
				} else {
					
					//if none match let the user know that they did not win any money
					if (rNum1 != rNum2 || rNum1 != rNum3 || rNum2 != rNum3) {
						System.out.println("you did not win anything");
						System.out.println("your total money is " + money + " dollars");
					}
				}
			}
			
			// ask the user if they want to play again
			System.out.println("Play again? (Y/N)");
			a = input.next(); //store output in char a

		} while (a.equalsIgnoreCase("y")); // if the user inputs anything else but y or Y the program will exit

		System.out.println("--------------------------------------------------------->");

		int moneyEarned = money - 100;
		// exit message 
		System.out.println("You won " + moneyEarned);
		System.out.println("Your total money is " + money + " dollars");
		System.out.println("Thank you for playing " + firstName + lastName + ".....");
		System.out.println("BYE!");

		input.close();
	}
}