package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Table(name = "Bestellung")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Bestellnummer")
    private int orderNum;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    @JsonIgnore
    private Customer customer;

/*    public Order(int orderNum, Customer customer) {
        this.orderNum = orderNum;
        this.customer = customer;
    }*/
}
