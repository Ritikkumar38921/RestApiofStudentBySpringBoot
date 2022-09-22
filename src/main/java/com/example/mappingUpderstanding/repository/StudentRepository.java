package com.example.mappingUpderstanding.repository;

import com.example.mappingUpderstanding.entities.StudentAddress;
import com.example.mappingUpderstanding.entities.StudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentInformation,Long>{
//
    @Query(value = "select * from student s where s.roll_no = ?1",nativeQuery = true)
    public StudentInformation getStudentByRollno(Long rn);

    @Query(value = "select * from student s where s.name = ?1",nativeQuery = true)
    public List<StudentInformation> getStudentsByName(String name);

    @Query(value = "select * from student_address address where address.student_id = ?1",nativeQuery = true)
    public StudentAddress getStudentAddressByRollno(Long rn);
}
