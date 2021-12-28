package se.sigmatechnology.codingdojo.usecase01.core;

/**
 * Immutable value object
 * @author rwe
 */
public class NoKnowledge implements Knowledge {

	public static Knowledge NONE = new NoKnowledge();
	
	NoKnowledge() {}

	@Override
	public String asText() {
		return "";
	}
}
