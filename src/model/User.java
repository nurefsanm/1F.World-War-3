/**
 * 
 */
package model;

/**
 * @author ibrahim
 *
 */
public class User {
	private String name;
	private int balance;
	
	public User(String name) {
		this.name= name;
		balance = 1000;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void reset() {
		balance = 1000;
	}
}
