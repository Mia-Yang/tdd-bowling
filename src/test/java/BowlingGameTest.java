import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    public final BowlingGame game = new BowlingGame();

    @Test
    void should_have_zero_score_when_rolling_zero_each_roll() {
        int rolls = 20;
        int pins = 0;
        int expectedScore = 0;
        rollNTimes(rolls, pins);
        assertEquals(game.getScore(), expectedScore);
    }

    @Test
    void rolling_one_each_role_should_have_twenty_score() {
        int rolls = 20;
        int pins = 1;
        int expectedScore = 20;
        rollNTimes(rolls, pins);
        assertEquals(game.getScore(), expectedScore);
    }

    @Test
    void should_calculate_score_when_meeting_a_spare() {
        int expectedScore = 18;
        game.roll(4);
        game.roll(6);//spare
        game.roll(4);
        rollNTimes(17, 0);
        assertEquals(game.getScore(), expectedScore);
    }

    private void rollNTimes(int times, int pins) {
        for (int i = 0; i < times; i++) {
            game.roll(pins);
        }
    }
}
