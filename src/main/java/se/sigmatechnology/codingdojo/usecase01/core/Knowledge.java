package se.sigmatechnology.codingdojo.usecase01.core;

/**
 * Immutable value object
 * @author rwe
 */
public interface Knowledge {

	Knowledge NONE = new NoKnowledge();

	String asText();
}
