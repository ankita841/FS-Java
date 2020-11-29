package interestCalculator;

public class FDAccount extends Account{
	
	int noOfDays, ageOfACHolder;
	
	FDAccount(double amount, int days, int age)
	{
		this.amount = amount;
		this.noOfDays = days;
		this.ageOfACHolder = age;
	}
	
	double calculateInterest() 
	{
		if (amount < 10000000)
		{
			if (ageOfACHolder < 60)
			{
				System.out.println("This is a general account : ");
				if (noOfDays > 6 && noOfDays <= 14)
					interestRate = 4.5;
				else if (noOfDays >= 15 && noOfDays <= 29)
					interestRate = 4.75;
				else if (noOfDays >= 30 && noOfDays <= 45)
					interestRate = 5.5;
				else if (noOfDays > 45 && noOfDays <= 60)
					interestRate = 7;
				else if (noOfDays >= 61 && noOfDays <= 184)
					interestRate = 7.5;
				else
					interestRate = 8;
			}
			else
			{
				System.out.println("This is a senior citizen account : ");
				if (noOfDays > 6 && noOfDays <= 14)
					interestRate = 5;
				else if (noOfDays >= 15 && noOfDays <= 29)
					interestRate = 5.25;
				else if (noOfDays >= 30 && noOfDays <= 45)
					interestRate = 6;
				else if (noOfDays > 45 && noOfDays <= 60)
					interestRate = 7.5;
				else if (noOfDays >= 61 && noOfDays <= 184)
					interestRate = 8;
				else
					interestRate = 8.5;
			}
		}
		else
		{
			if (noOfDays > 6 && noOfDays <= 14)
				interestRate = 6.5;
			else if (noOfDays >= 15 && noOfDays <= 29)
				interestRate = 6.75;
			else if (noOfDays >= 30 && noOfDays <= 45)
				interestRate = 7;
			else if (noOfDays > 45 && noOfDays <= 60)
				interestRate = 8;
			else if (noOfDays >= 61 && noOfDays <= 184)
				interestRate = 8.5;
			else
				interestRate = 10;			
		}

		return amount * interestRate / 100;
	}

}
