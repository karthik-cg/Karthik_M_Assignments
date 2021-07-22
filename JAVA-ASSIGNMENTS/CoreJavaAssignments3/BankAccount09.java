package com.CoreJavaAssignments3;

public class BankAccount09 implements Comparable<BankAccount09>{
	private double acc_balance;
	private int acc_ID;
	private String accountHoldername;
	private boolean isSalaryAccount;
	
	public BankAccount09(double acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(Integer acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public int compareTo(BankAccount09 o) {
		return this.getAcc_ID()-o.getAcc_ID();
	}
	
	
	

}