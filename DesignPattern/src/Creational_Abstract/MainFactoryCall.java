package Creational_Abstract;

import java.util.Scanner;

public class MainFactoryCall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter you factory choice like Bank or Loan");
		
		String choice =sc.next();
		FactoryOfFactory factoryOfFactory=new FactoryOfFactory();
		AbstractFactory abstractFactory=factoryOfFactory.getFactory(choice);
		
		System.out.println("Please enter bank name");
		String bankName=sc.next();
		
		Bank bank=abstractFactory.getBankClass(bankName);
		
		bank.name(bankName);

	}

}
