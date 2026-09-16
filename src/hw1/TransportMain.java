package hw1;
class Transport{
    String name;
    int baseFare;

    Transport(String name, int baseFare){
        this.name = name;
        this.baseFare = baseFare;
    }

    int calculateFare(int distance){
        return baseFare;
    }

    void printFare(int distance){
        System.out.println(name + " " + distance + "km" +" 요금: " + calculateFare(distance) + "원");
    }
}

class Bus extends Transport{
    Bus(String name, int baseFare){
        super(name, baseFare);
    }
    int calculateFare(int distance){
        return (distance * 100) + super.calculateFare(distance);
    }
}

class Taxi extends Transport{
    Taxi(String name, int baseFare){
        super(name, baseFare);
    }
    int calculateFare(int distance){
        return (distance * 800) + super.calculateFare(distance);
    }
}

class Subway extends Transport{
    Subway(String name, int baseFare){
        super(name, baseFare);
    }
    int calculateFare(int distance){
        return ((distance - 10) * 50) + super.calculateFare(distance);
    }
}
public class TransportMain {
    static void main() {
        Bus b = new Bus("버스", 1500);
        Taxi t = new Taxi("택시", 4800);
        Subway s = new Subway("지하철", 1400);

        b.printFare(10);
        t.printFare(10);
        s.printFare(10);
    }
}
