public class BowlingGame {
    public static final int MAX_SCORE = 10;
    private int rollIndex = 0;

    public int getScore(int[] rolls) {
        int score = 0;
        int rollIndex = 0;
        for (int i = 0; i < 10; i++) {
            score += rolls[rollIndex] + rolls[rollIndex + 1];
            rollIndex += 2;
        }
        return score;
    }

}
