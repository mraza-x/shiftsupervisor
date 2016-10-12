/**
Mohammed Raza
CSC 162 - Lab3 # 2 (class2)
*/

public class ShiftSupervisor extends Employee
{
   private double salary;
   private double bonus;

   public ShiftSupervisor()
   {   super();

	   salary = 0;
	   bonus = 0;
   }


   public ShiftSupervisor(String n, String i, String d, double s, double b)
   {  super(n,i,d);

	  salary = s;
	  bonus = b;
   }


   public void setSalary(double s)
   {
      salary = s;
   }


   public void setBonus(double b)
   {
      bonus = b;
   }



   public double getSalary()
   {
      return salary;
   }



   public double getBonus()
   {
      return bonus;
   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
