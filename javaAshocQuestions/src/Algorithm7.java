import java.util.Scanner;

public class Algorithm7 {
    public static void main(String[] args) {
        int i;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number :");
        i = s.nextInt();

        while (i >= 0){
            System.out.println("While Number is : "+i);
            i--;
        }

        int x = 10;
        do{
            System.out.println("Do While Number is :" +x);
            x = x-1;
        }while (x >= 0);
    }
}
