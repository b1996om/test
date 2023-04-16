package com.example.pro01.ex07;
//코틀린에서 자바의 static멤버 사용(1)

//자바의 Customer클래스
public class Customer {
    public static final String LEVEL = "BASIC"; //static 필드
    public static void login() { //static 메서드
        System.out.println("Login...");
    }
}
