package SingleResponsibilityPrinciple;

public class BankService {
	
	public long deposite(long amount, String accountNo) {
//		deposite amount
		return 0;
	}
	public long withdraw(long amount, String accountNo) {
//		withdraw amount
		return 0;
	}
	
	
	public void printPassbook() {
//		Update Transaction info in Passbook
	}
	
	
	
	public void getLoanInterestInfo(String loanType) {
		if(loanType.equals("homeLoan")) {
//			do some job
		}
		else if(loanType.equals("personalLoan")) {
//			do some job
		}
		else if(loanType.equals("carLoan")) {
//			do some job
		}
	}
	
	
	
	public void sendOTP(String medium) {
		if(medium.equals("Email")) {
//			Write email related logic
//			Use JavaMailSenderAPI
		}
	}
}
