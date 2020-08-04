public class BowlingGame {
    public static final int MAX_SCORE = 10;
    private int rollIndex = 0;

    public int getScore(int[] rolls) {
        int score = 0;
        int rollIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (isStrike(rolls[rollIndex])) {
                score += MAX_SCORE + rolls[rollIndex + 2] + rolls[rollIndex + 3];
            } else {
            score += rolls[rollIndex] + rolls[rollIndex + 1];
            }
            rollIndex += 2;
        }
        return score;
    }

    public boolean isStrike(int roll) {
        return roll == MAX_SCORE;
    }


}
