import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class MyDate {

    LocalDate localDate;


    MyDate(int month, int day, int year) {
        localDate = LocalDate.of(year, month, day);
    }

    MyDate(String month, int day, int year) {
        int monthInNumber = Month.valueOf(month.toUpperCase()).getValue();
        localDate = LocalDate.of(year, monthInNumber, day);
    }

    MyDate(int day, int year) {
        localDate = LocalDate.ofYearDay(year, day);
    }

    public void returnDate() {
        System.out.println("MM/dd/yyyy: " + localDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println("MMMM dd,yyyy:" + localDate.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy")));
        System.out.println("DDD yyyy:" + localDate.format(DateTimeFormatter.ofPattern("DDD yyyy")));
    }

    public static void main(String[] args) {
        MyDate myDate;

        Scanner scanner = new Scanner(System.in);
        int month, day, year, dayOfYear;
        String monthString;

        String response = "y";
        do {
            System.out.println(" Enter 1 for format: MM/DD/YYYY\n" + "Enter 2 for format: Month DD, YYYY\n"
                    + "Enter 3 for format: DDD YYYY\n" + "Enter 4 to exit");
                    int choice = scanner.nextInt();

            System.out.println("Choose your Choice :");
            

            System.out.println("Choice: " + choice);
            switch (choice) {
            case 1:
                System.out.println("Enter Month:");
                month = scanner.nextInt();
                System.out.println("Enter Day:");
                day = scanner.nextInt();
                System.out.println("Enter Year:");
                year = scanner.nextInt();
                myDate = new MyDate(month, day, year);
                myDate.returnDate();
                break;
            case 2:
                System.out.println("Enter Month in text:");
                monthString = scanner.next();
                System.out.println("Enter Day:");
                day = scanner.nextInt();
                System.out.println("Enter Year:");
                year = scanner.nextInt();
                myDate = new MyDate(monthString, day, year);
                myDate.returnDate();
                break;
            case 3:
                System.out.println("Enter Day of Year:");
                dayOfYear = scanner.nextInt();
                System.out.println("Enter Year:");
                year = scanner.nextInt();
                myDate = new MyDate(dayOfYear, year);
                myDate.returnDate();
                break;
            case 4:
                System.exit(0); // exit from and terminate the program
            default:
                System.out.println("Wrong choice");
            }
            System.out.println("Do you want to Continue (y/n):");
            response = scanner.next();
        }while(response.equalsIgnoreCase("Y"));
        scanner.close();
        System.out.println("Exiting");
    }

}