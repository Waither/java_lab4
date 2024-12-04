package com.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMainMethodExecution() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{});
        });
    }
}
