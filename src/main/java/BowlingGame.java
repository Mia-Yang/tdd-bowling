public class BowlingGame {
    public static final int MaxScore = 10;
    private int[] rolls = new int[21];
    private int rollIndex = 0;

    public void roll(int pins) {
        rolls[rollIndex] = pins;
        rollIndex++;
    }

    public int getScore() {
        int score = 0;
        int roll = 0;

        for (int frame = 0; frame < 10; frame++) {
            score += rolls[roll] + rolls[roll + 1];
            roll += 2;
        }
        return score;
    }

    private boolean isStrike(int roll) {
        return rolls[roll] == 10;
    }

    private boolean isSpare(int roll) {
        return rolls[roll] + rolls[roll + 1] == 10;
    }

}
