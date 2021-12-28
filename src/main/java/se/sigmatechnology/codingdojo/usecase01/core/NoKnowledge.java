package se.sigmatechnology.codingdojo.usecase01.core;

/**
 * Immutable value object
 * @author rwe
 */
public class NoKnowledge implements Knowledge {

	NoKnowledge() {}

	@Override
	public String asText() {
		return "";
	}
}
