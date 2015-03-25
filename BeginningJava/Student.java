// Author : Enes Kemal Ergin
/*
	Student Class - Related -> Lesson11
		Represents a college student	
*/

public class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	public Student (String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
	}
	public String toString()
	{
		String result;
		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress;
	
		return result;
	}
}