package com.ohgiraffers.section01.conditional;

public class Application1 {
    // 실행용 클래스
    public static void main(String[] args) {

        A_IF aIf = new A_IF();

        //aIf.testSimpleIfStatment(); // 단일 if문
        //aIf.testNestedIfStatement(); // 중첩 if문

        B_IfElse bIfElse = new B_IfElse();

        //bIfElse.testSimpleIfElseStatement(); // 단일 if-else문
        //bIfElse.testNestedIfElseStatement(); // 중첩 if-else문

        C_IfElseIf cIfElseIf = new C_IfElseIf();
        //cIfElseIf.testSimpleIfElseStatement();
        //cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();
        //dSwitch.testSimpleSwitchStatement();
        //dSwitch.testSwitchVendingMachine();
        //dSwitch.testNestedIfStatement();



    }
}
