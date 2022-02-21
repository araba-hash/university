import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static int s2 = 0;
    static int s3 = 0;
    private static ArrayList<Course> courses = new ArrayList<>();
    static Student student = new Student();

    public static void main(String[] args) {
        String ID = "";
//        System.out.println("Welcome !!!");
//        System.out.println("Please select one of the following options:");
//        System.out.println("    1. Add student");
//        System.out.println("    2. Delete student ");
//        System.out.println("    3. Set student attribute value");
//        System.out.println("    4. Get student attribute value");
//        System.out.println("    5. Add course  ");
//        System.out.println("    6. Get average student  ");
//        System.out.println("    7. Print ");
//        System.out.println("    8. Exit");
        b:
        while (true) {
            //System.out.print("Enter Selection: ");

            String selection = input.next();
            String str = selection.toLowerCase().substring(0, 3);
            switch (str) {
                case "new":
                    ID = input.next();
                    student.setId(ID);
                    System.out.println("(create a new student with ID :" + ID + ")\n");
                    break;
                case "delete":
//                    System.out.print("Enter the post index: ");
                    String index = input.nextLine();
                    for (Course course : courses) {
                        if (index.equals(course.getId()))
                            student.setName(null);
                        student.setMajor(null);
                        student.setBirthdate(null);
                        student.setId(null);
                        courses.remove(index);
                    }
                    System.out.println("(Delete the student with ID :" + index + ")");
                    break;
                case "set":
                    String ID0 = input.next();
                    String Str0 = input.next();
                    String Str = Str0.toLowerCase();

                    if (Str.equals("name")) {
                        String name = input.nextLine();
                        student.setName(name);
                        System.out.println("(set the name of student " + ID0 + " to " + "“" + name + "”)");
                    } else if (Str.equals("major")) {
                        String major = input.nextLine();
                        student.setMajor(major);
                        System.out.println("(set the major of student " + ID0 + " to " + "“" + major + "”)");
                    } else if (Str.equals("birthdate")) {
                        String birthdate = input.nextLine();
                        student.setBirthdate(birthdate);
                        System.out.println("(set the birthdate  of student " + ID0 + " to " + "“" + birthdate + "”)");
                    }
                    break;
                case "get":
                    ID0 = input.next();
                    Str0 = input.next();
                    Str = Str0.toLowerCase();

                    if (Str.equals("name")) {
                        int str1 = Integer.parseInt(ID0);
                        int str01 = Integer.parseInt(student.getId());
                        for (int i = 0; i <courses.size() ; i++) {
                            if (str1==str01)
                            ;
                        System.out.println("(display the name" + "“" + courses.get(i).getName() + "”)");
                        }
                    }
                    break;
                case "addCourse":
                    Course course = new Course();
                    ID0 = input.next();
                    String s1 = input.next();
                    course.setCn(s1);
                    courses.add(course);
                    System.out.println("(Add a new course with cn :"+ s1+" to the courses list for"+ ID0+")");
//                    System.out.println("how many course want to add ");
//                    int x =input.nextInt();
//                    for (int i = 0; i <x ; i++) {
//                    Course course =new Course();
//                    }
//                    addCourse();
                    break;
                case "setCourse":
                    ID0 = input.next();
                    s1 = input.next();
                    Str0 = input.next();
                    Str = Str0.toLowerCase();
                    if (Str.equals("ch")) {
                    int s2 = input.nextInt();
                        for (int i = 0; i <courses.size() ; i++) {
                        courses.get(i).setCh(Integer.toString(s2));
                        }
                        System.out.println("(Set the credit hours for"+ ID0 +"to"+ s2 +")");
                    } else if (Str.equals("grade")) {
                        int s2 = input.nextInt();
                        for (int i = 0; i <courses.size() ; i++) {
                            courses.get(i).setGrade(s2);
                        }
                        System.out.println("(set the grade to" + 93 + ")");
                    }
                    //String s1 = input.next();
                    //average();
                    break;
                case "getAverage":
                    //print();
                    double average = 1.0;
                    ID0 = input.next();
                    for (int i = 0; i <courses.size() ; i++) {
                        double str1 = Double.parseDouble(courses.get(i).getCh());
                        double countOfHour=0.0;
                          countOfHour=countOfHour+str1;
                          double s= courses.get(i).getGrade()*str1;
                          average=s/countOfHour*1.0;
                        System.out.println("Average  :  " + average);

                    }
                    break;
                case "print":
                    ID0 = input.next();
                    for (int i = 0; i <courses.size(); i++) {
                        System.out.println("ID :  " + courses.get(i).getId());
                        System.out.println("Name :  " + courses.get(i).getName());
                        System.out.println("Major  :  " + courses.get(i).getMajor());
                        System.out.println("Birthdate  :  " + courses.get(i).getBirthdate());
                        System.out.println("-----------------------------");
                    }
                    System.out.println("Cn\t\t  Credit Hours\t\t" + "      Grade");
                    for (int i = 0; i < courses.size(); i++) {

                        System.out.println(courses.get(i).getCh().trim() + "\t\t" + courses.get(i).getCn() +
                                "\t\t\t     " + courses.get(i).getGrade());

                    }
                    break ;
                case "quit":
                    System.out.println("GOODBYE");
                    System.exit(0);
                default:
                    System.out.println("unknown command");
            }

        }

    }
//
//    public static void addCourse() {
//        System.out.println("add a new course ");
//        Course course = new Course();
//        System.out.println("Enter number for this course ");
//        String s1 = input.nextLine().trim();
//        course.setCn(s1);
//        System.out.println("Enter number  of hour for this course ");
//        s2 = input.nextInt();
//        course.setCh(Integer.toString(s2));
//        System.out.println("Enter grade  for this course ");
//        s3 = input.nextInt();
//        input.nextLine();
//        course.setGrade(s3);
//        courses.add(course);
//    }
//
//    public static void average() {
//        double average = 1.0;
//        s2 = 0;
//        s3 = 0;
//        double y = 0.0;
//        y += s2 * 1.0;
//        double numerator = 0.0;
//        numerator += s2 * s3 * 1.0;
//        average = numerator / y;
//        System.out.println("Average  :  " + average);
//    }
//
//    public static void print() {
//        System.out.println("ID :  " + student.getId());
//        System.out.println("Name :  " + student.getName());
//        System.out.println("Major  :  " + student.getMajor());
//        System.out.println("Birthdate  :  " + student.getBirthdate());
//        System.out.println("-----------------------------");
//
//
//        System.out.println("Cn\t\t  Credit Hours\t\t" + "      Grade");
//        for (int i = 0; i < courses.size(); i++) {
//
//            System.out.println(courses.get(i).getCh().trim() + "\t\t" + courses.get(i).getCn() +
//                    "\t\t\t     " + courses.get(i).getGrade());
//        }
//
//    }
}
