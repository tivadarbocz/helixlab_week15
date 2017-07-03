package hu.helixlab;

import hu.helixlab.model.Student;
import hu.helixlab.service.StudentService;

import java.util.List;


/**
 * Created by Admin on 2017.06.19..
 */
public class Main {


    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        // Create two Students
        /*studentService.create(1, "Alice", 22);     // Alice will get an id 1
        studentService.create(2, "Bob", 20);       // Bob will get an id 2
        studentService.create(3, "Charlie", 25);   // Charlie will get an id 3*/
        //Persistence.generateSchema("helixlab_jpa_pu", null);


        List<Student> students = studentService.readAll();
        for(Student s : students){
            System.out.println(s.toString());
        }
    }


}
