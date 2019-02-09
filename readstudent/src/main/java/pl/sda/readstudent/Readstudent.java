package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Readstudent {
    public Readstudent() {
    }

    public void readstudent(){

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("studentlist.json");
        List<Student> studentslist = new ArrayList<Student>();

        System.out.println("------------------");
        try {
            //budujemy tabele obiektow typu Student z jsona
            Student[] jsonstudentlist = mapper.readValue(file,Student[].class);
            //budujemy liste obiektow typu Student
            studentslist = Arrays.asList(jsonstudentlist);
            System.out.println(" Printing students from json: ");
            for (Student s:studentslist
                 ) {System.out.println(s.getName() + " " + s.getLastname());
            }
            //System.out.println(studentslist);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------");
        List<String> studentAlist = studentslist.stream()
                .filter( f-> f.getName().contains("A"))
                .map(f-> f.getName() + " " + f.getLastname())
                .collect(Collectors.toList());

        System.out.println(" Printing A students from json: ");

        System.out.println(studentAlist);




    }
}
