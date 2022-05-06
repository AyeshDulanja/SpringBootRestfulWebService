package com.ad.SpringBoot_Rest_lombok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ayesh","Dulanja");
    }

    @GetMapping("/students") //http://localhost:8080/students
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ayesh", "Dulanja"));
        students.add(new Student("Sarah", "Aguirre"));
        students.add(new Student("Calvin", "Rosario"));
        students.add(new Student("Anika", "Gates"));

        return students;
    }

    @GetMapping("/student/{fname}/{lname}") //http://localhost:8080/student/Ayesh/Dulanja
    public Student studentPathVariable(
            @PathVariable("fname") String fname,
            @PathVariable("lname") String lname){
        return new Student(fname, lname);
    }

    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "fname") String fname ,
            @RequestParam(name = "lname") String lname){
        return new Student(fname, lname);
    }
}
