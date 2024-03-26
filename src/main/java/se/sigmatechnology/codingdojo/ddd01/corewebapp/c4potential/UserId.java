package se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential;

import java.util.UUID;

// Value Object
public class UserId {
    private final UUID id;

    public UserId() { id = UUID.randomUUID(); }

    public UserId(UUID id) {
        this.id = id;
    }
}
