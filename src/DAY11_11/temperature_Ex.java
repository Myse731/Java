package DAY11_11;

public class temperature_Ex {
    static class Thermostat{
        private int temperature = 24;
        public static final int MIN = 16;
        public static final int MAX = 30;

        int getTemperature(){
            return temperature;
        }

        void setTemperature(int t) throws Exception{
            if(t >= MIN && t <= MAX) {
                temperature = t;
            }
            else{
                throw new Exception("설정 가능한 범위는 16~30도입니다: " + t);
            }
        }

        void up() throws Exception {
            setTemperature(temperature + 1);
        }
    }
    static void main() {
        Thermostat t = new Thermostat();
        int[] requests = {26, 35, 15, 30};

        for (int i = 0; i < requests.length; i++) {
            try {
                t.setTemperature(requests[i]);
                System.out.println("설정 완료: " + requests[i] + "도");
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            } finally {
                System.out.println("현재 온도: " + t.getTemperature() + "도");
            }
        }

        try {
            t.up();
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }

    }
}
