public class StringInterpolationQuestion {
    public static void main(String[] args){
        String studentName = "Kevin";
        String streetName = "4131 California Avenue";
        int age = 18;
        String city = "Los Angeles";
        String state = "California";
        String zipCode = "90812";
        String country = "United States";

        System.out.println(String.format("Student Details : name: %s , Address: %s , age: %d , City: %s , State: %s ," +
                        " ZipCode: %s , Country: %s" , studentName ,streetName , age , city , state , zipCode , country));
    }
}
