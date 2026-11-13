package Unit_02.Chapter_02.Q_02_02_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int N = scannerObj.nextInt();

        if (N % 3 == 0 && N % 5 == 0){
            System.out.println("Fizz Buzz");
        }else if (N % 3 == 0 && N % 5 != 0){
            System.out.println("Fizz");
        }else if (N % 5 == 0 && N % 3 != 0) {
             System.out.println("Buzz");
        } else {
            System.out.println(N);
        }
 scannerObj.close();
    }
}
