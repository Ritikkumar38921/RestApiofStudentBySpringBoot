package com.example.mappingUpderstanding.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student")
public class StudentInformation  {

//    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "roll_no")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollno;
    private String name;
    public StudentInformation(String name){
        this.name = name;
    }
    public StudentInformation(Long rn){
        this.rollno = rn;
    }

//    @OneToMany(cascade = CascadeType.ALL)
//    private Set<StudentAddress> ob;

    public StudentInformation(){

    }

    public StudentInformation(String name,Long rn){
        super();
        this.name = name;
        this.rollno = rn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getRollno() {
        return rollno;
    }

    public void setRollno(Long rollno) {
        this.rollno = rollno;
    }
}
