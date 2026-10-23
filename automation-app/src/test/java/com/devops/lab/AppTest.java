package com.devops.lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void verifySystemBottleneckValidation() {
    	org.junit.jupiter.api.Assertions.assertFalse(true, "CRITICAL: System bottleneck or defect detected in value stream!");
    }
}
