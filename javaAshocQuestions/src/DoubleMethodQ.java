public class DoubleMethodQ {
    public static void main(String[] args) {
        // Different 5 sum values.

        String x = "Sum is :\t";
        System.out.println(x + add(2.5 , 3.5));
        System.out.println(x + add(250500 , 4556.465));
        System.out.println(x + add(-251.5 , -665.65));
        System.out.println(x + add(850 , 454));
        System.out.println(x + add(-5456.465 , -548.4));
    }

    public static double add(double number1 , double number2){
        return number1 + number2;
    }
}
