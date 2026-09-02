class Temp{
    double temperature;
    void setTemperature(double t){
        temperature = t;
    }

    void increase(){
        temperature +=1;
    }

    double toFahrenheit(){
        return (temperature * 9 / 5) + 32;
    }

    boolean isFreezing(){
        if(temperature <= 0){
            return true;
        }
        else{
            return false;
        }
    }

    void printTemperature(){
        System.out.print("섭씨: " + temperature +"도, ");
        System.out.print("화씨: " + toFahrenheit() +"도, ");
        System.out.print("결빙: " + isFreezing());
    }
}
public class Temperature{
    static void main() {
        Temp tp = new Temp();
        tp.setTemperature(20);
        tp.increase();
        tp.increase();
        tp.printTemperature();
    }
}