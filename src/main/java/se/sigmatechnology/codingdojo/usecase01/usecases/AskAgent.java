package se.sigmatechnology.codingdojo.usecase01.usecases;

import se.sigmatechnology.codingdojo.usecase01.core.Agent;
import se.sigmatechnology.codingdojo.usecase01.core.AgentRepository;
import se.sigmatechnology.codingdojo.usecase01.core.Knowledge;
import se.sigmatechnology.codingdojo.usecase01.core.Subject;

/**
 * Use Case
 * @author rwe
 *
 */
public class AskAgent {

	private final String agentName;
	private final Subject subject;
	
	public AskAgent(String agentName, Subject subject) {
		this.agentName = agentName;
		this.subject = subject;
	}
	
	public Knowledge execute(AgentRepository repo) {
		Agent agent = repo.findByName(agentName);
		
		return agent.knowledgeFromSubject(subject);
	}
}
