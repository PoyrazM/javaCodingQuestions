public class MethodQ1 {
    public static void main(String[] args) {
        System.out.println(greet("Mert"));
        System.out.println(greet("Emre"));
    }

    public static String greet(String name){
       return "Hello ," + name + ". Welcome to the Java.";
    }
}
