package com.ohgiraffers.api.string;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class StringProcess {
    public String preChar(String helloWorld) {

        helloWorld.substring(1,11); // 뒷부분
        char ch = helloWorld.charAt(0);
        ch = Character.toUpperCase(ch);


        return Character.toUpperCase(ch) + helloWorld.substring(1,11);


//        return helloWorld.replace("h","H");


    }

    public int charSu(String str, char c) {


        // 1. str로 받아온 문자열을 문자배열로 하나하나 분리

        // 2. 배열안에 있는 문자를 c 변수랑 비교해서 같으면 count가 1올라가게

        str.split("application car cable", -1);
        for(int i = 0; i < str.length(); i++){

            str.equals(c);

        }


        return
    }

    //- 메소드 작성 :
    //    1. `+preChar(String s)`
    //    : String 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
    //    2. `+charSu(String s, char ch)`
    //    : int 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성

}
