package se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential;

import java.util.UUID;

// Value Object
public class ProductId {
    private final UUID id;

    public ProductId() { id = UUID.randomUUID(); }

    public ProductId(UUID id) {
        this.id = id;
    }
}
