package model.entities;

import model.exceptions.SaldoInsuficienteException;
import model.exceptions.WithdrawLimitException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
		
	}	

	public Account(int number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount){
		this.balance += amount;
		
	}
	
	public void withdraw(double amount){
		
		if(withdrawLimit < amount) {
			throw new WithdrawLimitException("Withdraw error: The amount exceeds withdraw limit");
		}
		
		if(balance < amount ) {
			throw new SaldoInsuficienteException("Withdraw error: Not enough balance");
		}
		
		this.balance -= amount;
		
	}
	
	@Override
	public String toString() {
		return "New balance: " + balance;
	}
	
	
}
