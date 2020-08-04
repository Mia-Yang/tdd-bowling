public class BowlingGame {
    public static final int MAX_SCORE = 10;
    private final int[] rolls = new int[21];
    private int rollIndex = 0;

    public void roll(int pins) {
        rolls[rollIndex] = pins;
        rollIndex++;
    }

    public int getScore() {
        int score = 0;
        int rollIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (isStrike(rolls[rollIndex])) {
                score = calculateStrike(score, rollIndex);
                rollIndex++;
            } else if (isSpareInFrame(rollIndex)) {
                score = calculateSpare(score, rollIndex);
                rollIndex += 2;
            } else {
                score += rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }

        }
        return score;
    }
    private int calculateStrike(int score, int roll) {
        score += 10 + rolls[roll + 1] + rolls[roll + 2];
        return score;
    }

    private boolean isStrike(int roll) {
        return roll == MAX_SCORE;
    }

    private boolean isSpareInFrame(int roll) {
        return rolls[roll] + rolls[roll + 1] == MAX_SCORE;
    }

    private int calculateSpare(int score, int roll) {
        score += MAX_SCORE + rolls[roll + 2];
        return score;
    }
}
