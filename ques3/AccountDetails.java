package com.ques3;

import java.util.Scanner;

public class AccountDetails {

	public Account getAccountDetails() {
		Account account = new Account();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account id:");
		int id = sc.nextInt();
		account.setAccountId(id);
		
		System.out.println("Enter account type:");
		String type = sc.next();
		account.setAccountType(type);
		
		System.out.println("Enterbalance:");
		int bal = sc.nextInt();
		while(bal<=0)
		{
			System.out.println("Balance should be positive");
			bal = sc.nextInt();
		}
		account.setBalance(bal);
		return account;
	}
	
	public int getWithdrawAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn:");
		int withdraw = sc.nextInt();
		while(withdraw<=0)
		{
			System.out.println("Amount should be positive");
			withdraw = sc.nextInt();
		}
		return withdraw;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails accountdetails = new AccountDetails();
		
		Account account = accountdetails.getAccountDetails();
		
		int amount = accountdetails.getWithdrawAmount();
	
		account.withdraw(amount);
	}

}
