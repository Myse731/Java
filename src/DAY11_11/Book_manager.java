package DAY11_11;

public class Book_manager {
    static class Book {
        String t;
        String au;
        int p;
        static int count = 0;

        Book(String title, String author, int price){
            this.t = title;
            this.au = author;
            this.p = price;
            count += 1;
        }

        Book(String title){
            this(title, "작자 미상", 10000);
            count += 1;
        }

        int discountPrice(int rate){
            return (p * (100 - rate) / 100);
        }

        int discountPrice(){
            return discountPrice(10);
        }

        static Book cheaper(Book a, Book b){
            if(a.p == b.p){
                return a;
            }
            else{
                if(a.p < b.p){
                    return a;
                }
                else{
                    return b;
                }
            }
        }

        @Override
        public String toString(){
            return "[" + this.t +"] " + this.au + " / " + this.p + "원";
        }

    }
    static void main() {
        Book b1 = new Book("자바의 정석", "남궁성", 30000);
        Book b2 = new Book("어린 왕자");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("할인가: " + b1.discountPrice(20));
        System.out.println("기본 할인가: " + b2.discountPrice());
        System.out.println("더 저렴한 책: " + Book.cheaper(b1, b2));
        System.out.println("등록된 책: " + Book.count + "권");
    }
}
