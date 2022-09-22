package com.example.mappingUpderstanding.repository;

import com.example.mappingUpderstanding.entities.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress,Long> {
}
