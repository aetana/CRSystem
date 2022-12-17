package miu.edu.cr.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class AcademicBlock {
    @Id
    @GeneratedValue
    private long id;
    private String code;
    private LocalDate startTime;
    private LocalDate endTime;
    private String semester;


}
