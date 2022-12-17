package miu.edu.cr.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseOffering {
    @Id
    @GeneratedValue
    private long id;
    private String code;
    private int availableSeat;
    private String initials;
    private int capacity;
    private int numberOfRegisteredStudents;

}
