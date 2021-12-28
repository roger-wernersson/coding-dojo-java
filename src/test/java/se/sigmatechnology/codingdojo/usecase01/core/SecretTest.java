package se.sigmatechnology.codingdojo.usecase01.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretTest {

    private static final Subject subject = new Subject("alias");

    @Test
    public void hasSecret() {
        Secret secret = new Secret(subject, null);

        assertTrue(secret.isOnSubject(subject), "has correct subject");
    }
}
