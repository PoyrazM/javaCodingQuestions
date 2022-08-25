import java.util.Scanner;

public class MethodQ3 {
    public static void main(String[] args) {
        int birthYear;
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your birth year :");
        birthYear = s.nextInt();

        if (birthYear > 2022) {
            System.out.println("Please enter valid value !!");
        } else if (birthYear < 0){
            System.out.println("Please enter valid value !!");
        }else {
            System.out.println("Your age is :\t" + findAge(birthYear));
        }
    }

    public static int findAge(int year){
        int age = 2022 - year;
        return age;
    }
}
