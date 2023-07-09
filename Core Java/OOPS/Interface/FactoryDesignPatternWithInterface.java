import java.util.*;

interface Bank
{
	public double getRate();
}
class SBI implements Bank
{
	public double getRate()
	{
		return 6.25;
	}
}
class ICICI implements Bank
{
	public double getRate()
	{
		return 7.20;
	}
}
class HDFC implements Bank
{
	public double getRate()
	{
		return 9.50;
	}
}
public class FactoryDesignPatternWithInterface
{
	public static void main(String[] args)
	{
		Bank b;
		Scanner input=new Scanner(System.in);

		System.out.println("Enter bank name:");
		String bname=input.nextLine();

		if(bname.equalsIgnoreCase("SBI"))
		{
			b=new SBI();
			System.out.println("SBI bank rate :"+b.getRate());
		}
		else if(bname.equalsIgnoreCase("ICICI"))
		{
			b=new ICICI();
			System.out.println("ICICI bank rate :"+b.getRate());
		}
        else if(bname.equalsIgnoreCase("HDFC"))
		{
			b=new HDFC();
			System.out.println("HDFC bank rate :"+b.getRate());
		}
		else
		{
			System.out.println("Wrong bank name.");
		}

	}	
}