package com.hisham.java8crud;

import com.hisham.java8crud.dao.StudentDao;
import com.hisham.java8crud.model.Student;

public class Main {

    public static void main(String [] args){
        StudentDao studentDao = new StudentDao();
        studentDao.add(new Student(1,"Hisham","Mohammed","1233"));
        studentDao.add(new Student(2,"John","Weed","1233"));
        studentDao.add(new Student(3,"Ahmed","Mohammed","1233"));
        studentDao.add(new Student(4,"Harry","Potter","1233"));

        System.out.println("Students are: ");
        studentDao.getStudentTableList().forEach(System.out::println);

        Student student = studentDao.getById(2);
        student.setLastName("Boyle");
        studentDao.update(student);
        System.out.println("User updated successfully");
        System.out.println("Students are: ");
        studentDao.getStudentTableList().forEach(System.out::println);
    }
}
