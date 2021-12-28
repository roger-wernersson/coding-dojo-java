package se.sigmatechnology.codingdojo.usecase01.usecases;

import se.sigmatechnology.codingdojo.usecase01.core.*;

/**
 * Use Case
 * @author rwe
 *
 */
public class TellAgent {

	private final AgentName agentName;
	private final Secret secret;
	
	public TellAgent(AgentName agentName, Secret secret) {
		this.agentName = agentName;
		this.secret = secret;
	}
	
	public void execute(AgentRepository repo) {
		Agent agent = repo.findByName(agentName);
		
		agent = agent.plusKnowledge(secret);
		
		repo.store(agent);
	}
}
