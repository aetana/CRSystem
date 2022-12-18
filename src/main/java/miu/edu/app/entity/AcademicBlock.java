package miu.edu.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AcademicBlock {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String code;
    private String name;
    private String semester;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToMany
    @JoinTable
    private List<CourseOffering> courseOffering;


}
