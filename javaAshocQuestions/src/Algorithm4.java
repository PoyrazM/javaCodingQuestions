import java.util.Scanner;

public class Algorithm4 {
    public static void main(String[] args) {
        String grade;

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your grade :");
        grade = s.next();

        switch (grade) {
            case "A+" : case "A" : case "A-" :
                System.out.println("Great Student");
            break;
            case "B+" : case "B" : case "B-" :
                System.out.println("Good Student");
            break;
            case  "C+" : case "C" : case "C-" :
                System.out.println("Poor Student");
            break;
            case  "D+" : case "D" : case "D-" :
                System.out.println("Very Poor Student");
            break;
            case "F" :
                System.out.println("Failed Student");
            break;
            default:
                System.out.println("Invalid Grade");
            break;
        }
    }
}
