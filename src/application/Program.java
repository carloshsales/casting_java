package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account account = new Account(1001, "CH", 0.0);
		BusinessAccount businessAccount = new BusinessAccount(2001, "CH", 0.0, 1000.0);
		
		//UPCASTING
		Account accountUp = businessAccount;
		Account businessAccountUp = new BusinessAccount(2002, "Jupiter", 0.0, 1000.0);
		Account savingsAccountUp = new SavingsAccount(3001, "Pandora", 0.0, 0.01);
		
		//DOWNCASTING
		//BusinessAccount businessAccountDown = businessAccountUp;
		BusinessAccount businessAccountDown = (BusinessAccount)businessAccountUp;
		businessAccountDown.loan(100.0);
		
		//BusinessAccount businessSavingsAccountDown = (BusinessAccount)savingsAccountUp; //CLASS CAST EXCEPTION
		
		if(savingsAccountUp instanceof BusinessAccount) {
			BusinessAccount businessSavingsAccountDown = (BusinessAccount)savingsAccountUp;
			businessSavingsAccountDown.loan(200.0);
			System.out.println("LOAN");
		}
		if(savingsAccountUp instanceof SavingsAccount) {
			SavingsAccount sAccount = (SavingsAccount)savingsAccountUp;
			sAccount.updateBalance();
			System.out.println("UPDATE");
		}
	}

}
