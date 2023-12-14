import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String number = input.nextLine();

        System.out.print("Enter account holder: ");
        String bankAccountOwner = input.nextLine();

        BankAccount account = new BankAccount(number, bankAccountOwner);
        double value;

        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = input.next();

        if (answer.toLowerCase().equals("y")) {

            System.out.print("Enter initial deposit value: ");
            value = input.nextDouble();
            account.toDeposit(value);
        }

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = input.nextDouble();
        account.toDeposit(deposit);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withDraw = input.nextDouble();
        account.toWithdraw(withDraw);

        System.out.println();

        System.out.println("Updated account data: ");
        System.out.println(account);

    }
}