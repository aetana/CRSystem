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
public class RegistrationEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private LocalDate startDate;
    private  LocalDate endDate;
    //private boolean status;
    @OneToMany
    @JoinColumn
    private List<RegistrationGroup>registrationGroups;

}
