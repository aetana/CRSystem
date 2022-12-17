package miu.edu.cr.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private String code;

}
