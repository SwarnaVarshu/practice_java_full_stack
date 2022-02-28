package bank;

public class CheckingAccount extends SavingsAccount{
	
	private int transactioncount;
	private static final int Num_free = 3;
	private static final double Trans_fee = 2.0;
	

	public CheckingAccount(String accname, String accno , double rate) {
		super(accname, accno, rate);
		transactioncount = 0;
		// TODO Auto-generated constructor stub
	}
	
	public boolean deposit(double amount) {
		if(super.deposit(amount)) {
			transactioncount++;
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public boolean withdraw (double amount) {
		if(super.withdraw(amount)) {
			transactioncount++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deductfee() {
		if(transactioncount > Num_free) {
			double fees = Trans_fee * (transactioncount - Num_free);
		
		if(super.withdraw(fees)) {
			transactioncount = 0;
		}
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CheckingAccount c = new CheckingAccount("Swarna Varhini", "93988870", 3);
		c.show();
		c.deposit(5000);
		System.out.println("Before Interest " + c.getbalance());
		c.addInterest();
		System.out.println("After Interest " + c.getbalance());
		c.withdraw(200);
		System.out.println("Withdraw " + c.getbalance());
		c.deposit(500);
		c.withdraw(400);
		c.deposit(700);
		c.deductfee();
		System.out.println("Transaction " + c.getbalance());
	}

}
