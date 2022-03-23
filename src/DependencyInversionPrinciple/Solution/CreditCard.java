package DependencyInversionPrinciple.Solution;

public class CreditCard implements BankCard{

	@Override
	public void doTransaction(int amount) {
		System.out.println("Transaction done with CreditCard");
	}

}
