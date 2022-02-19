import java.util.ArrayList;
import java.util.Scanner;

public class test {
        public static ArrayList<Course> courses = new ArrayList<Course>();
    public static void main(String[] args) {
        ArrayList <Student>studente=new ArrayList<>();
        String newID = "";
        Scanner input =new Scanner(System.in);
        System.out.println("how many student you want add  :");
        int numberOfStd = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfStd; i++) {

            Student student = new Student();
            System.out.println("Enter the ID of the  student number " + (i + 1) + ": ");
            newID = input.nextLine();
            student.setId(newID);
            System.out.println("set name the owner of the following  " + newID);
            String name = input.nextLine();
            student.setName(name);
            System.out.println("set major the owner of the following " + newID);
            String major = input.nextLine();
            student.setMajor(major);
            System.out.println("set birthdate the owner of the following " + newID);
            String birthdate = input.nextLine();
            student.setBirthdate(birthdate);
            studente.add(student);

        }
        for (int i =0;i<studente.size();i++) {
            System.out.println(studente.get(i));
        }
    }
}
