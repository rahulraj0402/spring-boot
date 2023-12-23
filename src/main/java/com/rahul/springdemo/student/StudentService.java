package com.rahul.springdemo.student;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;



@Service
public class StudentService {

    public List<Student> findAllStudents(){

        return List.of(
                new Student("rahul",
                        "raj",
                        LocalDate.now(),
                        "rahul3004rt@gmail.com",
                        24
                ),


                new Student("rohan"
                        , "raj"
                        , LocalDate.now()
                        , "rohanrahul@gmail.com"
                        ,20
                ),

                new Student("isha"
                        , "kedia"
                        , LocalDate.now()
                        , "isha@gmail.com"
                        ,24
                )




        );
    }

}
