package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

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

        EmployeeDTO employeeDTO1 = new EmployeeDTO();
        employeeDTO1.getInformation();
        // EmployDTO 객체배열의 이름 : employeeDTOS
        EmployeeDTO[] employeeDTOS = new EmployeeDTO[10];

        employeeDTOS[0] = new EmployeeDTO("박보검", 26, 180.3, 72.0, 100000000, "영업부");
        employeeDTOS[1] = new EmployeeDTO("강동원", 38, 182.0, 76.0, 200000000, "기획부");

//        for(EmployeeDTO employeeDTO : employeeDTOS) {
//            System.out.println(employeeDTO);
//        }
        Scanner sc = new Scanner(System.in);

        int count = 2;
        String answer = "";
        while (true) {
            System.out.println("이름을 입력하세요.");
            String name = sc.next();
            System.out.println("나이를 입력하세요.");
            int age = sc.nextInt();
            System.out.println("키를 입력하세요.");
            Double height = sc.nextDouble();
            System.out.println("몸무게를 입력하세요.");
            Double weight = sc.nextDouble();
            System.out.println("급여를 입력하세요.");
            int salary = sc.nextInt();
            System.out.println("부서를 입력하세요");
            String dept = sc.next();

            EmployeeDTO employeeDTO = new EmployeeDTO(name, age,height,weight,salary,dept);

            System.out.println(employeeDTO);
            employeeDTOS[count] = employeeDTO;

            System.out.println(count);
            count++;

            if(count == 10){

                break;
            }

        }

        System.out.println(Arrays.toString(employeeDTOS));



        //[EmployeeDTO{
        // name=박보검 age=26 height=180.3 weight=72.0 salary=100000000, dept='영업부'
        // }, EmployeeDTO{name=강동원 age=38 height=182.0 weight=76.0 salary=200000000, dept='기획부'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }, EmployeeDTO{name=1 age=1 height=1.0 weight=1.0 salary=1, dept='1'
        // }]


    }


}
