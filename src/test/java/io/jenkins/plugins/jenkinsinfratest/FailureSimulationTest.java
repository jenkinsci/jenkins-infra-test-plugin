package io.jenkins.plugins.jenkinsinfratest;

import org.junit.Test;

import static org.junit.Assert.fail;

public class FailureSimulationTest {

    @Test
    public void testFailureSimulation() {
        if (Boolean.getBoolean("simulateTestFailure")) {
            fail("Intentional test failure: -DsimulateTestFailure=true");
        }
    }
}
