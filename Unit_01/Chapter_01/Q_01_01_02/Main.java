package Unit_01.Chapter_01.Q_01_01_02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        double H = scannerObj.nextDouble();
        double W = scannerObj.nextDouble();

        double area = (H * W);

        System.out.println(area);

        scannerObj.close();
    }
}
