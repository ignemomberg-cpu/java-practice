package Unit_02.Chapter_03.Q_02_03_04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int A = Integer.parseInt(scannerObj.nextLine());
        int B = Integer.parseInt(scannerObj.nextLine());
        int K = Integer.parseInt(scannerObj.nextLine());
    
        for (int i = A; i <= B; i += K ) {
            System.out.println(i);
        }
        
        scannerObj.close();
    }
}
