package se.sigmatechnology.codingdojo.usecase01.core;

/**
 * Immutable value object
 * @author rwe
 */
public class KnowledgeWithText implements Knowledge {

	private final String text;

	public KnowledgeWithText(String text) {
		this.text = text;
	}

	@Override
	public String asText() {
		return text;
	}
}
