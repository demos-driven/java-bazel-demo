package com.example.myproject;

import com.google.common.base.CaseFormat;

public class App {

    public static void main(String[] args) {
        String greeting = CaseFormat.LOWER_UNDERSCORE.to(
                CaseFormat.UPPER_UNDERSCORE, "hello bazel");

        System.out.println(greeting);
    }
}
