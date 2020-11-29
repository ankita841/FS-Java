package interestCalculator;

import java.util.*;

class negativeNumberException extends Exception
{
	negativeNumberException()
	{
		System.out.println("Invalid Input : Please enter non-negative values only.");
	}
}

public abstract class MainClass extends Account {

	public static void main(String[] args) throws negativeNumberException {
		Scanner obj = new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1. Interest Calculator - SB \n2. Interest Calculator - FD \n3. Interest Calculator - RD \n4. Exit ");
			System.out.println("\nEnter you choice(1..4) : ");
			choice = obj.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("Enter the type of account(NRI(1)/Normal(2)) : ");
				int typeOfAccount = obj.nextInt();
				System.out.println("Enter the average amount in your account : ");
				double amount = obj.nextDouble();
				SBAccount sb = new SBAccount();
				if (typeOfAccount < 0 || amount < 0)
					throw new negativeNumberException();
				if (typeOfAccount == 1)
					sb.interestRate = 6;
				else
					sb.interestRate = 4;
				sb.amount = amount;
				System.out.println("Interest gained : " + sb.calculateInterest());
				System.out.println("--------------------------------------------------\n");
				break;
			case 2:
				System.out.println("Enter the FD Amount : ");
				amount = obj.nextDouble();
				System.out.println("Enter the number of days : ");
				int days = obj.nextInt();
				System.out.println("Enter your age : ");
				int age = obj.nextInt();
				if (amount < 0 || days < 0 || age < 0)
					throw new negativeNumberException();
				FDAccount fd = new FDAccount(amount, days, age);
				System.out.println("Interest gained : " + fd.calculateInterest());
				System.out.println("--------------------------------------------------\n");
				break;
			case 3:
				System.out.println("Enter your age : ");
				age = obj.nextInt();
				System.out.println("Enter the monthly amount you are going to deposit : ");
				double monthlyAmount = obj.nextDouble();
				System.out.println("Enter the number of months for RD (6/9/12/15/18/21 months): ");
				int noOfMonths = obj.nextInt();
				if (age < 0 || monthlyAmount < 0 || noOfMonths < 0)
					throw new negativeNumberException();
				RDAccount rd = new RDAccount(noOfMonths, age, monthlyAmount);
				if (noOfMonths == 6 || noOfMonths == 9 || noOfMonths == 12 || noOfMonths == 15 || noOfMonths == 18 || noOfMonths == 21)
					System.out.println("Interest gained : " + rd.calculateInterest());
				else
					System.out.println("Enter the correct number of months!");
				System.out.println("-----------------------------------------------------------------\n");
				break;
			case 4:
				System.out.println("\nThankyou!");
				break;
			default:
				System.out.println("Enter from the choices listed below!");
				break;					
			}
		}while(choice != 4);
	}

}
