package one;

import static one.Sign.ROCK;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSign {


    @Test

    public void testGetAll() {
        assertEquals("[ROCK, PAPER, SCISSORS]", Sign.getAll().toString());
    }

    @Test

    public void testGetResultVs() {
        Sign sign = ROCK;
        assertEquals("WIN", sign.getResultVs(Sign.PAPER).toString());
        assertEquals("LOSE", sign.getResultVs(Sign.SCISSORS).toString());

        sign = Sign.PAPER;
        assertEquals("TIE", sign.getResultVs(Sign.PAPER).toString());
        assertEquals("WIN", sign.getResultVs(Sign.SCISSORS).toString());
    }

    @Test
    public void testGetRandom(){
        Sign sign = ROCK;
        assertEquals("random", sign.getRandom().toString());
    }

    @Test

    public void testGetSignWinningOver() {
        Sign sign = ROCK;
        assertEquals("SCISSORS", sign.getSignWinningOver(Sign.PAPER).toString());

        sign = Sign.PAPER;
        assertEquals("PAPER", sign.getSignWinningOver(Sign.ROCK).toString());

    }

}


