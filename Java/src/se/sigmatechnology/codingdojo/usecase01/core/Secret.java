package se.sigmatechnology.codingdojo.usecase01.core;

/**
 * Immutable value object
 * @author rwe
 */
public class Secret {

	private final Subject subject;
	private final Knowledge knowledge;
	
	public Secret(Subject subject, Knowledge knowledge) {
		this.subject = subject;
		this.knowledge = knowledge;
	}

	public boolean isOnSubject(Subject subject) {
		return this.subject.is(subject);
	}

	public Knowledge getKnowledge() {
		return knowledge;
	}
}
