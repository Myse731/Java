class Circle{
    int radius;
    double pi = 3.14;

    Circle(){};

    Circle(int r){
        this.radius = r;
    }
    double getArea(){
        double nurbi = pi * radius * radius;
        return nurbi;
    }

    static double toRadius(double diameter){
        double r = diameter / 2;
        return r;
    }
}

public class CircleCalculator{
    static void main() {
        Circle cl = new Circle(5);
        System.out.println("반지름이 5인 원의 넓이: " + cl.getArea());
        System.out.println("지름 20의 반지름: " + cl.toRadius(20));
    }
}