package com.elearning.demo.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Modules {
    private long id;
    private int credit;
    private int coefficient;
    private double courshours;
    private double tdhours;
    private double tphours;
    private String name;
    private String lastname;
    private String email;

    public Modules(long id, int credit, int coefficient, double courshours, double tdhours, double tphours, String name, String lastname, String email) {
        this.id = id;
        this.credit = credit;
        this.coefficient = coefficient;
        this.courshours = courshours;
        this.tdhours = tdhours;
        this.tphours = tphours;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }
    public Modules(){

    }

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public double getCourshours() {
        return courshours;
    }

    public void setCourshours(double courshours) {
        this.courshours = courshours;
    }

    public double getTdhours() {
        return tdhours;
    }

    public void setTdhours(double tdhours) {
        this.tdhours = tdhours;
    }

    public double getTphours() {
        return tphours;
    }

    public void setTphours(double tphours) {
        this.tphours = tphours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "id=" + id +
                ", credit=" + credit +
                ", coefficient=" + coefficient +
                ", courshours=" + courshours +
                ", tdhours=" + tdhours +
                ", tphours=" + tphours +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

