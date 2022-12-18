package miu.edu.app.entity;
import javax.persistence.*;
import java.util.List;


@Entity
public class RegistrationGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String regGroup;
    @OneToMany
    @JoinColumn
    private List<AcademicBlock> academicBlockList;
    @OneToMany
    @JoinColumn
    private List<Student>students;


}
