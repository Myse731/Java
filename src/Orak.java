class Acade{
    String playerName;
    int score;
    static int highScore;

    void setPlayerName(String pn){
        playerName = playerName;
    }

    void play(int es, int combo){
        if (combo >= 1 && combo <= 3) {
            score += es * combo;
            if (score > highScore) {
                highScore = score;
            }
        }
    }

    void printScore(){
        System.out.println(playerName +"의 현재 점수: " + score);
    }

    void printHighScore(){
        System.out.println("전체 최고 점수: " + highScore);
    }
}
public class Orak {
    static void main() {
        Acade luna = new Acade();
        luna.playerName = "루나";
        Acade sol = new Acade();
        sol.playerName = "솔";

        luna.play(100, 3);
        luna.printScore();
        sol.play(250, 2);
        sol.printScore();
        luna.play(200, 2);
        luna.printScore();
        luna.printHighScore();
    }
}
