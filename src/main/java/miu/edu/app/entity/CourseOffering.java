package miu.edu.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CourseOffering {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String courseCode;
    private int capacity;
    private int numberOfRegisteredStudents;
    private int availableSeats;
    private String initials;
    @OneToOne
    private Faculty faculty;
    @ManyToMany
    @JoinColumn
    private List<Course> courseList;
    @ManyToMany(mappedBy = "courseOffering")
    private List<AcademicBlock>academicBlockList;

    //private List<Student>students;



}
