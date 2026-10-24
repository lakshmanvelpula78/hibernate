package cse5;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Bank {
	private String bankname;
	@Id
	private int accountno;
	private String accountname;
	
	Bank(String a, int b, String c){
		this.bankname=a;
		this.accountno=b;
		this.accountname = c;
	}
	
	public void setbankname(String a) {
		this.bankname=a;
	}
	public void setaccountno(int b) {
		this.accountno=b;
	}
	public void setaccountname(String c) {
		this.accountname=c;
	}
	public String getbankname() {
		return bankname;
	}
	public int getaccountno() {
		return accountno;
	}
	public String getaccountname() {
		return accountname;
	}
	
}
