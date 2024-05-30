package com.ohgiraffers.api.string;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class StringProcess {
    public String preChar(String str) {
        //- 메소드 작성 :
        //    1. `+preChar(String s)`
        //    : String 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
        //    2. `+charSu(String s, char ch)`
        //    : int 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성

        // 1. 매개변수 전달이 잘 되는지 확인
        System.out.println("hello world = " + str);
        // str = helloWorld
        char firstChar = str.charAt(0);
        System.out.println("firstChar = " + firstChar);

        // 첫 글자 대문자로 바꾸기
        // 1) 문자 -> 문자열
        String firstStr = Character.valueOf(firstChar).toString();
        //String firstStr2 = Character.toString(firstChar);
        // 2) UpperCase로 대문자로 바꾸기
        firstStr = firstStr.toUpperCase(); // H

        System.out.println("대문자로 바꾼 " + firstStr);

        // 첫 글자를 뺀 나머지 부분 subString 사용
        String remainStr = str.substring(1); // ello world
        System.out.println("substring한 결과 : " + remainStr);

        return firstStr + remainStr;



// substring 사용
//        helloWorld.substring(1,11); // 뒷부분
//        char ch = helloWorld.charAt(0);
//        ch = Character.toUpperCase(ch);
//
//
//        return Character.toUpperCase(ch) + helloWorld.substring(1,11);


// replace 사용
//        return helloWorld.replace("h","H");


    }

    public int charSu(String str, char ch) {


        // 1. str로 받아온 문자열을 문자배열로 하나하나 분리
        // 2. 배열안에 있는 문자를 c 변수랑 비교해서 같으면 count가 1올라가게

        System.out.println("매개변수로 넘어온 문자열 " + str);
        System.out.println("매개변수로 넘어온 문자 " + ch);

        // str = application car cable
        // ch = c
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if (ch == findChar) {
                count++;
            }
        }
//        System.out.println(count);

        return count;



//        int num = str.length();
//
//        str.split("application car cable", -1);
//        for(int i = 0; i < str.length(); i++){
//
//            if(str.charAt(i) == c){
//                return i;
//            }
//
//        }
//        return num;
    }



}
