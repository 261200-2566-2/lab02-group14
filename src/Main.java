// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AirPurifier A = new AirPurifier("pro","11");
        AirPurifier b = new AirPurifier("S-pro","79");
        AirPurifier c = new AirPurifier("S-pro","555");
        System.out.println("This Airpurifier Model is : " + A.model);
        System.out.println(A.fanspeed);
        System.out.println(A.power);
        A.turnOn();
        System.out.println(A.power);
        A.turnOff();
        System.out.println(A.power);
        System.out.println( AirPurifier.getModelCount());
        System.out.println(A.fanspeed);
        System.out.println( AirPurifier.mostPopularModel());
        System.out.println(b.power);
        }
    }



