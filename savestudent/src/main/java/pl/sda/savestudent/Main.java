package pl.sda.savestudent;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;
import pl.sda.readstudent.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      List<Student> studentList = Arrays.asList(
            new Student("Alicja","Kowal",133215),
            new Student("Karol","Leszczyński",132123),
            new Student("Andrzej","Bogucki",132523),
            new Student("Karol","Kaczyśki",132193),
              new Student("Adam","Bąk",132128),
              new Student("Karol","Leszczyński",189113),
              new Student("Borys","Dębki",132129),
              new Student("Kamil","Kaczyśki",192193),
              new Student("Wacek","Bąk",112128),
              new Student("Asia","Leszczyński",174513),
              new Student("Zbyszek","Dębki",132129),
            new Student("Katarzyna","Dąbrowska",134521)
        );

        for (Student x:studentList) {
            System.out.println(x);  }

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("studentlist.json");


        try {
            mapper.writeValue(file,studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Readstudent rs = new Readstudent();
        rs.readstudent();

    }
}
