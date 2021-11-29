package se.sigmatechnology.codingdojo.usecase01.core;

/**
 * Immutable value object
 * @author rwe
 */
public interface Knowledge {

	static Knowledge NONE = new NoKnowledge();

	String asText();
}
