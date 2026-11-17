package Unit_02.Chapter_03.Q_02_03_05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int S = Integer.parseInt(scannerObj.nextLine());

        for (int i = S; i >= 1 ; i--) {
            System.out.println(i);
        }

        System.out.println("Lift off! We have lift off! Good luck Luna!");

        scannerObj.close();
    }
}