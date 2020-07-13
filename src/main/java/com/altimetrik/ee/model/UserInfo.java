package com.altimetrik.ee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
}
