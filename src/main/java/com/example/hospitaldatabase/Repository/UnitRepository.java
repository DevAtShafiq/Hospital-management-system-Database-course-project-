package com.example.hospitaldatabase.Repository;

import com.example.hospitaldatabase.Entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface UnitRepository extends JpaRepository<Unit, String>{

    @Transactional
    @Query(value = " delete d from doctor d where  ID= ?1 ",nativeQuery = true)
    void deleteByName(@Param("name") String name);

    @Query(value = "select * from unit where unit_name = ?1",nativeQuery = true)
    Unit getByUnitName(@Param("name") String name);
}