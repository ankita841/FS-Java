package interestCalculator;

public class RDAccount extends Account {
	
	int noOfMonths, age;
	double monthlyAmount;
	
	RDAccount(int noOfMonths, int age, double monthlyAmount)
	{
		this.noOfMonths = noOfMonths;
		this.age = age;
		this.monthlyAmount =  monthlyAmount;
	}
	
	double calculateInterest()
	{
		if (age < 60)
		{
			System.out.println("This is a general account : ");
			if (noOfMonths == 6)
				this.interestRate = 7.5;
			else if (noOfMonths == 9)
				this.interestRate = 7.75;
			else if (noOfMonths == 12)
				this.interestRate = 8;
			else if (noOfMonths == 15)
				this.interestRate = 8.25;
			else if (noOfMonths == 18)
				this.interestRate = 8.5;
			else 
				this.interestRate = 8.75;
		}
		else
		{
			System.out.println("This is a senior citizen account : ");
			if (noOfMonths == 6)
				this.interestRate = 8;
			else if (noOfMonths == 9)
				this.interestRate = 8.25;
			else if (noOfMonths == 12)
				this.interestRate = 8.5;
			else if (noOfMonths == 15)
				this.interestRate = 8.75;
			else if (noOfMonths == 18)
				this.interestRate = 9;
			else 
				this.interestRate = 9.25;
		}
		double interest = 0, amt = 0;
		for (int i = 0; i < noOfMonths; i++)
		{
			amt += monthlyAmount;
			interest += (amt * interestRate / 100);
		}
		return interest;
	}

}
