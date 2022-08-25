public class Algorithm5 {
    public static void main(String[] args) {
        String[] studentNames = {"John" , "David" , "Henry" , "Bob" , "Victor"};
        int[] studentAge = {25 , 32 , 29 , 39 , 40};
        double[] studentGrade = {4.0 , 3.25 , 3.0 , 2.9 , 3.5 };

        String[] studentSubjects = new String[5];
        studentSubjects[0] = "Computer Science";
        studentSubjects[1] = "Sociology";
        studentSubjects[2] = "History";
        studentSubjects[3] = "Biology";
        studentSubjects[4] = "English";

        System.out.println(studentNames[0]);
        System.out.println(studentNames[2]);
        System.out.println(studentNames[4]);
        System.out.println(studentAge[0]);
        System.out.println(studentAge[4]);
        System.out.println(studentGrade[3]);
        System.out.println(studentSubjects[4]);
    }
}
