package Unit_02.Chapter_02.Q_02_02_04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int balance = 500;
        int dailyLimit = 250;
        
        String P = scannerObj.nextLine();

        if (P.length() != 4) {
            System.out.println("Invalid PIN length entered. Goodbye.");
        } else {
            System.out.println("New PIN stored.");
            
            String pTwo = scannerObj.nextLine();
            
            if (pTwo.length() != 4) {
                System.out.println("Invalid PIN length entered. Goodbye.");
            } else if (!pTwo.equals(P)) {
                System.out.println("Invalid PIN entered. Goodbye.");
            } else {
                int M = scannerObj.nextInt();
                
                if (M > balance) {
                    System.out.println("Insufficient funds. Goodbye.");
                } else if (M > dailyLimit) {
                    System.out.println("Exceeds daily limit. Goodbye.");
                } else {
                    balance -= M;
                    System.out.println("Withdrawal approved.");
                    System.out.println("Balance: $" + balance);
                }
            }
        }
        
        scannerObj.close();
    } 
}