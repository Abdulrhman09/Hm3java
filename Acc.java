package term2;

public class Acc {
	private int Acc_no;
	private float balnce;
	 public  Acc(int no) {
		 this. Acc_no = no;
		 
	 }
	 
	 public void Withdrawal(int W ) {
		 this.balnce = balnce - W;
		 
	 }
	 public void Deposit(int D ) {
		 this. balnce=D;
		 
	 }
	 public void Print_data( ) {
		 System.out.println("Your Account Number Is: "+Acc_no);
		 System.out.println("Your Blance Is: "  +balnce);

	 }
	
	public static void main(String[] args) {
		Acc acc= new Acc(100);
		acc.Deposit(4000);
		acc.Withdrawal(2000);
        acc.Print_data();
	}

}
