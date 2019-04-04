package com.hisham.java8crud.dao;

import com.hisham.java8crud.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private List<Student> studentTableList;

    public StudentDao() {
        this.studentTableList = new ArrayList<Student>();
    }

    public void add(Student student){
        studentTableList.add(student);
    }

    public boolean update(Student student){
        return studentTableList.stream().map(storedStudent ->
                student.getId() == storedStudent.getId() ?  student : storedStudent)
                .findAny().isPresent();
    }

    public List<Student> getStudentTableList() {
        return studentTableList;
    }

    public Student getById(int id){
        return studentTableList.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }
}
