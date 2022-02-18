import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Course> course = new ArrayList<Course>();
        Student student1 = new Student();
        double average = 0;
        String addCourse = "";
        int numberHour = 0;
        int numberGrade = 0;

        System.out.println("Enter your operation (add/delete) student ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().trim();
        if (str.equals("add")) {
            students.add(new Student());
            System.out.print("Enter the ID of the new student :");
            String newID = input.nextLine();
            student1.setId(newID);
            System.out.println("set name the owner of the following  " + newID);
            String name = input.nextLine();
            student1.setName(name);
            System.out.println("set major the owner of the following " + newID);
            String major = input.nextLine();
            student1.setMajor(major);
            System.out.println("set birthdate the owner of the following " + newID);
            String birthdate = input.nextLine();
            student1.setBirthdate(birthdate);
            System.out.println("how many course you want add ");
            int x = input.nextInt();
            input.nextLine();
            for (int i = 0; i < x; i++) {
                System.out.println("add the first Course : " + (i + 1) + "  ID " + newID);
                System.out.println("add number for this course :");
                addCourse = input.nextLine();
//                course1.setCn(addCourse);
                System.out.println("add number of hour for this course");
                numberHour = input.nextInt();
//                course1.setCh(numberHour);
                System.out.println("add number of grade for this course");
                numberGrade = input.nextInt();
                input.nextLine();
//                course1.setGrade(numberGrade);
                course.add(new Course(addCourse,numberHour,numberGrade));
                double y = 0;
                y += numberHour;
                double numerator = 0;
                numerator += numberHour * numberGrade;
                average = numerator / y;

            }
            for (int i =0;i<students.size();i++) {
                System.out.println("ID :  " + student1.getId());
                System.out.println("Name :  " + student1.getName());
                System.out.println("Major  :  " + student1.getMajor());
                System.out.println("Birthdate  :  " + student1.getBirthdate());
            }
           System.out.println("Average  :  " + average);
            System.out.println("Cn\t\t\tCredit Hours\t"+"  Grade");
            for (int i =0;i<course.size();i++) {
                //System.out.println("get average for this ID :" + newID.get+"is "+average);

                System.out.println(course.get(i).getCn()+"\t\t"+course.get(i).getCh()+"\t\t\t     "+course.get(i).getGrade());

            }
        } else if (str.equals("delete"))
            students.remove(0);
    }
}
