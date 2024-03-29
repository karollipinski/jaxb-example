package net.atos.jaxbexample.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "Student")
@XmlType(propOrder = {
        "dob",
        "section",
        "firstName",
        "lastName"
      })
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String section;

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(IdAdapter.class)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @XmlElement(name = "birthDate")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
               + lastName + ", dob=" + dob + ", section=" + section + "]";
    }

}
