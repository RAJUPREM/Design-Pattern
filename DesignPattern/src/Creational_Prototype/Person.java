package Creational_Prototype;

public class Person {
	
	Person person=null;
	
	public Person(String personName, int personAge, String personAadhar, String personAddress) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personAadhar = personAadhar;
		this.personAddress = personAddress;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	String personName;
	int personAge;
	String personAadhar;
	String personAddress;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonAadhar() {
		return personAadhar;
	}
	public void setPersonAadhar(String personAadhar) {
		this.personAadhar = personAadhar;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
	public Person getPersonClass()
	{
		if(person==null)
		{
			return new Person(personName,personAge,personAadhar,personAddress);
		}
		else
		{
			return person;
		}
	}
	@Override
	public String toString() {
		return "Person [person=" + person + ", personName=" + personName + ", personAge=" + personAge
				+ ", personAadhar=" + personAadhar + ", personAddress=" + personAddress + "]";
	}

}
