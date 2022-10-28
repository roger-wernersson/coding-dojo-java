package se.sigmatechnology.codingdojo.usecase01.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullAgentTest {

    @Test
    void validatesName() {
        assertThrows(AssertionError.class,
                () -> new FullAgent(null));
    }
}
