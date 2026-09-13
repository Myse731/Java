class GameCharacter{
    String name;
    int level;
    int hp;

    GameCharacter(String name, int level, int hp){
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    GameCharacter(GameCharacter n){
        this(n.name, n.level, n.hp);
    }

    void printInfo(String label) {
        System.out.println(label + ": " + name + ", 레벨 " + level + ", 체력 " + hp);
    }
}
public class GameMain {
    static void main() {
        GameCharacter original = new GameCharacter("기사", 10, 500);
        GameCharacter copy = new GameCharacter(original);

        original.hp = 100;
        original.printInfo("원본");
        copy.printInfo("복사본");
    }
}
