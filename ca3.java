import java.util.*;

interface Addable
{
	int add(int a, int b);
}

class newMonth
{
	public String name, month;
	public int salary, saving, left;
	
	public newMonth(String name, String month, int salary, int saving, int left)
	{
		this.name = name;
		this.month=month;
		this.salary=salary;
		this.saving=saving;
		this.left=left;
	}
	
	public String leftMoney()
	{
		left=salary;
		return("the comfortable amout of money left after taking into account how much you want to save and all expenses is: " + left);
	} 
}

class expenses extends newMonth
{
	public int foodExpense;
	public int rent;
	
	public expenses( String name, String month, int salary, int left, int saving, int foodExpense, int rent)
	{
		super(name, month, salary, saving, left);
		this.foodExpense=foodExpense;
		this.rent= rent;
	}
	
	public String leftMoney()
	{
		left=salary-saving-foodExpense-rent;
		return("the comfortable amout of money left after taking into account how much you want to save and all expenses is: " + left);
	}

}

public class ca3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in); // int
		Scanner in= new Scanner(System.in); //String
		String n, mth;
		int sal, sav, r, food,per,misc,l;
		sav=0;
		l=0;
		System.out.println("enter your name");
		n= in.nextLine();
		System.out.println("enter the month");
		mth=in.nextLine();
		System.out.println("enter your salary");
		sal= in.nextInt();
		System.out.println("enter the percentage of your salary you want to save");
		per= in.nextInt();
		sav=sal*per/100;
		System.out.println("enter the rent amount");
		r= in.nextInt();
		System.out.println("enter the food expense of the month");
		food= in.nextInt();
		System.out.println("enter any misc expense of the month");
		misc= in.nextInt();
		
		Addable ad1=(a,b)->(a+b);
		food=ad1.add(food, misc);
		
		expenses e= new expenses(n, mth, sal, l,sav, r, food);
		System.out.println(e.leftMoney());
		
	}
}
