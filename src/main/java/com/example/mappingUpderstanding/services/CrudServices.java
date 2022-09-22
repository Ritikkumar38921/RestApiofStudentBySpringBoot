package com.example.mappingUpderstanding.services;

import com.example.mappingUpderstanding.entities.StudentAddress;
import com.example.mappingUpderstanding.entities.StudentInformation;
import com.example.mappingUpderstanding.repository.StudentAddressRepository;
import com.example.mappingUpderstanding.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class CrudServices {

    @Autowired
    public StudentRepository repo;

    @Autowired
    public StudentAddressRepository adress;
//
    public void saveStudents(String name, Long rollno,String address){
        StudentInformation stu = new StudentInformation(name,rollno);
        StudentAddress add = new StudentAddress(rollno,address,stu);
        adress.save(add);
    }
//
    public StudentInformation getStudentByRollno(Long rn){
        StudentInformation student = repo.getStudentByRollno(rn);
        return student;
    }

    public List<StudentInformation> getStudentsByName(String name){
        List<StudentInformation> list = repo.getStudentsByName(name);
        return  list;
    }

    public StudentAddress getStudentAddressByRollno(Long rn){
        StudentAddress stud = repo.getStudentAddressByRollno(rn);
        return stud;
    }

}
