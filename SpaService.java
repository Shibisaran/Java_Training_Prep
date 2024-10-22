package Interviewprg;
import java.util.Scanner;

public class SpaService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int headMassagePrice = 5000;
        int facialPrice = 10000;
        int pedicurePrice = 3000;
        
        System.out.print("Do you have a membership? (yes/no): ");
        String membership = scanner.nextLine();

        System.out.println("Choose two services:");
        System.out.println("1. Head Massage");
        System.out.println("2. Facial");
        System.out.println("3. Pedicure");

        System.out.print("Enter first service number: ");
        int firstService = scanner.nextInt();

        System.out.print("Enter second service number: ");
        int secondService = scanner.nextInt();

        int totalPrice = 0;

        if (firstService == 1) {
            totalPrice += headMassagePrice;
        } else if (firstService == 2) {
            totalPrice += facialPrice;
        } else if (firstService == 3) {
            totalPrice += pedicurePrice;
        }

        if (secondService == 1) {
            totalPrice += headMassagePrice;
        } else if (secondService == 2) {
            totalPrice += facialPrice;
        } else if (secondService == 3) {
            totalPrice += pedicurePrice;
        }

        double discount = 0.0;

        if (firstService != secondService) {
            discount = 0.15;
        } else {
            if (membership.equals("yes")) {
                discount = 0.10;
            } else if (membership.equals("no")) {
                discount = 0.05;
            }
        }

        double finalPrice = totalPrice - (totalPrice * discount);

        System.out.printf("Total price after discount: %.0fk\n", finalPrice);
    }
}
