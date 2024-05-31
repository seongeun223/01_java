package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {

    private int age;
    private double height;
    private double weight;
    protected String name;

    public PersonDTO() {}

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    public String getInformation() {
        return "Person [name = " + name + ", age = " + age + ", height = " + height +
                ", weight = " + weight + "]";
    }

    }

