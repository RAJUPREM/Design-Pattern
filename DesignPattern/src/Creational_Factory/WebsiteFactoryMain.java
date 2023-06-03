package Creational_Factory;

import java.util.Scanner;

public class WebsiteFactoryMain {
	
	public static void main(String [] args)
	{
		
		System.out.println("Please enter your website type choice like front,back,db");
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		WebsiteFactoryMiddleClass websiteFactoryMiddleClass=new WebsiteFactoryMiddleClass();
		WebsiteFactory websiteFactory=websiteFactoryMiddleClass.chooseWebType(choice);
		websiteFactory.rating();
		System.out.println(websiteFactory.showRating());
		
		
	}

}
