package com.abdushukur.customer.entity;


import com.abdushukur.customer.enums.EnumStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(generator = "Customer")
    @SequenceGenerator(name="Customer", sequenceName = "CUSTOMER_ID_SEQ")
    private Long id;

    private String name;

    private String surname;

    private String username;

    private String password;

    private String phoneNumber;

    private String emailAddress;

    private Date birthDate;

    private EnumStatus status;



}
