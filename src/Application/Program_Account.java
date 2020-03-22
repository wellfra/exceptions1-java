package Application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program_Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Ener account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.printf("New Balance: %.2f", account.getBalance());
		}
		catch (DomainException e){
			System.out.println("Erro no Saque: " + e.getMessage());
			
		}
		catch (RuntimeException e){
			System.out.println("Erro inesperado");
			
		}
		
		
		sc.close();

	}

}
