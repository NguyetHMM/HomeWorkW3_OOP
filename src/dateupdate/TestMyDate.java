package dateupdate;
import dateupdate.*;
import java.text.ParseException;
public class TestMyDate {
    public static void main(String[] args) {
        MyDate mydate1 = new MyDate();
        mydate1.printDate();
        mydate1.printCurrentDate();

        MyDate mydate2 = new MyDate(8, 9, 1999);

        MyDate mydate3 = new MyDate("September");

        try {
            DateUtils.CompareDate(mydate1, mydate2);
            DateUtils.DateSort();
        } catch (Exception e) {
        }
    }
}
