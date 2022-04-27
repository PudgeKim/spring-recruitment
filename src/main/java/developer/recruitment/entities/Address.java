package developer.recruitment.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@RequiredArgsConstructor @Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
