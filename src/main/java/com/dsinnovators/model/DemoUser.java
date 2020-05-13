package com.dsinnovators.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by A.A.MAMUN on 5/12/2020.
 */
@Entity
public class DemoUser {

    @Id
    private String email;
    private String password;

    public DemoUser(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
