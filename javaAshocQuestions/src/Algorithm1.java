import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args){
        int x ;

        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen Bir sayı giriniz : ");
        x = s.nextInt();

        if (x < 0){
            System.out.println("Negatif sayı");
        }else if (x > 0){
            System.out.println("Pozitif sayı");
        }else {
            System.out.println("Sıfır");
        }
    }
}
