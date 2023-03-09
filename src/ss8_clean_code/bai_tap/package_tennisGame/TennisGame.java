package ss8_clean_code.bai_tap.package_tennisGame;

public class TennisGame {
    static String score = "";
    static int tempScore=0;

    public static String getScore(String player1, String player2, int score1, int score2) {
        if (score1==score2) {
            checkScore(score1);
        }
        else if (score1 >= 4 || score2 >= 4) {
            checkMinus(score1, score2);
        }
        else {
            checkTempScore(score1, score2);
        }
        return score;
    }
    public static String checkScore(int score1){
        switch (score1) {
            case 0:
                return score = "Love-All";
            case 1:
                return score = "Fifteen-All";
            case 2:
                return score = "Thirty-All";
            case 3:
                return score = "Forty-All";
            default:
                return score = "Deuce";
        }
    }
    public static String checkMinus(int score1, int score2) {
        int minusResult = score1 - score2;
        if (minusResult == 1) {
            return score = "Advantage player1";
        } else if (minusResult == -1) {
            return score = "Advantage player2";
        } else if (minusResult >= 2) {
            return score = "Win for player1";
        }
        else {
            return score = "Win for player2";
        }
    }
    public static String checkTempScore(int score1, int score2){
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = score1;
            }
            else {
                score += "-";
                tempScore = score2;
            }
            switch(tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return null;
    }
}