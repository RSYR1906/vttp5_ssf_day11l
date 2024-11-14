package sg.edu.nus.iss.vttp5a_day11l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.vttp5a_day11l.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students;

    public StudentController() {
        students = new ArrayList<>();
    }

    @GetMapping("/studentlist")
    public List<Student> getStudentList() throws ParseException {

        students = new ArrayList<>();

        String dob = "18 Dec 1999 10:25:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob);
        Long epochDob = dDob.getTime();

        Student s1 = new Student(1, "Damien", "Cumming", epochDob, "damien@nus.edu.sg", "25 HMKT 119615");
        Student s2 = new Student(1, "Jack", "Daniels", null, "jack@nus.edu.sg", "30 HMKT 119615");
        Student s3 = new Student(1, "Lily", "James", null, "lily@nus.edu.sg", "11 HMKT 119615");

        // Add students to the list
        students.add(s1);
        students.add(s2);
        students.add(s3);

        return students;
    }
}
