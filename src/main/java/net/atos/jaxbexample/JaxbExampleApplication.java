package net.atos.jaxbexample;

import net.atos.jaxbexample.model.Student;
import net.atos.jaxbexample.model.University;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JaxbExampleApplication {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        SpringApplication.run(JaxbExampleApplication.class, args);
        runJaxb();
    }

    private static final String XML_FILE = "file_example.xml";

    public static void runJaxb() throws JAXBException, FileNotFoundException {

        List<Student> students = new ArrayList<Student>();

        Student s1 = new Student();
        s1.setFirstName("Anna");
        s1.setLastName("Nowak");
        s1.setSection("Computer Science");
        s1.setDob(LocalDate.of(1956, 10, 1));
        s1.setId(1);
        students.add(s1);

        Student s2 = new Student();
        s2.setFirstName("Karol");
        s2.setLastName("Kowalski");
        s2.setSection("Physics");
        s2.setDob(LocalDate.of(1916, 3, 3));
        s2.setId(2);
        students.add(s2);

        Student s3 = new Student();
        s3.setFirstName("Zenon");
        s3.setLastName("Polny");
        s3.setSection("Computer Science");
        s3.setDob(LocalDate.of(1958, 11, 4));
        s3.setId(3);
        students.add(s3);

        University university = new University();
        university.setName("Uniwersytet Warszawski");
        university.setAddress("Polska");
        university.setStudents(students);

        // create JAXB context
        JAXBContext context = JAXBContext.newInstance(University.class);


    }

}
