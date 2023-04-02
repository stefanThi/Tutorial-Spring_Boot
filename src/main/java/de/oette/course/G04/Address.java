package de.oette.course.G04;


import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_id_seq")
    private Long address_id;

    @Column(name = "street_and_number")
    private String streetAndNumber = RandomStringUtils.randomAlphanumeric(10);

    @Column(name = "zip_code_and_city")
    private String zipCodeAndCity = RandomStringUtils.randomAlphanumeric(10);


    @Override
    public String toString() {
        return "Address{id=" + address_id + ", streetAndNumber='" + streetAndNumber + ", zipCodeAndCity='" + zipCodeAndCity + '}';
    }

    public Address() {

    }
}
