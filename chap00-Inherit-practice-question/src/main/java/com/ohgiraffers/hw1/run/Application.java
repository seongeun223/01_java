package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

public class Application {
    public static void main(String[] args) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.getInformation();

        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.getInformation();
        StudentDTO[] studentDTOS = new StudentDTO[3];
        studentDTOS[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템학과");
        studentDTOS[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        studentDTOS[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
//
//        for(int i = 0; i < studentDTOS.length; i++); {
//
//        }
//        int[] iarr = {1,2,3,4,5};

        for(StudentDTO studentDTO : studentDTOS) {
            System.out.println(studentDTO);
        }




    }


}
