package com.ohgiraffers.section04.sort;

public class Application1 {

    // 배열 ->
    public static void main(String[] args) {
        int[] array = { 5, 1, 3, 2, 4 };

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp;

        // num1의 값을 임시 저장
        temp = num1;

        // num2의 값 -> num1에 저장
        num1 = num2;

        num2 = temp;
        System.out.println("============= num1과 num2의 값 교환 ============");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] arr = {2, 1, 3};
        int temp2;

        // { 1, 2, 3 }
        temp2 = arr[0]; // temp에 2 저장
        arr[0] = arr[1]; // arr[0]에 값 1 저장
        arr[2] = temp2; // arr[1]에 값 2 저장

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
