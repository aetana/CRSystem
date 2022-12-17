package miu.edu.cr.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    private  Long id;
    private  String street;
    private String city;
    private String postalCode;
//    @Column(n00"state-province")
    private String state;
    @Column(name="country-region")
    private  String country;

}
