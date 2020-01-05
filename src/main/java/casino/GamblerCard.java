package casino;

import java.util.Date;
import java.util.List;

public class GamblerCard {

	/**
	 * The Initial amount is determined on the assignment of the card to gambler by bank teller
	 */
	private double initialAmount;
	private Date timeStamp;
	private List<String> listOfBet;
	private String cardID;
	private boolean assignedStatus;
	private double credit;

	public double getInitialAmount() {
		return this.initialAmount;
	}

	public Date getTimeStamp() {
		return this.timeStamp;
	}

	public List<String> getListOfBet() {
		return this.listOfBet;
	}

	public void operation() {
		// TODO - implement GamblerCard.operation
		throw new UnsupportedOperationException();
	}

	public String getCardID() {
		return this.cardID;
	}

	public void checkOut() {
		// TODO - implement GamblerCard.checkOut
		throw new UnsupportedOperationException();
	}

	public boolean getAssignedStatus() {
		return this.assignedStatus;
	}

	public double getCredit() {
		return this.credit;
	}

	/**
	 * 
	 * @param amount
	 */
	public boolean setCredit(double amount) {
		// TODO - implement GamblerCard.setCredit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param betId
	 */
	public void addBet(String betId) {
		// TODO - implement GamblerCard.addBet
		throw new UnsupportedOperationException();
	}

	public String ToString() {
		// TODO - implement GamblerCard.ToString
		throw new UnsupportedOperationException();
	}

}