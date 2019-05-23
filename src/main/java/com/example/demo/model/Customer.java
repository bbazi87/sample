package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Table(name = "Kunde")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Vorname")
    private String firstName;

    @Column(name = "Nachname")
    private String lastName;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @Column(name = "Bestellungen")
    private Set<Order> orderSet;

//    //leerer Konstruktor für Hibernate beim lesenden Zugriff zur Instanzierung (beim schreibenden Zugriff wird das nicht benötigt)
//    public Customer() {
//    }

   // public Customer(String firstName, String lastName) {
     //   this.firstName = firstName;
       // this.lastName = lastName;
    //}

/*    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }*/


}
