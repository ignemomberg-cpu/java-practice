package Unit_02.Chapter_02.Q_02_02_08;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int s1 = scannerObj.nextInt();
        int s2 = scannerObj.nextInt();
        int s3 = scannerObj.nextInt();

        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
            System.out.println("not a triangle");
        } else if (s1 == s2 && s2 == s3) {
            System.out.println("equilateral");
        } else if (s1 == s2 || s1 == s3 || s2 == s3) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }

        scannerObj.close();
    }
}