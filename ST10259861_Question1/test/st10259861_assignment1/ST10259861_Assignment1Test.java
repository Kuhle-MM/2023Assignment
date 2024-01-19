/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10259861_assignment1;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class ST10259861_Assignment1Test {
    
    public ST10259861_Assignment1Test() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ST10259861_Assignment1.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveStudent_0args() {
        System.out.println("SaveStudent");
        ST10259861_Assignment1.SaveStudent();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchStudent_0args() {
        System.out.println("SearchStudent");
        ST10259861_Assignment1.SearchStudent();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteStudent() {
        System.out.println("DeleteStudent");
        ArrayList<Student> studentDetails = null;
        ST10259861_Assignment1.DeleteStudent(studentDetails);
        fail("The test case is a prototype.");
    }

    @Test
    public void testStudentReport() {
        System.out.println("StudentReport");
        ArrayList<Student> studentDetails = null;
        ST10259861_Assignment1.StudentReport(studentDetails);
        fail("The test case is a prototype.");
    }

    @Test
    public void testExitStudentApplication() {
        System.out.println("ExitStudentApplication");
        ST10259861_Assignment1.ExitStudentApplication();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveStudent_5args() {
        System.out.println("SaveStudent");
        String studentId = "";
        String studentName = "";
        int studentAge = 0;
        String studentEmail = "";
        String studentCourse = "";
        Student expResult = null;
        Student result = ST10259861_Assignment1.SaveStudent(studentId, studentName, studentAge, studentEmail, studentCourse);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchStudent_String() {
        System.out.println("SearchStudent");
        String studentId = "";
        Student expResult = null;
        Student result = ST10259861_Assignment1.SearchStudent(studentId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
