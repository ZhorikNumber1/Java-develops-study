import static java.lang.System.out;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        Human First = new Human("Pavel", "Zharkov", 2002);
        Human.Info(First.Name, First.Surname, First.HB);

    }
}