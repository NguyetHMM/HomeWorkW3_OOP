package dateupdate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
    private int date;
    private int month;
    private int year;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    // Contructor set My Date by the current date
    public MyDate() {
        Calendar cal = Calendar.getInstance();
        setDate(cal.get(Calendar.DAY_OF_MONTH));
        setMonth(cal.get(Calendar.MONTH) + 1);
        setYear(cal.get(Calendar.YEAR));
    }

    // Write method in My Date to print the String version of the current date
    public void printCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public void printDate() {
        System.out.println("Your date is: " + getDate() + " / " + getMonth() + " / " + getYear());
    }


    public void enterDate() {
        Scanner sc = new Scanner(System.in);
        int d, m, y, maxday;
        d = m = y = 0;


        do {
            System.out.print("Enter your month: ");
            m = sc.nextInt();
            if (m < 1 || m > 12) System.out.println("Invalid Month!");
        } while (m < 1 || m > 12);
        setMonth(m);


        do {
            System.out.print("Enter your year: ");
            y = sc.nextInt();
            if (y < 0) System.out.println("Invalid Year!");
        } while (y < 0);
        setYear(y);


        do {
            System.out.print("Enter your date: ");
            d = sc.nextInt();
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
                maxday = 31;
            else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    maxday = 29;
                else
                    maxday = 28;
            } else
                maxday = 30;

            if (d < 1 || d > maxday) System.out.println("Invalid Date!");
        } while (d < 1 || d > maxday);
        setDate(d);
    }

    public MyDate(String str) {
        switch (str.trim()) {
            case "January":
            case "1":
            case "Jan":
                this.setMonth(1);
                break;
            case "February":
            case "2":
            case "Feb":
                this.setMonth(2);
                break;
            case "March":
            case "3":
            case "Mar":
                this.setMonth(3);
                break;
            case "April":
            case "4":
            case "Apr":
                this.setMonth(4);
                break;
            case "May":
            case "5":
                this.setMonth(5);
                break;
            case "June":
            case "Jun":
            case "6":
                this.setMonth(6);
                break;
            case "July":
            case "Jul":
            case "7":
                this.setMonth(7);
                break;
            case "August":
            case "8":
            case "Aug":
                this.setMonth(8);
                break;
            case "September":
            case "9":
            case "Sep":
                this.setMonth(9);
                break;
            case "October":
            case "10":
            case "Oct":
                this.setMonth(10);
                break;
            case "November":
            case "11":
            case "Nov":
                this.setMonth(11);
                break;
            case "December":
            case "12":
            case "Dec":
                this.setMonth(12);
                break;
            default:
                this.setMonth(0);
        }
        if (this.getMonth() != 0) {
            System.out.println("Your have entered a month " + str);
        } else {
            int n = str.length();
            String s = str.substring(n - 2, n);
            if (s.equals("st") || s.equals("nd") || s.equals("rd") || s.equals("th")) {
                System.out.println("Your have entered a day " + str);
            } else {
                System.out.println("Your have entered a year " + str);
            }
        }
    }

}

