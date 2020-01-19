package casino;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BetTest {

private Bet bet;

    @Test
    /**
     * constructe has double InValue, double selectedNumber, string cardinfo
     */
    public void Bet_Setup_succeed()
    {
        //arrange
        double inValue=5.5;
        int selectNr=8;
        String info="hello";

        //act
        bet=new Bet(inValue,selectNr,info);

        //assert
        Assert.assertNotNull(bet);
    }

    @Test
    /**
     * person who betting an amount of money entered for a bet
     */
    public void GetInValue_Return_expectValue() throws NullPointerException
    {
        //arrange
        double expectValue=5.5;
        double inValue=5.5;
        int selectNr=8;
        String info="hello";
        //act
        bet=new Bet(inValue,selectNr,info);
        //assert
      Assert.assertEquals(expectValue,5.5,bet.getInValue());
    }

    /**
     * person who betting an amount of money won for a bet
     */
    @Test
    public void test_GetAmountOfMoneyIsWon()
    {

    }

    /**
     * input value of bet
     * @param
     */
    @Test
    public void test_InvalueOfBetHasBeenSetUp()
    {

    }

    /**
     * get the card number of the bet card
     */
    @Test
    public void test_BetNumberIsSeleced()

    {

    }

    /**
     * return the bet card information to the user
     */
    @Test
    public void test_GetTheCardInformation()
    {

    }

    /**
     * output value of the bet
     * @param
     */
    @Test
    public void test_OutValueOfBetHasBeenSetup()
    {

    }

}