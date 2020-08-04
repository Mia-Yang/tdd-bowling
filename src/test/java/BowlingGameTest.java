import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    public final BowlingGame game = new BowlingGame();
    @Test
    void should_have_zero_score_when_rolling_zero_each_roll() {
        int rolls = 20;
        int pins = 0;
        int expectedScore = 0;
        rollNtimes(rolls, pins);
        assertEquals(game.getScore(), expectedScore);
    }


    private void rollNtimes(int times, int pins) {
        for(int i = 0; i < times; i++) {
            game.roll(pins);
        }
    }

}
