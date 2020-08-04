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

    @Test
    void should_calculate_score_when_there_is_a_strike_before_10th_frame() {
        int expectedScore = 46;
        int[] rolls = {0, 1, 10, 0, 0, 4, 5, 0, 0, 7, 0, 0, 5, 1, 8, 1, 0, 0, 0, 0};
        assertEquals(game.getScore(rolls), expectedScore);
    }

    @Test
    void should_calculate_score_when_there_is_a_spare_before_10th_frame() {
        int expectedScore = 50;
        int[] rolls = {0, 1, 5, 5, 4, 4, 5, 0, 0, 7, 0, 0, 5, 1, 8, 1, 0, 0, 0, 0};
        assertEquals(game.getScore(rolls), expectedScore);
    }

    @Test
    void should_calculate_score_when_there_is_a_strike_in_10th_frame() {
        int expectedScore = 64;
        int[] rolls = {0, 1, 5, 5, 4, 4, 5, 0, 0, 7, 0, 0, 5, 1, 8, 1, 0, 10, 0, 4};
        assertEquals(game.getScore(rolls), expectedScore);
    }

    @Test
    void should_calculate_score_when_there_is_a_spare_in_10th_frame() {
        int expectedScore = 71;
        int[] rolls = {0, 1, 5, 5, 4, 4, 5, 0, 0, 7, 0, 0, 5, 1, 8, 1, 0, 6, 4, 6, 5};
        assertEquals(game.getScore(rolls), expectedScore);
    }

    @Test
    void should_calculate_score_for_normal_scene() {
        int expectedScore = 64;
        int[] rolls = {0, 1, 5, 5, 4, 4, 5, 0, 0, 7, 10, 0, 5, 1, 8, 1, 0, 6, 3, 5};
        assertEquals(game.getScore(rolls), expectedScore);
    }
}
