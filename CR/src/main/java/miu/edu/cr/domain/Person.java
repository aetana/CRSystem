package miu.edu.cr.domain;

import javax.persistence.*;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String  email;
    @ManyToOne
    private  Address homeAddress;
    @ManyToOne
    private  Address mailingAddress;

    public Person(Long id, String name, String email, Address homeAddress, Address mailingAddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.homeAddress = homeAddress;
        this.mailingAddress = mailingAddress;
    }

    public Person() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
