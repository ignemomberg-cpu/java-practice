package Unit_02.Chapter_03.Q_02_03_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int N = Integer.parseInt(scannerObj.nextLine());
        int firstNum = Integer.parseInt(scannerObj.nextLine());
        int min = firstNum;
        int max = firstNum;

        for (int i = 1; i < N; i++) {
            int current = Integer.parseInt(scannerObj.nextLine());

            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        scannerObj.close();
    }
}