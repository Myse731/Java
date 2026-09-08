class Card2 {
    String k;
    int num;

    Card2() {
        this.k = null;
        this.num = 0;
    }

    Card2(String k, int num) {
        this.k = k;
        this.num = num;
    }

    static void main() {
        Card2 card2 = new Card2("H", 3);

    }
}