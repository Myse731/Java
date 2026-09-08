class ScoreData {
    static int score;
}

public class PrimitiveParameterMain {
    static void addBonus(ScoreData data, int bonus) {
        if((data.score += bonus) > 100){
            data.score = 100;
        }
        else{
            data.score += bonus;
        }
    }

    public static void main(String[] args) {
        ScoreData data = new ScoreData();
        data.score = 85;

        System.out.println("보너스 적용 전: " + data.score);
        addBonus(data, 20);
        System.out.println("보너스 적용 후: " + data.score);
    }
}