
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab3 #2 (main)
*/

public class ShiftSupervisorDemo
{
   public static void main(String[] args)
   {

	  String name1;
	  String id1;
	  String date1;
	  double salary1;
	  double bonus1;


	  Scanner keyboard = new Scanner(System.in);

	  //***Supervisor 1***

					System.out.println("Supervisor 1: ");

					System.out.print("Name: ");
      				name1 = keyboard.nextLine();

      				System.out.print("ID number: ");
      				id1 = keyboard.nextLine();

      				System.out.print("Hire Date: ");
      				date1 = keyboard.nextLine();

      				System.out.print("Annual Salary: $");
      				salary1 = keyboard.nextDouble();

      				System.out.print("Production Bonus: $");
      				bonus1 = keyboard.nextDouble();


      ShiftSupervisor sup1 = new ShiftSupervisor(name1, id1, date1, salary1, bonus1);

 	  System.out.println(" ");
      System.out.println(" ");



      System.out.println("Name: " +
                         sup1.getName());

	  System.out.println("ID: " +
                         sup1.getEmployeeNumber());

	  System.out.println("Hire Date: " +
                         sup1.getHireDate());

      System.out.printf("Annual Salary: $%8.2f\n", sup1.getSalary());

      System.out.printf("Production Bonus: $%8.2f\n", sup1.getBonus());

      System.out.println(" ");
      System.out.println(" "); //***Supervisor 2 Using set methods***
      System.out.println(" ");

      ShiftSupervisor sup2 = new ShiftSupervisor();

      				System.out.println("Supervisor 2: ");

 					System.out.print("Name: ");
 				 	name1 = keyboard.nextLine();  // *** Professor, this statement for
 				 								  // *** name input will not execute.
 				 								  // *** It skips to the ID number input.
		      		sup2.setName(name1);

		      		System.out.print("ID number: ");
		      		id1 = keyboard.nextLine();
		      		sup2.setEmployeeNumber(id1);

		      		System.out.print("Hire Date: ");
		      		date1 = keyboard.nextLine();
		      		sup2.setHireDate(date1);

		      		System.out.print("Annual Salary: $");
		      		salary1 = keyboard.nextDouble();
		      		sup2.setSalary(salary1);

		      		System.out.print("Production Bonus: $");
		      		bonus1 = keyboard.nextDouble();
		      		sup2.setBonus(bonus1);

      System.out.println(" ");
      System.out.println(" ");


      System.out.println("Name: " +
	                     sup2.getName());

	  System.out.println("ID: " +
	                     sup2.getEmployeeNumber());

	  System.out.println("Hire Date: " +
	                     sup2.getHireDate());

	  System.out.printf("Annual Salary: $%8.2f\n", sup2.getSalary());

	  System.out.printf("Production Bonus: $%8.2f\n", sup2.getBonus());

   }
}
