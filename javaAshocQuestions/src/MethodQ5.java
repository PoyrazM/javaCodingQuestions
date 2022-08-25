import java.util.Scanner;

public class MethodQ5 {
    public static void main(String[] args) {
        String name;

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your name :");
        name = s.nextLine();

        greet(name);
    }

    public static void greet(String name){
        System.out.println(String.format("Hello Mr/Ms %s" , name + "."));
    }

}
