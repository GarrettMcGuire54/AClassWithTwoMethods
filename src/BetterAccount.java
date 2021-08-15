import java.util.Random;
import java.text.NumberFormat;
import static java.lang.System.out;


public class BetterAccount {
    String lastName;
    int id;
    double balance;

    void fillWithData () {
        Random myRandom = new Random();

        lastName = "" +
                (char) (myRandom.nextInt(26) + 'A') +
                (char) (myRandom.nextInt(26) + 'a') +
                (char) (myRandom.nextInt(26) + 'a');

        id = myRandom.nextInt(10000);
        balance = myRandom.nextInt(10000);
    }

    void display() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        out.print("The account with the last name ");
        out.print(lastName);
        out.print(" and ID Number ");
        out.print(id);
        out.print(" has a balance of ");
        out.println(currency.format(balance));

    }
}
