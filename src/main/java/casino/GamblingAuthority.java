package casino;

import java.util.List;

public class GamblingAuthority implements IBetTokenAuthority, IBetLoggingAuthority {

	private List<Bet> listOfBetIDs;
	private List<BettingRound> listOfBettingRound;
	private IBetLoggingAuthority logger;

	/**
	 * 
	 * @param bet
	 */
	public void addBet(Bet bet) {
		// TODO - implement GamblingAuthority.addBet
		throw new UnsupportedOperationException();
	}

	/**
	 * it should check the token status.
	 * @param bettingRound
	 */
	public String getToken(BettingRound bettingRound) {
		// TODO - implement GamblingAuthority.getToken
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bettingRound
	 */
	public void addBettingRound(BettingRound bettingRound) {
		// TODO - implement GamblingAuthority.addBettingRound
		throw new UnsupportedOperationException();
	}

	/**
	 * it should check the token status.
	 * @param bettingRound
	 */
	public Integer getWinNo(BettingRound bettingRound) {
		// TODO - implement GamblingAuthority.getWinNo
		throw new UnsupportedOperationException();
	}

	@Override
	public void Log(String filePath, String info) {

	}
}