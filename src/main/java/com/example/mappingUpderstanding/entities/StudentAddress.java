package com.example.mappingUpderstanding.entities;

import javax.persistence.*;

@Entity
@Table(name = "student_address")
public class StudentAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rollno")
    private StudentInformation student_id;

    public StudentAddress(){
    }

    public StudentAddress(String city,StudentInformation obj){
        super();
        this.student_id = obj;
        this.city = city;
    }

    public StudentAddress(Long id,String city,StudentInformation obj){
        super();
        this.student_id = obj;
        this.city = city;
        this.id = id;
    }

    public String getName() {
        return city;
    }

    public void setName(String name) {
        this.city = name;
    }

    public StudentInformation getStudent_id() {
        return student_id;
    }

    public void setStudent_id(StudentInformation student_id) {
        this.student_id = student_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
