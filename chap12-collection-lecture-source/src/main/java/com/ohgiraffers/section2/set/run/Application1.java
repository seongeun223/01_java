package com.ohgiraffers.section2.set.run;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {

        /*
        * set 인터페이스를 구현한 set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null 값도 중복되지 않게 하나의  null만 저장)
        * */

        /*
        * HashSet클래스
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * Hash -> 해시 알고리즘을 사용해서 검색 속도가 빠르다는 장점이 있다.
        * */

        HashSet<String> hset = new HashSet<>();
        Set hset2 = new HashSet();
        //Collections hset3 = new HashSet();

        hset.add(new String("java"));
        hset.add("oracle");
        hset.add("jabc");
        hset.add("html");
        hset.add("css");

        // 저장 순서는 유지되지 않는다.
        System.out.println("hset : " + hset);

        hset.add("java");

        // 중복을 허용하지 않는다.
        System.out.println("hset : " + hset);
        System.out.println("저장된 객체 수 : " + hset.size());
        System.out.println("포함확인 : " + hset.contains("oracle"));
        
        /* 
        * 저장된 객체를 한 개씩 꺼내는 기능이 있다.
        * 반복문을 이용해서 연속 처리하는 방법
        * */
        
        // 1. toArray() 배열로 바꾸고 for문 사용
        Object[] arr = hset.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
            
        }
        // 2. iterator() 로 목록을 만들어서 연속 처리
        Iterator<String> iter = hset.iterator();
        
        while (iter.hasNext()) {
            System.out.println("iterator로 목록을 만들어 출력 = " + iter.next());
        }

        boolean result = hset.remove("oracle");
        System.out.println("지운 결과 : " + result);
        System.out.println("hser = " + hset);

        hset.clear();
        System.out.println("isEmpty : " + hset.isEmpty());
        System.out.println("hset = " + hset);
    }
}
