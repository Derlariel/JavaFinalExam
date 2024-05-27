package Interface;
import java.util.Random;

public class MainInterface {
    public static void main(String[] args) {
//    car();
//    bus();
    carSection();
    }
        static void car(){
        Car car = new Car();
            System.out.println(car.cashRate());

            Vehicle v = new Car();
            System.out.println(v.ePassRate());
        }
        static void bus(){
        Bus b1 = new Bus();
            System.out.println(b1.cashRate());
        }
        static void carSection(){
        Vehicle car = null;
        for (int i = 0; i < 20 ; i++) {
            int r = randomBetween(0,2);
            switch (r) {
                case 0:
                    car = new Car();
                    break;
                case 1:
                    car = new Truck();
                    break;
                case 2:
                    car = new Bus();
                    break;
                default:
                    car = new Car();
            }
            int payMentType = randomBetween(0,1);
            int rate = 0;
            if (payMentType == 0){
                rate = car.cashRate();
                System.out.printf("Vehicle type = %S, rate(cash) = %d\n",car.getClass().getName(),rate);
            }else {
                rate = car.ePassRate();
                System.out.printf("Vehicle type = %S, rate(ePass) = %d\n",car.getClass().getName(),rate);
            }

        }
        }
        public static int randomBetween(int fromNumber,int toNumber){
        Random r = new Random();
        return r.nextInt(toNumber + 1 - fromNumber) + fromNumber;
        }
}
