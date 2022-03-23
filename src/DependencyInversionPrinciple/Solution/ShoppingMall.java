package DependencyInversionPrinciple.Solution;

public class ShoppingMall {
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPayment(Object order, int amount){
		bankCard.doTransaction(amount); 
	}
	
	public static void main(String[] args) {
		
	     BankCard bankCard = new DebitCard();      // creating an instance of debitcard, loosely coupled
//	     BankCard bankCard = new CreditCard();
	     
	     ShoppingMall shoppingMall=new ShoppingMall(bankCard);  //Passing debitcard instance for initiating
//	     ShoppingMall shoppingMall=new ShoppingMall(bankCard);  
	     
	     shoppingMall.doPayment("some order",5000);  //performing transaction
	     
	}
	

}
