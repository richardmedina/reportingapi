package com.aexp.reports.domain.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserOld {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_name", length = 1024)
    private String userName;

    @Column(name = "password", nullable = false, length = 1024)
    private String password;

    @Column(name = "first_name", length = 1024)
    private String firstName;

    @Column(name = "last_name", length = 1024)
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
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
    }

}