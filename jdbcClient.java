package com.tka.client;

 
import com.tka.dao.StudentDao;

public class jdbcClient {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.getAllStudents1(); // Calling the method to get all students
    }
}
