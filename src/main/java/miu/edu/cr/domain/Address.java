package miu.edu.cr.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String street;
    private String city;
    private String postalCode;
    private String stateProvince;
    private String countryRegion;

}
