import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


class count_days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(scan.next());

        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(scan.next());

        long days = ChronoUnit.DAYS.between(date1, date2);
        
        System.out.println("Days between: " + Math.abs(days));
        scan.close();
    }
}
