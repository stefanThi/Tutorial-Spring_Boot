package de.oette.course.G04;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_id_seq")
    private Long company_Id = 1L;

    @OneToOne
    @JoinColumn(name = "fk_address")
    private Address address;
    @OneToMany
    private List<Client> clients = new ArrayList<>();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Long getId() {
        return company_Id;
    }

    public Company() {

    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
