public class BowlingGame {
    public static final int MAX_SCORE = 10;

    public int getScore(int[] rolls) {
        int score = 0;
        int times = 0;
        for (int i = 0; i < 10; i++) {
            if (isStrike(rolls[times])) {
                score += MAX_SCORE + rolls[times + 2] + rolls[times + 3];
            } else if (isSpare(rolls, times)) {
                score += MAX_SCORE + rolls[times + 2];
            } else if (i == 9 && isStrike(rolls[times])) {
                score += MAX_SCORE + rolls[times + 1] + rolls[times + 2];
            } else if (i == 9 && isSpare(rolls, times)) {
                score += MAX_SCORE + rolls[times + 2];
            } else {
                score += rolls[times] + rolls[times + 1];
            }
            times += 2;
        }
        return score;
    }

    public boolean isStrike(int roll) {
        return roll == MAX_SCORE;
    }

    public boolean isSpare(int[] rolls, int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1] == MAX_SCORE;
    }
}
