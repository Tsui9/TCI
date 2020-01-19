package casino;

import java.util.Map;

public class Game {

	private boolean multipleBet;
	private GamblingAuthority gamblingAuthority;
	private BettingRound currentBetRound;
	private Map<Bet, String> listOfBets;
	private int nrOfWinNumber;


	/**
	 * constructe of the betting round
	 * @param gamblingAuthority
	 */
	public Game(GamblingAuthority gamblingAuthority, int nrOfWinNumber) {
		// TODO - implement Game.Game
		throw new UnsupportedOperationException();
	}

	/**
	 *Create the bettinground method, each game has a bettinground
	 * @param listOfBets
	 */
	public BettingRound createBetRound(Map<Bet, String> listOfBets) {
		// TODO - implement Game.createBetRound
		throw new UnsupportedOperationException();
	}

	/**
	 * it should check the token status.To be able to start a betting round, it needs to get a unique token from gaming authority by providing an unique betting around ID
	 */
	public void requestToken(Integer bettingroundID) {
		// TODO - implement Game.requestToken
		throw new UnsupportedOperationException();
	}

	/**
	 * it should check the token status.
	 * this method also logging the betting round with timestamp
	 * @param betRound
	 */
	public void requestWinNumber(BettingRound betRound) {
		// TODO - implement Game.requestWinNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * winNumber should only be set once. In the Setter, we will check if the winNumber is already assigned or not, if the winNrAssigned is false before setting as a representation of not assigned winNumber and if true then it shows that the winNumber has already assigned and throw an exception.
	 * @param winNumber
	 */
	public void setWinNumber(Integer winNumber) {
		// TODO - implement Game.setWinNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * updated the credit, how much amount has been won, but through bankteller
     * connected with bankteller
	 *this method also logging the with timestamp
	 */

	public void updateOutValueOfTheBet() {
		// TODO - implement Game.updateOutValueOfTheBet
		throw new UnsupportedOperationException();
	}

}