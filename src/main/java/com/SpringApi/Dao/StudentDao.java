package com.SpringApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringApi.entities.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
