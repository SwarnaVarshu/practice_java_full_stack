package OOPs;

public class Getter_Setter {
	
	double d;
	
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	private int i;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	private String n;
	public Getter_Setter(int i, String n,double d) {    //using construtor
		this.d=d;
		this.i = i;
		this.n = n;
	}
	public Getter_Setter() {   //using construtor
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
