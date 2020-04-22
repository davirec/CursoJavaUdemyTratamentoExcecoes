package model;

import model.entities.Account;
import model.exceptions.SaldoInsuficienteException;
import model.exceptions.WithdrawLimitException;

public class App {

	public static void main(String[] args) {

//		try {
//			Account counnt = new Account(8021, "Bob Brown", 500.00, 300.00);
//
//			counnt.withdraw(400.00);
//			System.out.println(counnt.toString());
//
//		} catch (SaldoInsuficienteException e) {
//			System.out.println(e.toString());
//		}
//
//		catch (WithdrawLimitException e) {
//			System.out.println(e.toString());
//		}
		
		Account counnt = new Account(8021, "Bob Brown", 300.00, 300.00);
		try {
			counnt.withdraw(100.00);
			System.out.println("New balance: " + String.format("%.2f", counnt.getBalance()));
		}
		catch (WithdrawLimitException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (SaldoInsuficienteException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

	}

}
