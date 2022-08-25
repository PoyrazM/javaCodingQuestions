public class ForEachQuestion {
    public static void main(String[] args){
        String[] celebrities = {"Bruno Mars" , "Taylor Swift" , "Max Smith" , "Eminem"};

        for (String name:celebrities) {
            System.out.print(name);
            System.out.print(",");
        }

        System.out.println("\n");

        int[] age = {28 , 22 , 24 ,43};
        for (int x:age){
            System.out.print(x);
            System.out.print(",");
        }
    }
}
