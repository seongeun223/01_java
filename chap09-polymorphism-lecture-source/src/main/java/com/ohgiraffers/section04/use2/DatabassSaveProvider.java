package com.ohgiraffers.section04.use2;

public class DatabassSaveProvider implements SaveProvider{

    @Override
    public boolean save(String data) {

        System.out.println("Databass에 저장 성공했습니다.");
        return true;


    }
}
