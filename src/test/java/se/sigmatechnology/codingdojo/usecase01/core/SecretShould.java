package se.sigmatechnology.codingdojo.usecase01.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretShould {

    private static final Subject subjectAlias = new Subject("alias");
    private static final Subject subjectName = new Subject("name");
    private static final Knowledge knowledgeMoon = new KnowledgeWithText("moon");
    private static final Knowledge knowledgeSun = new KnowledgeWithText("sun");

    @Test
    void haveCorrectSubject() {
        var secret = new Secret(subjectAlias, knowledgeMoon);

        assertTrue(secret.isOnSubject(subjectAlias), "is on right subject");
        assertFalse(secret.isOnSubject(subjectName), "is not on wrong subject");
    }

    @Test
    void haveKnowledge() {
        var secret = new Secret(subjectAlias, knowledgeMoon);

        assertEquals(knowledgeMoon, secret.getKnowledge());
        assertNotEquals(knowledgeSun, secret.getKnowledge());
    }
}
