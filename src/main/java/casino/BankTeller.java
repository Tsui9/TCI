package casino;


import java.util.List;

public class BankTeller implements IBetLoggingAuthority {

	private List<GamblerCard> listOfGamblerCard;
	private IBetLoggingAuthority logger;

	public void CashOut() {
		// TODO - implement BankTeller.CashOut
		throw new UnsupportedOperationException();
	}

	public List<GamblerCard> getListOfGamblerCard() {
		return this.listOfGamblerCard;
	}

	/**
	 * 
	 * @param listOfGamblerCard
	 */
	public void setListOfGamblerCard(List<GamblerCard> listOfGamblerCard) {
		this.listOfGamblerCard = listOfGamblerCard;
	}

	public void getAttribute() {
		// TODO - implement BankTeller.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement BankTeller.setAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 */
	public boolean assignCard(double amount) {
		// TODO - implement BankTeller.assignCard
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gamblerCardID
	 */
	public void clearCard(String gamblerCardID) {
		// TODO - implement BankTeller.clearCard
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gamblerCardID
	 * @param amount
	 */
	public boolean checkCredit(String gamblerCardID, double amount) {
		// TODO - implement BankTeller.checkCredit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gamblerCardID
	 * @param amount
	 */
	public void deposit(String gamblerCardID, double amount) {
		// TODO - implement BankTeller.deposit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gamblerCardID
	 * @param amount
	 */
	public void withdraw(String gamblerCardID, double amount) {
		// TODO - implement BankTeller.withdraw
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gamblerCardID
	 * @param bet
	 */
	public void AddBetToGamblerCard(String gamblerCardID, Bet bet) {
		// TODO - implement BankTeller.AddBet
		throw new UnsupportedOperationException();
	}

	@Override
	public void Log(String filePath, String info) {

	}
}