package com.example.hospitaldatabase.Repository;

import com.example.hospitaldatabase.Entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NurseRepository extends JpaRepository<Nurse, Long>{




     @Query(value = "select * from nurse  where name =?1",nativeQuery = true)
     Nurse getByName(@Param("name") String name);

     @Query(value = "select *from nurse where salary =(select MAX(salary) from nurse)",nativeQuery = true)
    Nurse getNurseByHighestSalary();

     @Query(value = "select *from nurse where salary =(select Min(salary) from nurse)",nativeQuery = true)
    Nurse getNurseByLowestSalary();
}