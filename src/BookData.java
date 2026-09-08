class Booksdata{
    String title;
    int price;

    Booksdata(){};
    Booksdata(String title, int price){
        this.title = title;
        this.price = price;
    }

    Booksdata copy(Booksdata original){
        Booksdata tmp = new Booksdata();
        tmp.price = price;
        tmp.title = title;
        return tmp;
    }

    static void main() {
        Booksdata bk = new Booksdata("어린왕자", 25000);
        Booksdata tmp = bk.copy(bk);
        bk.price = 30000;
        System.out.println("원본 가격: " + bk.price);
        System.out.println("복사복 가격: " + tmp.price);
    }
}