package Creational_Prototype;

import java.util.Scanner;

public class MainPrototype {
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the persons details");
		Person person=new Person();
		System.out.println("Please enter the persons name");
		String personName=sc.nextLine();
		person.setPersonName(personName);
//		sc.next();
		System.out.println("Please enter the persons age");
		person.setPersonAge(sc.nextInt());
		System.out.println("Please enter the persons aadhar");
		person.setPersonAadhar(sc.next());
		System.out.println("Please enter the persons address");
		person.setPersonAddress(sc.next());
		
        System.out.println(person);
        person.toString();
        
       Person personAnother= person.getPersonClass();
       
       System.out.println(personAnother);
       personAnother.toString();
		
	}

}
