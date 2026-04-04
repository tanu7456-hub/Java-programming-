// practical 3 : to calculate the age of a person and display the age in th eform of years, months and days.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
class AgeCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth date (YYYY-MM-DD): ");
        int year =sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

    }
}