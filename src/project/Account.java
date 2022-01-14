package project;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner menuInput = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'####,##0.00");
	
	// Set the customer number
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	// get customer number
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	
	//set pin number
	public int setPinNumber(int pinNumber) {
		return pinNumber;
	}
	
	//get pin number
		public int getPinNumber() {
			return pinNumber;
		}
		
	// get checking balance
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	// get Account balance
	public double getSavingBalance() {
		return savingBalance;
	}
	
	// Calculating checking the balance
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	// calculating the saving amount
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	// Calculating checking the balance deposit
		public double calcCheckingWithDeposit(double amount) {
			checkingBalance = (checkingBalance + amount);
			return checkingBalance;
		}
		
		// calculating the saving amount deposit
		public double calcSavingDeposit(double amount) {
			savingBalance = (savingBalance + amount);
			return savingBalance;
		}
	
	
	// checking account withdraw input
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
			
		}else {
			System.out.println("Balance cannot be negative. "+ "\n");
		}
	}
	
	//customer saving account withdraw input
	public void getSavingWithdrawInput() {
		System.out.println("saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving  Account Balance: " + moneyFormat.format(savingBalance));
			
		}else {
			System.out.println("Balance cannot be negative. "+ "\n");
		}
	}
	// customer checking Account Deposit input
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposit from checking account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calcCheckingWithDeposit(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
			
		}else {
			System.out.println("Balance cannot be negative. "+ "\n");
		}
	}
	

	//customer saving Account
	public void getSavingDepositInput() {
		System.out.println("saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit from saving account: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New saving  Account Balance: " + moneyFormat.format(savingBalance));
			
		}else {
			System.out.println("Balance cannot be negative. "+ "\n");
		}
	}
	
	

}
