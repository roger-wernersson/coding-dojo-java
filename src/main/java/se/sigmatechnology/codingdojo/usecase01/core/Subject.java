package se.sigmatechnology.codingdojo.usecase01.core;

/**
 * Immutable value object
 * @author rwe
 */
public class Subject {

	private final String text;

	public Subject(String text) {
		this.text = text;
	}

	public boolean is(Subject other) {
		return text.equals(other.text);
	}
}
