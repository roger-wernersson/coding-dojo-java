package se.sigmatechnology.codingdojo.usecase01.usecases;

import se.sigmatechnology.codingdojo.usecase01.core.*;

/**
 * Use Case
 * @author rwe
 *
 */
public class AskAgent {

	private final AgentName agentName;
	private final Subject subject;
	
	public AskAgent(AgentName agentName, Subject subject) {
		this.agentName = agentName;
		this.subject = subject;
	}
	
	public Knowledge execute(AgentRepository repo) {
		return repo
				.findByName(agentName)
				.knowledgeFromSubject(subject);
	}
}
