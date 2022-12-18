package miu.edu.app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
   private List<Student> studentList;
    @OneToMany
    private List<CourseOffering>courseOfferingList;
}
