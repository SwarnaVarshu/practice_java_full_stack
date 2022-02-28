package bank;

public class SavingsAccount extends BankAccount{
	
	private double interestrate;
	String accname,accno;
	

	public SavingsAccount(String accname, String accno , double rate) {
		super(accname, accno);
		interestrate = rate;
		// TODO Auto-generated constructor stub
	}
	
	public void addInterest() {
		double interest = getbalance() + interestrate/100;
		deposit(interest);
	}

}
