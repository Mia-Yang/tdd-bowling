import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    public final BowlingGame game = new BowlingGame();

    @Test
    void should_have_zero_score_when_rolling_zero_each_roll() {
        int expectedScore = 0;
        int[] rolls = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(game.getScore(rolls), expectedScore);
    }

    @Test
    void should_calculate_score_when_there_is_no_strike_and_spare() {
        int expectedScore = 32;
        int[] rolls = {0, 1, 0, 0, 0, 4, 5, 0, 0, 7, 0, 0, 5, 1, 8, 1, 0, 0, 0, 0};
        assertEquals(game.getScore(rolls), expectedScore);
    }

}
