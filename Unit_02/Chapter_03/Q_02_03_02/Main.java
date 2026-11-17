package Unit_02.Chapter_03.Q_02_03_02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        
        String S = scannerObj.nextLine().toUpperCase();

        int countR = 0;
        int countS = 0;
        int countT = 0;
        int countL = 0;
        int countN = 0;
        int countE = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == 'R') {
                countR++;
            } else if (ch == 'S') {
                countS++;
            } else if (ch == 'T') {
                countT++;
            } else if (ch == 'L') {
                countL++;
            } else if (ch == 'N') {
                countN++;
            } else if (ch == 'E') {
                countE++;
            }
        }
        
        System.out.println("R: " + countR);
        System.out.println("S: " + countS);
        System.out.println("T: " + countT);
        System.out.println("L: " + countL);
        System.out.println("N: " + countN);
        System.out.println("E: " + countE);

        scannerObj.close();
    }
}
