package com.example.mappingUpderstanding.controllers;

import com.example.mappingUpderstanding.entities.StudentAddress;
import com.example.mappingUpderstanding.entities.StudentInformation;
import com.example.mappingUpderstanding.services.CrudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public CrudServices service;

    @ResponseBody
    @GetMapping("/")
    public String homePage(){
        return "welcome to home page";
    }

    @GetMapping("/savestudent")
    public void saveStudents(@RequestParam("name") String name, @RequestParam("rollno") Long rollno,@RequestParam("address") String address){
        System.out.println("name : " + name);
        System.out.println("rollno : "+ rollno);
        System.out.println("address : "+ address);

        service.saveStudents(name,rollno,address);
    }

    @GetMapping("/student/{id}")
    public StudentInformation getStudentByRollno(@PathVariable("id") Long rn){
        StudentInformation s = service.getStudentByRollno(rn);
        if(s == null){
            throw  new Error("please fill correct values");
        }
            return s;
    }

    @GetMapping("/studentbyname/{name}")
    public List<StudentInformation> getStudentsByName(@PathVariable("name") String name){
            List<StudentInformation> list = service.getStudentsByName(name);
            return list;
    }

    @GetMapping("/studentaddress/{rn}")
    public StudentAddress getStudentAddressByRollno(@PathVariable("rn") Long rn){
        StudentAddress stu_add = service.getStudentAddressByRollno(rn);
        if(stu_add == null){
            throw new Error("please give correct information");
        }
        return stu_add;
    }
}
