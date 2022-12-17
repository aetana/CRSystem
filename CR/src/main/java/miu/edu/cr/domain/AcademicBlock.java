package miu.edu.cr.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AcademicBlock {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
