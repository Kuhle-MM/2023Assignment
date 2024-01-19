
package st10259861_assignment1;

public class Student {
    private String id;
    private String email;
    private String name;
    private String course;
    private int age;
    
    public Student(String studentId, String studentName, int studentAge, String studentEmail, String studentCourse){
    
        id = studentId;
        email = studentEmail;
        name = studentName;
        age = studentAge;
        course = studentCourse;
        
    
    };
    
    public void setStudentDetails(){
        
    }

    public  String getId() {
        return id;
    }

    public  String getEmail() {
        return email;
    }

    public  String getName() {
        return name;
    }

    public  String getCourse() {
        return course;
    }

    public  int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Student ID: " + id + "\nStudent Name: " + name +"\nStudent Age: " + age + "\nStudent Email: " + email + "\nStudent Course: " + course;
    }
    
}
