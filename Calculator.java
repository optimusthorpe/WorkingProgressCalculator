import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		while (true)
		{
		Scanner myCal = new Scanner(System.in);
		// Ask for type of calculation
		System.out.println("Please select the type of calculation: + OR - OR / OR *");

		String calType = myCal.nextLine();
		System.out.println("Enter first number you want to use for calculation");
		// Numerical input
		int a = myCal.nextInt();
		System.out.println(a);
		System.out.println("Please enter second number");
		int b = myCal.nextInt();
		System.out.println(b);
		

		
		
		char Response;
		//Response = myCal.next().charAt(0);// Gets stuck at this line, doesn't go into switch statement
			//if (Response == 'Y' || Response == 'y')
			{
				// Switch cases for different calculations
				switch (calType)
				{
				case "+":
					System.out.println(a + b);
					System.out.println("Would you like to continue? Y or N");
					//char Response;
					Response = myCal.next().charAt(0);
					
					System.out.println(Response);
					break;
				case "-":
					System.out.println(a - b);
					System.out.println("Would you like to continue? Y or N");
					break;
				case "*":
					System.out.println(a * b);
					System.out.println("Would you like to continue? Y or N");
					break;
				case "/":
					System.out.println(a / b);
					System.out.println("Would you like to continue? Y or N");
					break;

				}
			}
		}
	}
}
