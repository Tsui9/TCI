package casino;

import java.util.Date;

public class Bet {

	private String id;
	private Date Time;
	private double inValue;
	private double outValue;
	private boolean inValueStatus = false;
	private boolean outValueStatus = false;
	private String cardInformation;
	private Integer selecedNumber;

	/**
	 * Construte of the class
	 * @param inValue
	 * @param selectedNumber
	 * @param cardInfo
	 */
	public Bet(double inValue, int selectedNumber, String cardInfo){
		this.inValue=inValue;
		this.selecedNumber=selectedNumber;
		this.cardInformation=cardInfo;

	}

	/**
	 *Get the betting invalue(amount of money entered for a bet) on the current round.
	 * @return
	 */
	public double getInValue() {
		return this.inValue;
	}

	/**
	 * Set the betting invalue(amount of money entered for a bet) on the current round.
	 * @param inValue
	 */
	public void setInValue(double inValue) {
		this.inValue = inValue;
	}


	/**
	 *Show the selectedNumber
	 * @return
	 */
	public Integer getSelecedNumber() {
		return this.selecedNumber;
	}

	/**
	 * Get the outcome of bet (amount of money returned)
	 * @return
	 */
	public double getOutValue() {
		return this.outValue;
	}

	/**
	 * Set output value
	 * @param outValue
	 */
	public void setOutValue(double outValue) {
		this.outValue = outValue;
	}

	/**
	 * Get the cardInformation,if the card has enough credit to place the bet
	 * @return
	 */
	public String getCardInformation() {
		return this.cardInformation;
	}

}