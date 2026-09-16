package hw1;
class Room{
    int roomNumber;
    int price;
    Room(int roomNumber, int price){
        this.price = price;
        this.roomNumber = roomNumber;
    }
}

class SuiteRoom extends Room{
    int livingRooms;
    SuiteRoom(int livingRooms, int roomNumber, int price){
        super(roomNumber, price);
        this.livingRooms = livingRooms;
    }

    void printInfo(){
        System.out.print(roomNumber + "호, ");
        System.out.print("가격: " + price + "원, ");
        System.out.print("거실: " + livingRooms +"개");
    }
}
public class HotelMain {
    static void main() {
        SuiteRoom sr = new SuiteRoom(2, 701, 350000);
        sr.printInfo();
    }
}
