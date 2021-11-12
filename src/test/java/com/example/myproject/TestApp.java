package com.example.myproject;

import com.google.common.base.CaseFormat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestApp {

    @Test
    public void contextLoad() {
        App app = new App();

        String greeting = CaseFormat.LOWER_UNDERSCORE.to(
                CaseFormat.UPPER_UNDERSCORE, "hello bazel");

        assertEquals("HELLO BAZEL", greeting);
    }
}
