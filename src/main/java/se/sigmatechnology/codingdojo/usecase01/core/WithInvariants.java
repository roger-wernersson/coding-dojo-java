package se.sigmatechnology.codingdojo.usecase01.core;

abstract class WithInvariants {

    public final <T> T andValidateInvariants(T obj) {
        validateInvariants();
        return obj;
    }

    public abstract void validateInvariants();
}
