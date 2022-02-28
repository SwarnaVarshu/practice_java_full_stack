package bank;

public class BankAccount {
	
	String accname;
	String accno;
	private double balance;
	
	public BankAccount(String accname,String accno) {
		
		this.accno = accno;
		this.accname = accname;
		balance = 0;
		
	}
	public String getaccname() {
		return accname;
	}
	
	public String getaccno() {
		return accno;
	
    }
	
	public Double getbalance() {
		return balance;
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			return true;
			
		}
		else {
			return false;
			
		}
	}
	
	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		}
		else {
			balance = balance - amount;
			return true;
		}
	}
	
	void show()
	{
		System.out.println("Accname : " + accname);
		System.out.println("Accno : " + accno);
	}
}
