package myti;

import java.util.Scanner;

/**
 * Implementation of basic MyTi system outline.
 * A MyTi card can be used to purchase travel passes:
 *     2Hour or All Day, Zone 1 or Zones 1+2.
 * Each type of travel pass has different prices.
 * This program loops through options of purchasing a pass, 
 *     topping up the MyTi card, or viewing current credit.
 *     
 * This is an *outline* --- you will need to add menu options and fill in
 *   the implementation details for all the functionality
 *     
 * @author lcavedon
 *
 */
public class MyTiSystem {

	// create a new Scanner from standard input
	static Scanner input = new Scanner(System.in);
	
	/**
	 * main program: this contains the main menu loop
	 */
	public static void main(String[] args) {
		
		// CODE HERE:
		// create a collection of the MyTi passes available to the system
		// for this assignment, you may hard-code a number of passes and their ids

		// CODE HERE:
		// create a collection of stations for the system
		// for this assignment, you may hard-code a number of stations and their details

		
		// main menu loop: print menu, then do something depending on selection
		int option;
		do {
			printMainMenu();
			option = input.nextInt();
			System.out.println();
			
			// perform correct action, depending on selection
			switch (option) {
			case 1: purchasePass();
				break;
			case 2: recharge();
				break;
			case 3: showCredit();
				break;

			case 0: System.out.println("Goodbye!");  // will quit---do nothing
				break;
			default:
				// if no legal option selected, just go round and choose again
				System.out.println("Invalid option!");
			}
			
		} while (option != 0);
		
		// finishing processing ... close the input stream
		input.close();
	}
	
	/*
	 * Print the main menu (you have to modify / add options)
	 */
	static void printMainMenu() {
		System.out.println();
		System.out.println("Select an option:");
		System.out.println("1. Purchase a travel pass");
		System.out.println("2. Recharge your MyTi card");
		System.out.println("3. Show remaining MyTi credit");
		System.out.println("0. Quit");
		System.out.print("Your option: ");
	}
	
	/*
	 * Purchase a travel pass using MyTi credit
	 */
	static void purchasePass() {
		// first, get the MyTi card that we plan to use to purchase Travel Pass
		System.out.println();
		System.out.println("What is the id of the MyTi pass:");
		String id = input.next();
		MyTiCard myticard = null;
		// CODE GOES HERE: look up MyTi card matching this id --- if no match, return null
		if (myticard == null) {
			System.out.println("No MyTi Card matching that id was found ...");
			return;
		}
		
		// ... else we found a matching MyTi card: continue with purchasing Travel Pass
		// print time options
		System.out.println();
		System.out.println("How long do you need a pass for:");
		System.out.println("a. 2 Hours");
		System.out.println("b. All Day");
		System.out.println("c. cancel");
		System.out.println("Your selection: ");
		String length = input.next();
		if (length .equals("c")) return;  // cancel

		System.out.println();
		System.out.println("For which zones:");
		System.out.println("a. Zone 1");
		System.out.println("b. Zones 1 and 2");
		System.out.println("c. cancel");
		System.out.println("Your selection: ");
		String zones = input.next();
		if (zones.equals("c")) return;    // cancel
		
		System.out.println();
		
		// first check if valid options were selected
		if ((!length.equals("a") && !length.equals("b"))
				|| (!zones.equals("a") && !zones.equals("b"))) {
			System.out.println("You have selected an illegal option. Please try again.");
			// if not, then re-try purchasing a pass
			purchasePass();
		} else {
			// selected legal options --- purchase a Travel Pass on this MyTi card
			// NOTE: you will need to Check Credit before finalising the purchase!
			//   --- Raise an Exception if there is not enough credit
			
			if (length.equals("a") && zones.equals("a")) {
				// CODE HERE: purchase a 2 Hour Zone 1 Travel Pass on this MyKi card;
			} else if (length.equals("a") && zones.equals("b")) {
				// CODE HERE: purchase a 2 Hour Zone 2 Travel Pass on this MyKi card;
			} else if (length.equals("b") && zones.equals("a")) {
				// CODE HERE: purchase an All Day Zone 1 Travel Pass on this MyKi card;
			} else if (length.equals("b") && zones.equals("b")) {
				// CODE HERE: purchase an All Day Zone 2 Travel Pass on this MyKi card;
			}

		}
	}
	
	/*
	 * Recharge a MyTi card
	 */
	static void recharge() {
		// CODE HERE: Get MyTi card id from user and find matching MyTiCard 
		
		System.out.print("How much credit do you want to add: ");
		// read charge amount from input Scanner
		double amount = input.nextDouble();

		// CODE HERE: add that credit to the MyTiCard 
		// - check that it does not go above max amount (raise Exception if it does)
	}

	/*
	 * Display the remaining credit on MyTi card
	 */
	static void showCredit() {
		// CODE HERE: Get MyTi card id from user and find matching MyTiCard
		
		// CODE HERE: Display credit for that MyTiCard
	}

}
