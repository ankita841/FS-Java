package interestCalculator;

public class SBAccount extends Account {

	double calculateInterest()
	{
		return interestRate * amount / 100;
	}

}
