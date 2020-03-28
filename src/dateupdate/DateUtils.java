package dateupdate;

import dateupdate.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DateUtils {
    public static void CompareDate(MyDate date1, MyDate date2) throws ParseException{
        if (date1.getYear() < date2.getYear()) {
            date1.printDate() ;
            System.out.print(" before ");
            date2.printDate();
        } else if (date1.getYear() > date2.getYear()) {
            date1.printDate() ;
            System.out.print(" after ");
            date2.printDate();
        } else {
            if (date1.getMonth() < date2.getMonth()) {
                date1.printDate() ;
                System.out.print(" before ");
                date2.printDate();
            } else if (date1.getMonth() > date2.getMonth()) {
                date1.printDate() ;
                System.out.print(" after ");
                date2.printDate();
            } else {
                if (date1.getDate() < date2.getDate()) {
                    date1.printDate() ;
                    System.out.print(" before ");
                    date2.printDate();
                } else if (date1.getDate() > date2.getDate()) {
                    date1.printDate() ;
                    System.out.print(" after ");
                    date2.printDate();
                } else {
                    date1.printDate() ;
                    System.out.print(" and ");
                    date2.printDate();
                    System.out.print(" are the same ");
                }
            }
        }

    }

    public static void DateSort() throws ParseException {
        Scanner sc = new Scanner(System.in);
        Date date[];
        String str[];
        System.out.println("Enter the number of days which you want to sort:");
        int i, n = sc.nextInt();
        str = new String[n];
        date = new Date[n];
        sc.nextLine();

        for (i = 0; i < n; i++) {
            System.out.print("Enter day: [dd-mm-yyyy]: ");
            str[i] = sc.nextLine();
        }
        SimpleDateFormat sobj = new SimpleDateFormat("dd-MM-yyyy");

        for (i = 0; i < n; i++) {
            date[i] = sobj.parse(str[i]);
        }

        Arrays.sort(date);

        for (Date date1 : date) {
            System.out.println(sobj.format(date1));
        }

    }
}
