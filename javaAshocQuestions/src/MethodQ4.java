import java.util.Scanner;

public class MethodQ4 {
    public static void main(String[] args){
        int number;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number :");

        number = s.nextInt();

        System.out.println("Is Number Even ? :" +isEven(number));

    }

    public static boolean isEven(int number){
        if (number %2 == 0){
            return true;
        }
        return false;
    }

}
