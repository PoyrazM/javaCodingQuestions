import java.util.Scanner;

public class MethodQ2 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number 1 :");
        number1 = s.nextInt();

        System.out.println("Please enter number 2 :");
        number2 = s.nextInt();

        double sum = add(number1 , number2);
        System.out.println("Sum is :" +sum);
    }

    public static double add(int num1 , int num2){
        double total = num1 + num2;
        return total;
    }
}
