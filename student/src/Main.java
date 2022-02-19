import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double average = 0;
        String addCourse = "";
        int numberHour = 0;
        int numberGrade = 0;
        int x = 0;
        String newID = "";
        System.out.println("Please select one of the following options:");

       // System.out.println("Enter your operation (add/delete/update) student ");
        System.out.println("    1. Add student");
        System.out.println("    2. Add course");
        System.out.println("    3. delete course and student");
        System.out.println("    4. update student for ");
        System.out.println("    5. Exit");
        while (true) {
            int str01 = input.nextInt();
            switch (str01) {
                case 1: {
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
                        students.add(student);

                    }


                }
                case 2: {
                    System.out.println("how many course you want add ");
                    x = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < x; i++) {
                        Course course = new Course();
                        System.out.println("add the  Course  " + (i + 1) + " :");
                        System.out.println("add number for this course :");
                        addCourse = input.nextLine();
                        course.setCn(addCourse);
//                course1.setCn(addCourse);
                        System.out.println("add number of hour for this course");
                        numberHour = input.nextInt();
                        course.setCh(numberHour);
//                course1.setCh(numberHour);
                        System.out.println("add number of grade for this course");
                        numberGrade = input.nextInt();
                        input.nextLine();
                        course.setGrade(numberGrade);
                        courses.add(course);
                        double y = 0.0;
                        y += numberHour * 1.0;
                        double numerator = 0.0;
                        numerator += numberHour * numberGrade * 1.0;
                        average = numerator / y;
                        System.out.println("Average  :  " + average);

                    }
                    print();
                    System.out.println();
                    System.out.println();
                    tableOfCourse();
                    break;
                }
                case 3: {
                    deleteStudent();
                    deleteCourse();
                    break;
                }
                case 4:
                    update();
                    break;
                case 5:
                    System.out.println("Bye bye!");
                    System.exit(0);
            }


        }

    }

    public static void print() {
        for (Student student : students) {
            System.out.println("ID :  " + student.getId());
            System.out.println("Name :  " + student.getName());
            System.out.println("Major  :  " + student.getMajor());
            System.out.println("Birthdate  :  " + student.getBirthdate());
            System.out.println("-----------------------------");
        }

    }

    public static void tableOfCourse() {
        System.out.println("Cn\t\t  Credit Hours\t\t" + "   Grade");
        for (Course cours : courses) {
            //System.out.println("get average for this ID :" + newID.get+"is "+average);
            System.out.println(cours.getCn().trim() + "\t\t" + cours.getCh() + "\t\t\t     " + cours.getGrade());

        }
    }

    public static void update() {
        System.out.println("Enter number of student for update ");

        int INT = input.nextInt();
        for (int i = 0; i < students.size(); i++) {
            System.out.print("Enter the ID of the new student :");
            String updateNewID = input.nextLine();
            students.get(INT).setId(updateNewID);
            System.out.println("set name the owner of the following  " + updateNewID);
            String UpdateName = input.nextLine();
            students.get(INT).setName(UpdateName);
            System.out.println("set major the owner of the following " + updateNewID);
            String updateMajor = input.nextLine();
            students.get(INT).setMajor(updateMajor);
            System.out.println("set birthdate the owner of the following " + updateNewID);
            String updateBirthdate = input.nextLine();
            students.get(INT).setBirthdate(updateBirthdate);
        }
    }

    public static void deleteCourse() {
        System.out.print("Enter the ID number for student you want deleted  :");
        String str0 = input.nextLine().trim();
        a:
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(str0)) ;
            students.remove(i);
            System.out.println("delete student successfully they have index (" + i + ")in arraylist");
            break a;
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter the  number for courses you want deleted  :");
        String str2 = input.nextLine().trim();
        b:
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCn().equals(str2)) ;
            students.remove(i);
            break b;
        }

    }
}

