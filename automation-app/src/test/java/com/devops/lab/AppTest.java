package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void verifySystemBottleneckValidation() {
        // Deliberately failing test for Lab 5
        assertFalse(true, "CRITICAL: System bottleneck or defect detected in value stream!");
    }
}
