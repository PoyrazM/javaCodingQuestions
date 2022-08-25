import java.util.Scanner;

public class Algorithm2 {
    public static void main(String[] args) {
        double account_balance ;
        int age ;
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your account balance :");
        account_balance = s.nextDouble();

        System.out.println("Please enter your age :");
        age = s.nextInt();


        if (account_balance >= 1000000 || age >= 65){
            System.out.println("You can retire now. Good Luck !");
        }else {
            System.out.println("You still need to save money for your retirement.");
        }
    }
}
