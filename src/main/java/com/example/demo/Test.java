package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"test\"")
public class Test {

    @Id
    @Column(name = "column1", unique = true, nullable = false)
    private Integer column1;
    @Column(name = "column2",  nullable = true)
    private Integer column2;

    public Integer getColumn1() {
        return column1;
    }

    public void setColumn1(Integer column1) {
        this.column1 = column1;
    }

    public Integer getColumn2() {
        return column2;
    }

    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }
// Getters and setters
}
