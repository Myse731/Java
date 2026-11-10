package Clone_String;

class Point2 {
    int x;
    int y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle implements Cloneable {
    Point2 p;       // 원의 중심
    double r;       // 반지름

    Circle(Point2 p, double r) {
        this.p = p;
        this.r = r;
    }

    Circle shallowCopy() {
        Circle c = null;
        try {
            c = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return c;
    }

    // deepCopy() 메서드를 여기에 작성하세요.
    Circle deepCopy(){
        Circle c = null;
        try{
            c = (Circle) super.clone();
            c = new Circle(new Point2(this.p.x, this.p.y), this.r);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public String toString() {
        return "[p=" + p + ", r=" + r + "]";
    }
}

class CircleCopyEx {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point2(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();
        System.out.println("== 출력결과 ==");
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("= c1의 변경 후 =");
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }
}