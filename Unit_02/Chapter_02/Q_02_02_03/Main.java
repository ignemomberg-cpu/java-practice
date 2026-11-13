package Unit_02.Chapter_02.Q_02_02_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int H = scannerObj.nextInt();

        if (H >= 80 && H <= 300 ){
            System.out.println("healthy");
        } else if (H >= 60 && H <= 79 ){
            System.out.println("bloody nose");
        } else if (H >= 40 && H <= 59){
            System.out.println("face swollen");
        } else if (H >= 20 && H <= 39){
            System.out.println("eyes bloodshot, face bleeding");
        } else if (H >= 1 && H <= 19) {
            System.out.println("even more blood");
        } else if (H == 0) {
            System.out.println("eyes closed. Game Over");
        }

        scannerObj.close();

    }
}