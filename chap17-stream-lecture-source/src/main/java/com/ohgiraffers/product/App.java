package com.ohgiraffers.product;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        // 문제별 메소드를 만들어서 작성하세요.
        List<Product> list = List.of(
                new Product("아이폰X", "apple", "전자기기류", 1000000),
                new Product("맥프로", "apple", "전자기기류", 6300000),
                new Product("베지밀", "정식품", "음료류", 1000000),
                new Product("파스타면", "de cecco", "식품류", 10000),
                new Product("LG G7", "LG", "전자기기", 700000),
                new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
                new Product("고양이", "베르나르베르베르", "도서", 15000),
                new Product("간다, 봐라", "법정스님", "도서", 8900),
                new Product("까페라떼", "디초코", "음료류", 4000),
                new Product("아포가토", "디초코", "디저트류", 4500)
        );


//        List<Product> products = Arrays.asList();
//        Stream<Product> test1 = products.stream();
//        test1.filter(Product -> Product.getCategory("전자기기류").equals(list)).toList();

        list.stream().filter(product -> product.getCategory().equals("전자기기류"))
                .forEach(System.out::println);

//        List<Product> productList = list;
//        Stream<Product> productStream = productList.stream()
//                .filter(Product -> Product.getCategory("전자기기류").equals(list));
//        System.out.println("productStream = " + productStream);




    }
//    public void test1(List<Product> list) {
//        List<String> productList = Arrays.asList(list.toString());
//        Stream<String> test1Stream = productList.stream();
//        test1Stream.map().forEach(System.out::println);
}


