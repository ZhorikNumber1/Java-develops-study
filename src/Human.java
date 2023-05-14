import java.util.Date;

import static java.lang.System.out;

public class Human {
    String Name, Surname;
    int HB;

    public Human(String Name, String Surname, int HB) {
        this.Name = Name;
        this.Surname = Surname;
        this.HB = HB;

    }
public static void Info(String Name, String Surname, int HB){
    Date current = new Date(123);
    int year = current.getYear();
    out.println(Name);
    out.println(Surname);
    out.println(year+1900-HB);
}


}
