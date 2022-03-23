package DependencyInversionPrinciple;

public class ShoppingMall {
	
	private DebitCard debitCard;
	
//	private CreditCard creditCard;
	
	public ShoppingMall(DebitCard debitCard) {
	        this.debitCard = debitCard;
	   }
//	public ShoppingMall(CreditCard creditCard) {
//		this.creditCard = creditCard;
//	}
	
	public void doPayment(Object order, int amount){
		debitCard.doTransaction(amount); 
	 }
//	public void doPayment(Object order, int amount){
//		creditCard.doTransaction(amount); 
//	}
	
	public static void main(String[] args) {
		
	     DebitCard debitCard=new DebitCard();      // creating an instance of debitcard, tightly coupled
//	     CreditCard creditCard = new CreditCard();
	     
	     ShoppingMall shoppingMall=new ShoppingMall(debitCard);  //Passing debitcard instance for initiating
//	     ShoppingMall shoppingMall=new ShoppingMall(creditCard);  
	     
	     shoppingMall.doPayment("some order",5000);  //performing transaction
	     
	}
}

