package st10259861_assignment1;

import java.util.ArrayList;
import java.util.Scanner;


public class ST10259861_Assignment1 {

    public static String id, email, name, course, age;
    public static Student s1;
    public static ArrayList<Student> studentDetails = new ArrayList<>();
    public static int counter;

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("STUDENT MANAGEMENT APPLICATION\n******************************\nEnter (1) to launch menu or any other key to exit");
        int launchKey = scan.nextInt();
        counter = 0;
        while (launchKey == 1) {
            counter++;
            System.out.println("Please select one of the following menu items:"
                    + "\n(1) Capture a new student."
                    + "\n(2) Search for a student."
                    + "\n(3) Delete a student."
                    + "\n(4) Print student report."
                    + "\n(5) Exit Application.");
            int selection = scan.nextInt();

            switch (selection) {
                case 1:
                    SaveStudent();
                    
                    break;

                case 2:
                    scan.nextLine();
                    System.out.println("Enter the student ID to search: ");
                    String searchID = scan.nextLine();
                    SearchStudent(searchID);
                    break;

                case 3:
                    DeleteStudent(studentDetails);
                    break;

                case 4:
                     StudentReport(studentDetails);
                    break;

                case 5:
                    System.exit(0); // Exit the application
                    break;

                default:
                    
                    System.out.println("Invalid selection. Please select a valid option.");
                    break;
            }
            System.out.println("Enter (1) to launch menu or any other key to exit");
            launchKey = scan.nextInt();
        }
    }

    public static void SaveStudent() {
        // Input student details and create a Student object
        System.out.println("CAPTURE A NEW STUDENT\n**********************");
        scan.nextLine(); // Consume newline
        System.out.print("Enter the student id: ");
        String id = scan.nextLine();
        System.out.print("Enter the student name: ");
        String name = scan.nextLine();
        System.out.print("Enter the student age: ");
        int age = scan.nextInt();
        
        while (age < 16) {
            System.out.print("You have entered an incorrect student age!!!\nPlease re-enter the student age: ");
            age = scan.nextInt();
           
        }
        scan.nextLine();
        System.out.print("Enter the student email: ");
        String email = scan.nextLine();
        System.out.print("Enter the student course: ");
        String course = scan.nextLine();

        // Create a Student object and add it to the list
        Student stud1 = new Student(id, name, age, email, course);
        studentDetails.add(stud1);

        System.out.println("You have successfully entered the student's details.");
    }

    public static void SearchStudent() {
        System.out.print("Enter the student id to search: ");
        String searchID = scan.next();

        boolean found = false;
        for (Student student : studentDetails) {
            if (searchID.equals(student.getId())) {
                System.out.println(student);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
        
    }

    public static void DeleteStudent(ArrayList<Student> studentDetails) {
    System.out.print("Enter the student ID to delete: ");
    String deleteID = scan.next(); 

    boolean found = false;
    for (int i = 0; i < studentDetails.size(); i++) {
        Student student = studentDetails.get(i);
        if (deleteID.equals(student.getId())) {
            System.out.println("Student found and deleted: " + student);
            studentDetails.remove(i); 
            found = true;
            break; 
        }
    }

    if (!found) {
        System.out.println("Student not found.");
    }
}

    public static void StudentReport(ArrayList<Student> studentDetails) {
    if (studentDetails.isEmpty()) {
        System.out.println("No students to display.");
    } else {
        System.out.println("STUDENT" + counter +"\n-------------------------------");
        for (Student student : studentDetails) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Student Email: " + student.getEmail());
            System.out.println("Student Course: " + student.getCourse());
            System.out.println("--------------------------------");
        }
    }
}

    

public static void ExitStudentApplication() {

    }

    public static Student SaveStudent(String studentId, String studentName, int studentAge, String studentEmail, String studentCourse) {

        SaveStudent();
        Student stud1 = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);
        studentDetails.add(stud1);

        return stud1;
    }
    
    public static Student SearchStudent(String studentId) {
    for (Student student : studentDetails) {
        if (studentId.equals(student.getId())) {
            System.out.println("Student found:");
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Student Email: " + student.getEmail());
            System.out.println("Student Course: " + student.getCourse());
            return student; 
        }
    }
    
    System.out.println("Student not found.");
    return null; 
    }
//Java Programming, Ninth Edition. In: Java Programming, Ninth Edition.
// Farrell, J., 2012.
// pp 1 - 406
}
