package Unit_02.Chapter_03.Q_02_03_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        
        int N = Integer.parseInt(scannerObj.nextLine());
    
        for (int i = 0; i < N ; i++) {
            System.out.println("meow");
        }
       
        scannerObj.close();
    }
}
