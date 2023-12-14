import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double value;

        System.out.print("Enter account number: ");
        String number = input.nextLine();

        System.out.print("Enter account holder: ");
        String bankAccountOwner = input.nextLine();


        BankAccount account = new BankAccount(number, bankAccountOwner);

        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = input.next();

        if (answer.toLowerCase().equals("y")) {

            System.out.print("Enter initial deposit value: ");
            value = input.nextDouble();
            account.toDeposit(value);
        }

        System.out.println(account);

    }
}