import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double value;

        System.out.printf("Enter account number: ");
        String number = input.next();

        System.out.printf("Enter account holder: ");
        String bankAccountOwner = input.nextLine();

        BankAccount account = new BankAccount(number, bankAccountOwner);

        System.out.printf("Is there an initial deposit (y/n)? ");
        String answer = input.next();

        if (answer.toLowerCase().equals("y")) {
            
            System.out.printf("Enter initial deposit value: ");
            value = input.nextDouble();
            account.toDeposit(value);
        }


    }
}