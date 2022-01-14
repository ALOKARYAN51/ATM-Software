package project;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.HashMap;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'####,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	// Validate Login information customer number and pin number.
	
	public void getLogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(9988776, 1234);
				data.put(9988775, 2343);
				
				System.out.println("Welcome to the ATM Project");
				System.out.print("Enter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter Your Pin: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid character. Only Numbers." +"\n");
				x = 2;
			}
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			//for(Entry<Integer, Integer> entry : data.entrySet()) {
			//	if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
			//		getAccountType();
			//	}
			//}
				if(data.containsKey(cn) && data.get(cn) == pn) {
					getAccountType();
				}
			System.out.println("\n" + "Wrong Customer number or pin." + "\n");
		}while(x == 1);
	}
	
	// Display Account type menu with selection.
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type-1 - Checking Account");
		System.out.println("Type-2 - Saving Accounts");
		System.out.println("Type-3 - Exit");
		System.out.print("choice: ");
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getChecking();
			break;
		
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using this ATM, bye. ");
			break;
			
		default: 
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}
	
	// Display Checking Accounts;
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type-1 - View Balance");
		System.out.println("Type-2 - Withdraw Money");
		System.out.println("Type-3 - Deposit Money");
		System.out.println("Type-4 - Exit.");
		System.out.print("choice: ");
		
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, bye. ");
			break;
			
		default: 
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}
	
	// Display saving accounts
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type-1 - View Balance");
		System.out.println("Type-2 - Withdraw Money");
		System.out.println("Type-3 - Deposit Money");
		System.out.println("Type-4 - Exit.");
		System.out.print("choice: ");
		
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, bye. ");
			break;
			
		default: 
			System.out.println("\n" + "Invalid Choice." + "\n");
			getSaving();
		}
	}
	int selection;
	
	

}
