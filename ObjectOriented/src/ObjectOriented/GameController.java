package ObjectOriented;

import java.util.Scanner;

public class GameController 
{

	public static void main(String[] args) 
	{
		Employee empo1 = new Employee("Carola", "H�ggkvist", "Kvinna", "001", 45000.00);
		Employee empo2 = new Employee("Andreas", "Johnsson", "Man", "002", 3333);
		//empo1.PrintInfo();
		//empo2.PrintInfo();
		System.out.println("Skriv ett tal f�r att navigera menyn:");
		Scanner scan = new Scanner(System.in);
		boolean isException = false;
		int number = 0;
		do
			{
			try 
			{
				number = scan.nextInt();
				isException = false;
			}
			catch (Exception e)
			{
				System.out.println("Fel!");
				isException = true;
			}
			
			}
		while(isException = true);
		
		switch(number)
		{
		case 1: System.out.println("F�rsta alternativet"); break;
		case 2: System.out.println("Andra alternativet"); break;
		default: System.out.println("Inget r�tt"); break;
		}
		
	}
}

class Employee
{
	public String firstName, lastName, id, gender;
	public double salary;
	
	public Employee(String _firstName, String _lastName, String _gender, String _id, double _salary)
	{
		firstName = _firstName;
		lastName = _lastName;
		gender = _gender;
		salary = _salary;
		id = _id;
	}

	public void PrintInfo()
	{
		System.out.println("Namn:\t" + firstName + " " + lastName);
		System.out.println("ID:\t" + id);
		System.out.println("K�n:\t" + gender);
		System.out.println("L�n:\t" + salary +"\n");
	}
}
