package casino;

public interface IGamblingMachine {

	/**
	 * 
	 * @param gamblerCardID
	 * @param amount
	 * @param selectedNumber
	 */
	boolean placeBet(String gamblerCardID, double amount, Integer selectedNumber);

    /**
     * Gambling machine creates the betting round
     * @return
     */
	public BettingRound createBetRound();

	void reward();
}